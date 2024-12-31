// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.funktional.yggdrasil.URN.*
import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*
import munit.FunSuite

class URNTest extends FunSuite:

    def validNID: NID               = FormalNID("example")
    def validNSS: NSS               = NSS("namespace-specific-string")
    def validRComponent: RComponent = RComponent("r-component")
    def validQComponent: QComponent = QComponent("q-component")
    def validFragment: Fragment     = Fragment("fragment")

    def invalidNID: String = "invalid_nid"
    def invalidNSS: String = "invalid nss"

    def urnString: String = s"urn:$validNID:$validNSS?+$validRComponent?=$validQComponent#$validFragment"

    def urn: URN = URN(
      validNID,
      validNSS,
      Some(validRComponent),
      Some(validQComponent),
      Some(validFragment)
    )

    // Happy path tests
    test("fromStringsCreatesValidURN"):
        val result =
            URN.fromStrings(validNID, validNSS, Some(validRComponent), Some(validQComponent), Some(validFragment))
        assertEquals(result, Right(urn))

    test("parseValidURNString"):
        assertEquals(URN.parse(urnString), Right(urn))

    test("toStringReturnsCorrectURNString"):
        assertEquals(urn.toString, urnString)

    // Edge case tests
    test("fromStringsWithInvalidNID"):
        val result = URN.fromStrings(invalidNID, validNSS)
        assert(result.isLeft)

    test("fromStringsWithInvalidNSS"):
        val result = URN.fromStrings(validNID, invalidNSS)
        assert(result.isLeft)

    test("parseInvalidURNString"):
        val result = URN.parse("invalid:urn:string")
        assert(result.isLeft)

    test("fromStringsWithEmptyComponents"):
        val result = URN.fromStrings(validNID, validNSS, None, None, None)
        assertEquals(result, Right(URN(validNID, validNSS)))

    test("parseURNStringWithEmptyComponents"):
        val result = URN.parse(s"urn:$validNID:$validNSS")
        assertEquals(result, Right(URN(validNID, validNSS)))

    // Tests for RFC-8141 spec
    test("parseURNWithFormalNID"):
        val result = URN.parse("urn:example:namespace-specific-string")
        assertEquals(result, Right(URN(FormalNID("example"), NSS("namespace-specific-string"))))

    test("parseURNWithInformalNID"):
        val result = URN.parse("urn:urn-12345:namespace-specific-string")
        assertEquals(result, Right(URN(InformalNID("urn-12345"), NSS("namespace-specific-string"))))

    test("parseURNWithRComponent"):
        val result = URN.parse("urn:example:namespace-specific-string?+r-component")
        assertEquals(
          result,
          Right(URN(FormalNID("example"), NSS("namespace-specific-string"), Some(RComponent("r-component"))))
        )

    test("parseURNWithQComponent"):
        val result = URN.parse("urn:example:namespace-specific-string?=q-component")
        assertEquals(
          result,
          Right(URN(FormalNID("example"), NSS("namespace-specific-string"), None, Some(QComponent("q-component"))))
        )

    test("parseURNWithFragment"):
        val result = URN.parse("urn:example:namespace-specific-string#fragment")
        assertEquals(
          result,
          Right(URN(FormalNID("example"), NSS("namespace-specific-string"), None, None, Some(Fragment("fragment"))))
        )

    // Tests for URN equivalence as defined in RFC 8141
    test("urnEquivalenceWithCaseInsensitiveSchemeAndNID"):
        val urn1 = URN.parse("urn:example:a123,z456").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("URN:example:a123,z456").getOrElse(fail("Invalid URN"))
        val urn3 = URN.parse("urn:EXAMPLE:a123,z456").getOrElse(fail("Invalid URN"))
        assert(urn1.isEquivalentTo(urn2))
        assert(urn1.isEquivalentTo(urn3))
        assert(urn2.isEquivalentTo(urn3))

    test("urnEquivalenceIgnoringRComponentQComponentAndFragment"):
        val urn1 = URN.parse("urn:example:a123,z456").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("urn:example:a123,z456?+abc").getOrElse(fail("Invalid URN"))
        val urn3 = URN.parse("urn:example:a123,z456?=xyz").getOrElse(fail("Invalid URN"))
        val urn4 = URN.parse("urn:example:a123,z456#789").getOrElse(fail("Invalid URN"))
        assert(urn1.isEquivalentTo(urn2))
        assert(urn1.isEquivalentTo(urn3))
        assert(urn1.isEquivalentTo(urn4))

    test("urnNonEquivalenceWithDifferentNSSAfterSlash"):
        val urn1 = URN.parse("urn:example:a123,z456/foo").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("urn:example:a123,z456/bar").getOrElse(fail("Invalid URN"))
        val urn3 = URN.parse("urn:example:a123,z456/baz").getOrElse(fail("Invalid URN"))
        assert(!urn1.isEquivalentTo(urn2))
        assert(!urn1.isEquivalentTo(urn3))
        assert(!urn2.isEquivalentTo(urn3))

    test("urnEquivalenceWithPercentEncodedNSS"):
        val urn1 = URN.parse("urn:example:a123%2Cz456").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("URN:EXAMPLE:a123%2Cz456").getOrElse(fail("Invalid URN"))
        val urn3 = URN.parse("urn:example:a123%2cz456").getOrElse(fail("Invalid URN"))
        assert(urn1.isEquivalentTo(urn2))
        assert(urn1.isEquivalentTo(urn3))
        assert(urn2.isEquivalentTo(urn3))

    test("urnNonEquivalenceWithCaseSensitiveNSS"):
        val urn1 = URN.parse("urn:example:A123,z456").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("urn:example:a123,Z456").getOrElse(fail("Invalid URN"))
        assert(!urn1.isEquivalentTo(urn2))

    test("urnNonEquivalenceWithDifferentUnicodeCharacters"):
        val urn1 = URN.parse("urn:example:a123,z456").getOrElse(fail("Invalid URN"))
        val urn2 = URN.parse("urn:example:%D0%B0123,z456").getOrElse(fail("Invalid URN"))
        assert(!urn1.isEquivalentTo(urn2))
end URNTest
