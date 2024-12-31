// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

private type ISO3166_1_Alpha2Constraint =
    (FixedLength[2] & ForAll[UpperCase]) DescribedAs "ISO 3166-1 alpha-2 country code should be 2 uppercase characters"
opaque type ISO3166_1_Alpha2 <: String  = String :| ISO3166_1_Alpha2Constraint
object ISO3166_1_Alpha2 extends RefinedTypeOps[String, ISO3166_1_Alpha2Constraint, ISO3166_1_Alpha2]

private type ISO3166_1_Alpha3Constraint =
    (FixedLength[3] & ForAll[UpperCase]) DescribedAs "ISO 3166-1 alpha-3 country code should be 3 uppercase characters"
opaque type ISO3166_1_Alpha3 <: String  = String :| ISO3166_1_Alpha3Constraint
object ISO3166_1_Alpha3 extends RefinedTypeOps[String, ISO3166_1_Alpha3Constraint, ISO3166_1_Alpha3]

private type ISO3166_1_NumericConstraint =
    (FixedLength[3] & ForAll[Digit]) DescribedAs "ISO 3166-1 numeric country code should be 3 digits"
opaque type ISO3166_1_Numeric <: String  = String :| ISO3166_1_NumericConstraint
object ISO3166_1_Numeric extends RefinedTypeOps[String, ISO3166_1_NumericConstraint, ISO3166_1_Numeric]

private type Fips10_4Constraint =
    (FixedLength[2] & ForAll[UpperCase]) DescribedAs "FIPS 10-4 country code should be 2 uppercase characters"
opaque type Fips10_4 <: String  = String :| Fips10_4Constraint
object Fips10_4 extends RefinedTypeOps[String, Fips10_4Constraint, Fips10_4]

private type ISO3166_2Constraint =
    Match["""^[A-Z]{2}-[a-zA-Z0-9]{1,3}$"""] DescribedAs "ISO 3166-2 country subdivision code should be 2 uppercase characters, a hyphen and 1 to 3 uppercase characters or digits"
opaque type ISO3166_2 <: String  = String :| ISO3166_2Constraint
object ISO3166_2 extends RefinedTypeOps[String, ISO3166_2Constraint, ISO3166_2]

private type ISO639_1Constraint =
    (FixedLength[2] & ForAll[LowerCase]) DescribedAs "ISO 639-1 language code should be 2 lowercase characters"
opaque type ISO639_1 <: String  = String :| ISO639_1Constraint
object ISO639_1 extends RefinedTypeOps[String, ISO639_1Constraint, ISO639_1]

private type ISO639_2Constraint =
    (FixedLength[3] & ForAll[LowerCase]) DescribedAs "ISO 639-2 language code should be 3 lowercase characters"
opaque type ISO639_2 <: String  = String :| ISO639_2Constraint
object ISO639_2 extends RefinedTypeOps[String, ISO639_2Constraint, ISO639_2]

private type ISO639_3Constraint =
    (FixedLength[3] & ForAll[LowerCase]) DescribedAs "ISO 639-3 language code should be 3 lowercase characters"
opaque type ISO639_3 <: String  = String :| ISO639_3Constraint
object ISO639_3 extends RefinedTypeOps[String, ISO639_3Constraint, ISO639_3]

private type ISO4217Constraint =
    (FixedLength[3] & ForAll[UpperCase]) DescribedAs "ISO 4217 currency code should be 3 uppercase characters"
opaque type ISO4217 <: String  = String :| ISO4217Constraint
object ISO4217 extends RefinedTypeOps[String, ISO4217Constraint, ISO4217]

private type CcTLDConstraint =
    (FixedLength[2] & ForAll[LowerCase]) DescribedAs "Country code top-level domain should be 2 lowercase characters"
opaque type CcTLD <: String  = String :| CcTLDConstraint
object CcTLD extends RefinedTypeOps[String, CcTLDConstraint, CcTLD]

class Person
