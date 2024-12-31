// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.funktional.yggdrasil.URN.*
import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

/**
 * Represents a Uniform Resource Name (URN) as defined in RFC 8141.
 *
 * @param nid The Namespace Identifier (NID).
 * @param nss The Namespace Specific String (NSS).
 * @param rComponent Optional R-component of the URN.
 * @param qComponent Optional Q-component of the URN.
 * @param fragment Optional fragment of the URN.
 */
case class URN(
    nid: NID,
    nss: NSS,
    rComponent: Option[RComponent] = None,
    qComponent: Option[QComponent] = None,
    fragment: Option[Fragment] = None
) derives CanEqual:
    /**
     * Converts the URN to its string representation.
     *
     * @return The string representation of the URN.
     */
    override def toString: String =
        val rComponentStr = rComponent.fold("")(r => s"?+$r")
        val qComponentStr = qComponent.fold("")(q => s"?=$q")
        val fragmentStr   = fragment.fold("")(f => s"#$f")
        s"urn:$nid:$nss$rComponentStr$qComponentStr$fragmentStr"
    end toString

    /**
     * Checks if this URN is equivalent to another URN as defined in RFC 8141.
     *
     * @param other The other URN to compare with.
     * @return True if the URNs are equivalent, false otherwise.
     */
    def isEquivalentTo(other: URN): Boolean =
        def normalizeNSS(nss: String): String =
            val regex = "%[0-9a-fA-F]{2}".r
            regex.replaceAllIn(nss, _.matched.toUpperCase)

        this.nid.toLowerCase == other.nid.toLowerCase &&
        normalizeNSS(this.nss) == normalizeNSS(other.nss)
    end isEquivalentTo

end URN

object URN:
    /**
     * Creates a URN from string components.
     *
     * @param nid The Namespace Identifier (NID) as a string.
     * @param nss The Namespace Specific String (NSS) as a string.
     * @param rComponent Optional R-component as a string.
     * @param qComponent Optional Q-component as a string.
     * @param fComponent Optional fragment as a string.
     * @return Either an error message or the created URN.
     */
    def fromStrings(
        nid: String,
        nss: String,
        rComponent: Option[String] = None,
        qComponent: Option[String] = None,
        fComponent: Option[String] = None
    ): Either[String, URN] =
        for
            validNid        <- refineNID(nid)
            validNss        <- nss.refineEither[NSSConstraint]
            validRComponent <- rComponent match
                                   case Some(value) => value.refineEither[RComponentConstraint].map(Some(_))
                                   case None        => Right(None)
            validQComponent <- qComponent match
                                   case Some(value) => value.refineEither[QComponentConstraint].map(Some(_))
                                   case None        => Right(None)
            validFragment   <- fComponent match
                                   case Some(value) => value.refineEither[FragmentConstraint].map(Some(_))
                                   case None        => Right(None)
        yield URN(validNid, validNss, validRComponent, validQComponent, validFragment)

    /**
     * Refines the NID to either a FormalNID or InformalNID.
     *
     * @param nid The Namespace Identifier (NID) as a string.
     * @return Either an error message or the refined NID.
     */
    private def refineNID(nid: String): Either[String, FormalNID] =
        nid.refineEither[FormalNIDConstraint]
            .orElse(nid.refineEither[InformalNIDConstraint])
            .left.map(_ => s"Invalid NID: $nid does not comply with RFC 8141.")

    /**
     * Parses a URN from its string representation.
     *
     * @param input The URN as a string.
     * @return Either an error message or the parsed URN.
     */
    def parse(input: String): Either[String, URN] =
        val urnPattern = """^[uU][rR][nN]:([^:]+):([^?#]+)(\?\+[^?#]*)?(\?=[^#]*)?(#.*)?$""".r
        input match
            case urnPattern(nid, nss, rOpt, qOpt, fOpt) =>
                fromStrings(
                  nid,
                  nss,
                  Option(rOpt).map(_.stripPrefix("?+")),
                  Option(qOpt).map(_.stripPrefix("?=")),
                  Option(fOpt).map(_.stripPrefix("#"))
                )
            case _                                      => Left("Invalid URN format.")
        end match
    end parse

    // Type constraints and opaque types for URN components

    private type FormalNIDConstraint =
        Match["^(?![a-zA-Z]{2}-)(?![a-zA-Z]{2}--)(?!X-)[a-zA-Z0-9][a-zA-Z0-9-]{0,30}[a-zA-Z0-9]$"] DescribedAs "Formal NID should be 2 to 32 characters long and start with a letter or digit, followed by letters, digits or hyphens"
    opaque type FormalNID <: String  = String :| FormalNIDConstraint
    object FormalNID extends RefinedTypeOps[String, FormalNIDConstraint, FormalNID]

    type InformalNIDConstraint        =
        Match["^urn-[1-9][0-9]{0,27}$"] DescribedAs "Informal NID should be in the form of urn-<number>"
    opaque type InformalNID <: String = String :| InformalNIDConstraint
    object InformalNID extends RefinedTypeOps[String, InformalNIDConstraint, InformalNID]

    type NID = FormalNID | InformalNID

    private type NSSConstraint = Match[
      "^[a-zA-Z0-9()\\[\\]+,\\-.#&~:=@;$_!*%'][a-zA-Z0-9()\\[\\]+,\\-.#&~:=@;$_!*'/%]*$"
    ] DescribedAs "NSS should be a valid URN character sequence"
    opaque type NSS <: String  = String :| NSSConstraint
    object NSS extends RefinedTypeOps[String, NSSConstraint, NSS]

    private type RComponentConstraint = Match[
      """^[a-zA-Z0-9()\[\]+,\-.#&~:=@;$_!*'][a-zA-Z0-9()\[\]+,\-.#&~:=@;$_!*/?']*"""
    ] DescribedAs "R-component should be a valid URN character sequence"
    opaque type RComponent <: String  = String :| RComponentConstraint
    object RComponent extends RefinedTypeOps[String, RComponentConstraint, RComponent]

    private type QComponentConstraint = Match[
      """^[a-zA-Z0-9()\[\]+,\-.#&~:=@;$_!*'][a-zA-Z0-9()\[\]+,\-.#&~:=@;$_!*/?']*"""
    ] DescribedAs "Q-component should be a valid URN character sequence"
    opaque type QComponent <: String  = String :| QComponentConstraint
    object QComponent extends RefinedTypeOps[String, QComponentConstraint, QComponent]

    private type FragmentConstraint = Match[
      """^[a-zA-Z0-9()\[\]+,\-.#&~:=@;$_!*/?']+"""
    ] DescribedAs "Fragment should be a valid URN character sequence"
    opaque type Fragment <: String  = String :| FragmentConstraint
    object Fragment extends RefinedTypeOps[String, FragmentConstraint, Fragment]
end URN
