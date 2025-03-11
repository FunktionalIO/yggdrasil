# Yggdrasil

Yggdrasil is a Scala 3 library providing reference implementations of various data such as countries, currencies, and languages without any dependencies to pure-JVM libraries.

## Usage

### sbt

To include Yggdrasil in your project, add the following dependency to your `build.sbt`:

```scala
libraryDependencies += "io.funktional" %% "yggdrasil" % "<version>"
```

If you are compiling for non-JVM targets, you can use the cross-versioned dependency:

```scala
libraryDependencies += "io.funktional" %%% "yggdrasil" % "<version>"
```

### Mill

If you are using [Mill](https://mill-build,org/), add the following to your `build.sc`:

```scala
ivy"io.funktional::yggdrasil:<version>"
```

## Features

### Maybe

`Maybe` is a type that represents a value that may or may not be present. It is similar to `Option` in Scala's standard library but is closer to a zero-cost abstraction as no instances are created for the non-absent case.

```scala
import io.funktional.yggdrasil.Maybe

val foo: Maybe[String] = "foo"
val bar: Maybe[String] = Maybe.absent

println(foo.or("default value")) // "foo"
println(bar.or("default value")) // "default value"
```

### Refined Types

Yggdrasil provides refined types for standardised data such as:

- `ISO 3166-1` country codes
  - `ISO 3166-1 Alpha-2` codes
  - `ISO 3166-1 Alpha-3` codes
  - `ISO 3166-1 Numeric` codes
- `FIPS 10-4` country codes
- `UN M.49` region codes
- `ISO 3166-2` subdivision codes
- `ISO 4217` currency codes
- `ISO 639-1` language codes
- `ISO 639-2` language codes
- `ISO 639-3` language codes
- `ccTLD` (Country Code Top-Level Domains)


### Countries

Yggdrasil provides an enumeration of countries with their ISO 3166-1 codes, ccTLDs, and ISO 4217 currency codes. It also provides geographical data such as the continent and region (based on the UN M.49 standard).

```scala
import io.funktional.yggdrasil.Country.*

val germany = Germany
println(germany.name)       // "Germany"
println(germany.iso2)       // "DE"
println(germany.iso3)       // "DEU"
println(germany.isoNumeric) // 276
```

### Currencies

Yggdrasil provides an enumeration of currencies with their ISO 4217 codes, numeric codes, and minor units.

```scala
import io.funktional.yggdrasil.Currency.*

val euro = EUR
println(euro.name)        // "Euro"
println(euro.code)        // "EUR"
println(euro.numericCode) // 978
println(euro.minorUnits)  // 2
```

### Languages

Yggdrasil provides an enumeration of languages with their ISO 639-1 codes and English names.

```scala
import io.funktional.yggdrasil.Language.*

val lang = Chinese
println(lang.name)  // "Chinese"
println(lang.iso)   // "zh"
println(lang.iso2T) // "zho"
println(lang.iso2B) // "chi"
println(lang.iso3)  // "zho"
```

### URN

`URN` is a type that represents a Uniform Resource Name (URN) as defined in [RFC 2141](https://tools.ietf.org/html/rfc2141). It is a hierarchical identifier that is used to uniquely identify resources.

```scala
import io.funktional.yggdrasil.URN

val urn = URN.parse("urn:isbn:0451450523")
println(urn) // "urn:isbn:0451450523"
```

## License

This project is licensed under the [Eclipse Public License - v 2.0](https://www.eclipse.org/legal/epl-2.0/).