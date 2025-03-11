// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.github.iltotore.iron.*

/**
 * UN Geoscheme regions
 * 
 * @param code the ISO 3166-1/M49 numeric code of the region
 */
enum Region(val code: ISO3166_1_Numeric):
    case Africa     extends Region(ISO3166_1_Numeric("002"))
    case Antarctica extends Region(ISO3166_1_Numeric("010"))
    case Asia       extends Region(ISO3166_1_Numeric("142"))
    case Europe     extends Region(ISO3166_1_Numeric("150"))
    case Americas   extends Region(ISO3166_1_Numeric("019"))
    case Oceania    extends Region(ISO3166_1_Numeric("009"))
end Region

/**
 * UN Geoscheme sub-regions
 *
 * @param region the region this sub-region belongs to
 * @param code the ISO 3166-1/M49 numeric code of the sub-region
 */
enum SubRegion(val region: Region, val code: ISO3166_1_Numeric):
    // Africa
    case NorthernAfrica              extends SubRegion(Region.Africa, ISO3166_1_Numeric("015"))
    case SubSaharanAfrica            extends SubRegion(Region.Africa, ISO3166_1_Numeric("202"))
    // Americas
    case NorthernAmerica             extends SubRegion(Region.Americas, ISO3166_1_Numeric("021"))
    case LatinAmericaAndTheCaribbean extends SubRegion(Region.Americas, ISO3166_1_Numeric("419"))
    // Asia
    case CentralAsia                 extends SubRegion(Region.Asia, ISO3166_1_Numeric("143"))
    case EasternAsia                 extends SubRegion(Region.Asia, ISO3166_1_Numeric("030"))
    case SouthEasternAsia            extends SubRegion(Region.Asia, ISO3166_1_Numeric("035"))
    case SouthernAsia                extends SubRegion(Region.Asia, ISO3166_1_Numeric("034"))
    case WesternAsia                 extends SubRegion(Region.Asia, ISO3166_1_Numeric("145"))
    // Europe
    case EasternEurope               extends SubRegion(Region.Europe, ISO3166_1_Numeric("151"))
    case NorthernEurope              extends SubRegion(Region.Europe, ISO3166_1_Numeric("154"))
    case SouthernEurope              extends SubRegion(Region.Europe, ISO3166_1_Numeric("039"))
    case WesternEurope               extends SubRegion(Region.Europe, ISO3166_1_Numeric("155"))
    // Oceania
    case AustraliaAndNewZealand      extends SubRegion(Region.Oceania, ISO3166_1_Numeric("053"))
    case Melanesia                   extends SubRegion(Region.Oceania, ISO3166_1_Numeric("054"))
    case Micronesia                  extends SubRegion(Region.Oceania, ISO3166_1_Numeric("057"))
    case Polynesia                   extends SubRegion(Region.Oceania, ISO3166_1_Numeric("061"))
end SubRegion

/**
 * UN Geoscheme intermediate regions
 * 
 * @param subRegion the sub-region this intermediate region belongs to
 * @param code the ISO 3166-1/M49 numeric code of the intermediate region
 */
enum IntermediateRegion(val subRegion: SubRegion, val code: ISO3166_1_Numeric):
    case EasternAfrica  extends IntermediateRegion(SubRegion.SubSaharanAfrica, ISO3166_1_Numeric("014"))
    case MiddleAfrica   extends IntermediateRegion(SubRegion.SubSaharanAfrica, ISO3166_1_Numeric("017"))
    case SouthernAfrica extends IntermediateRegion(SubRegion.SubSaharanAfrica, ISO3166_1_Numeric("018"))
    case WesternAfrica  extends IntermediateRegion(SubRegion.SubSaharanAfrica, ISO3166_1_Numeric("011"))

    case Caribbean      extends IntermediateRegion(SubRegion.LatinAmericaAndTheCaribbean, ISO3166_1_Numeric("029"))
    case CentralAmerica extends IntermediateRegion(SubRegion.LatinAmericaAndTheCaribbean, ISO3166_1_Numeric("013"))
    case SouthAmerica   extends IntermediateRegion(SubRegion.LatinAmericaAndTheCaribbean, ISO3166_1_Numeric("005"))
end IntermediateRegion

/**
 * Countries as defined by the ISO 3166-1 standard
 * @param iso2 the ISO 3166-1 alpha-2 country code
 * @param iso3 the ISO 3166-1 alpha-3 country code
 * @param isoNumeric the ISO 3166-1 numeric country code. It also corresponds to the UN M49 numeric code
 * @param fips the FIPS 10-4 country code
 * @param name the english name of the country
 * @param capital the capital city of the country
 * @param region the continent the country belongs to
 *                  (according to the UN Geoscheme classification)
 *                  @see [[Region]]
 * @param subRegion the sub-region the country belongs to
 *                  (according to the UN Geoscheme classification)
 *                  @see [[SubRegion]]
 * @param intermediateRegion the intermediate region the country belongs to
 *                           (according to the UN Geoscheme classification)
 *                           @see [[IntermediateRegion]]
 * @param topLevelDomain the top-level domain of the country
 *                       (e.g. ".fr" for France)
 *                       @see [[CcTLD]]
 * @param Currency the currency of the country
 *                 @see [[Currency]]
 */
enum Country(
    val iso2: ISO3166_1_Alpha2,
    val iso3: ISO3166_1_Alpha3,
    val isoNumeric: Maybe[ISO3166_1_Numeric],
    val fips: Maybe[Fips10_4],
    val name: String,
    val capital: Maybe[String],
    val region: Region,
    val subRegion: Maybe[SubRegion] = Absent,
    val intermediateRegion: Maybe[IntermediateRegion] = Absent,
    val topLevelDomain: Maybe[CcTLD] = Absent,
    val Currency: Maybe[Currency] = Absent
):
    case Andorra extends Country(
          iso2 = ISO3166_1_Alpha2("AD"),
          iso3 = ISO3166_1_Alpha3("AND"),
          isoNumeric = ISO3166_1_Numeric("020"),
          fips = Fips10_4("AN"),
          name = "Andorra",
          capital = "Andorra la Vella",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ad"),
          Currency = Currency.EUR
        )

    case UnitedArabEmirates extends Country(
          iso2 = ISO3166_1_Alpha2("AE"),
          iso3 = ISO3166_1_Alpha3("ARE"),
          isoNumeric = ISO3166_1_Numeric("784"),
          fips = Fips10_4("AE"),
          name = "United Arab Emirates",
          capital = "Abu Dhabi",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ae"),
          Currency = Currency.AED
        )

    case Afghanistan extends Country(
          iso2 = ISO3166_1_Alpha2("AF"),
          iso3 = ISO3166_1_Alpha3("AFG"),
          isoNumeric = ISO3166_1_Numeric("004"),
          fips = Fips10_4("AF"),
          name = "Afghanistan",
          capital = "Kabul",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("af"),
          Currency = Currency.AFN
        )

    case AntiguaAndBarbuda extends Country(
          iso2 = ISO3166_1_Alpha2("AG"),
          iso3 = ISO3166_1_Alpha3("ATG"),
          isoNumeric = ISO3166_1_Numeric("028"),
          fips = Fips10_4("AC"),
          name = "Antigua and Barbuda",
          capital = "St. John's",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("ag"),
          Currency = Currency.XCD
        )

    case Anguilla extends Country(
          iso2 = ISO3166_1_Alpha2("AI"),
          iso3 = ISO3166_1_Alpha3("AIA"),
          isoNumeric = ISO3166_1_Numeric("660"),
          fips = Fips10_4("AV"),
          name = "Anguilla",
          capital = "The Valley",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("ai"),
          Currency = Currency.XCD
        )

    case Albania extends Country(
          iso2 = ISO3166_1_Alpha2("AL"),
          iso3 = ISO3166_1_Alpha3("ALB"),
          isoNumeric = ISO3166_1_Numeric("008"),
          fips = Fips10_4("AL"),
          name = "Albania",
          capital = "Tirana",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("al"),
          Currency = Currency.ALL
        )

    case Armenia extends Country(
          iso2 = ISO3166_1_Alpha2("AM"),
          iso3 = ISO3166_1_Alpha3("ARM"),
          isoNumeric = ISO3166_1_Numeric("051"),
          fips = Fips10_4("AM"),
          name = "Armenia",
          capital = "Yerevan",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("am"),
          Currency = Currency.AMD
        )

    case Angola extends Country(
          iso2 = ISO3166_1_Alpha2("AO"),
          iso3 = ISO3166_1_Alpha3("AGO"),
          isoNumeric = ISO3166_1_Numeric("024"),
          fips = Fips10_4("AO"),
          name = "Angola",
          capital = "Luanda",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("ao"),
          Currency = Currency.AOA
        )

    case Antarctica extends Country(
          iso2 = ISO3166_1_Alpha2("AQ"),
          iso3 = ISO3166_1_Alpha3("ATA"),
          isoNumeric = ISO3166_1_Numeric("010"),
          fips = Fips10_4("AY"),
          name = "Antarctica",
          capital = "",
          region = Region.Antarctica,
          subRegion = Absent,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("aq"),
          Currency = Absent
        )

    case Argentina extends Country(
          iso2 = ISO3166_1_Alpha2("AR"),
          iso3 = ISO3166_1_Alpha3("ARG"),
          isoNumeric = ISO3166_1_Numeric("032"),
          fips = Fips10_4("AR"),
          name = "Argentina",
          capital = "Buenos Aires",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("ar"),
          Currency = Currency.ARS
        )

    case AmericanSamoa extends Country(
          iso2 = ISO3166_1_Alpha2("AS"),
          iso3 = ISO3166_1_Alpha3("ASM"),
          isoNumeric = ISO3166_1_Numeric("016"),
          fips = Fips10_4("AQ"),
          name = "American Samoa",
          capital = "Pago Pago",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("as"),
          Currency = Currency.USD
        )

    case Austria extends Country(
          iso2 = ISO3166_1_Alpha2("AT"),
          iso3 = ISO3166_1_Alpha3("AUT"),
          isoNumeric = ISO3166_1_Numeric("040"),
          fips = Fips10_4("AU"),
          name = "Austria",
          capital = "Vienna",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("at"),
          Currency = Currency.EUR
        )

    case Australia extends Country(
          iso2 = ISO3166_1_Alpha2("AU"),
          iso3 = ISO3166_1_Alpha3("AUS"),
          isoNumeric = ISO3166_1_Numeric("036"),
          fips = Fips10_4("AS"),
          name = "Australia",
          capital = "Canberra",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("au"),
          Currency = Currency.AUD
        )

    case Aruba extends Country(
          iso2 = ISO3166_1_Alpha2("AW"),
          iso3 = ISO3166_1_Alpha3("ABW"),
          isoNumeric = ISO3166_1_Numeric("533"),
          fips = Fips10_4("AA"),
          name = "Aruba",
          capital = "Oranjestad",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("aw"),
          Currency = Currency.AWG
        )

    case AlandIslands extends Country(
          iso2 = ISO3166_1_Alpha2("AX"),
          iso3 = ISO3166_1_Alpha3("ALA"),
          isoNumeric = ISO3166_1_Numeric("248"),
          fips = Absent,
          name = "Aland Islands",
          capital = "Mariehamn",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ax"),
          Currency = Currency.EUR
        )
    case Azerbaijan   extends Country(
          iso2 = ISO3166_1_Alpha2("AZ"),
          iso3 = ISO3166_1_Alpha3("AZE"),
          isoNumeric = ISO3166_1_Numeric("031"),
          fips = Fips10_4("AJ"),
          name = "Azerbaijan",
          capital = "Baku",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("az"),
          Currency = Currency.AZN
        )

    case BosniaAndHerzegovina extends Country(
          iso2 = ISO3166_1_Alpha2("BA"),
          iso3 = ISO3166_1_Alpha3("BIH"),
          isoNumeric = ISO3166_1_Numeric("070"),
          fips = Fips10_4("BK"),
          name = "Bosnia and Herzegovina",
          capital = "Sarajevo",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ba"),
          Currency = Currency.BAM
        )

    case Barbados extends Country(
          iso2 = ISO3166_1_Alpha2("BB"),
          iso3 = ISO3166_1_Alpha3("BRB"),
          isoNumeric = ISO3166_1_Numeric("052"),
          fips = Fips10_4("BB"),
          name = "Barbados",
          capital = "Bridgetown",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("bb"),
          Currency = Currency.BBD
        )

    case Bangladesh extends Country(
          iso2 = ISO3166_1_Alpha2("BD"),
          iso3 = ISO3166_1_Alpha3("BGD"),
          isoNumeric = ISO3166_1_Numeric("050"),
          fips = Fips10_4("BG"),
          name = "Bangladesh",
          capital = "Dhaka",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("bd"),
          Currency = Currency.BDT
        )

    case Belgium extends Country(
          iso2 = ISO3166_1_Alpha2("BE"),
          iso3 = ISO3166_1_Alpha3("BEL"),
          isoNumeric = ISO3166_1_Numeric("056"),
          fips = Fips10_4("BE"),
          name = "Belgium",
          capital = "Brussels",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("be"),
          Currency = Currency.EUR
        )

    case BurkinaFaso extends Country(
          iso2 = ISO3166_1_Alpha2("BF"),
          iso3 = ISO3166_1_Alpha3("BFA"),
          isoNumeric = ISO3166_1_Numeric("854"),
          fips = Fips10_4("UV"),
          name = "Burkina Faso",
          capital = "Ouagadougou",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("bf"),
          Currency = Currency.XOF
        )

    case Bulgaria extends Country(
          iso2 = ISO3166_1_Alpha2("BG"),
          iso3 = ISO3166_1_Alpha3("BGR"),
          isoNumeric = ISO3166_1_Numeric("100"),
          fips = Fips10_4("BU"),
          name = "Bulgaria",
          capital = "Sofia",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("bg"),
          Currency = Currency.BGN
        )

    case Bahrain extends Country(
          iso2 = ISO3166_1_Alpha2("BH"),
          iso3 = ISO3166_1_Alpha3("BHR"),
          isoNumeric = ISO3166_1_Numeric("048"),
          fips = Fips10_4("BA"),
          name = "Bahrain",
          capital = "Manama",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("bh"),
          Currency = Currency.BHD
        )

    case Burundi extends Country(
          iso2 = ISO3166_1_Alpha2("BI"),
          iso3 = ISO3166_1_Alpha3("BDI"),
          isoNumeric = ISO3166_1_Numeric("108"),
          fips = Fips10_4("BY"),
          name = "Burundi",
          capital = "Gitega",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("bi"),
          Currency = Currency.BIF
        )

    case Benin extends Country(
          iso2 = ISO3166_1_Alpha2("BJ"),
          iso3 = ISO3166_1_Alpha3("BEN"),
          isoNumeric = ISO3166_1_Numeric("204"),
          fips = Fips10_4("BN"),
          name = "Benin",
          capital = "Porto-Novo",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("bj"),
          Currency = Currency.XOF
        )

    case SaintBarthelemy extends Country(
          iso2 = ISO3166_1_Alpha2("BL"),
          iso3 = ISO3166_1_Alpha3("BLM"),
          isoNumeric = ISO3166_1_Numeric("652"),
          fips = Fips10_4("TB"),
          name = "Saint Barthelemy",
          capital = "Gustavia",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("gp"),
          Currency = Currency.EUR
        )

    case Bermuda extends Country(
          iso2 = ISO3166_1_Alpha2("BM"),
          iso3 = ISO3166_1_Alpha3("BMU"),
          isoNumeric = ISO3166_1_Numeric("060"),
          fips = Fips10_4("BD"),
          name = "Bermuda",
          capital = "Hamilton",
          region = Region.Americas,
          subRegion = SubRegion.NorthernAmerica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("bm"),
          Currency = Currency.BMD
        )

    case Brunei extends Country(
          iso2 = ISO3166_1_Alpha2("BN"),
          iso3 = ISO3166_1_Alpha3("BRN"),
          isoNumeric = ISO3166_1_Numeric("096"),
          fips = Fips10_4("BX"),
          name = "Brunei Darussalam",
          capital = "Bandar Seri Begawan",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("bn"),
          Currency = Currency.BND
        )

    case Bolivia extends Country(
          iso2 = ISO3166_1_Alpha2("BO"),
          iso3 = ISO3166_1_Alpha3("BOL"),
          isoNumeric = ISO3166_1_Numeric("068"),
          fips = Fips10_4("BL"),
          name = "Bolivia (Plurinational State of)",
          capital = "Sucre",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("bo"),
          Currency = Currency.BOB
        )

    case BonaireSaintEustatiusAndSaba extends Country(
          iso2 = ISO3166_1_Alpha2("BQ"),
          iso3 = ISO3166_1_Alpha3("BES"),
          isoNumeric = ISO3166_1_Numeric("535"),
          fips = Absent,
          name = "Bonaire, Saint Eustatius and Saba ",
          capital = "",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("bq"),
          Currency = Currency.USD
        )

    case Brazil extends Country(
          iso2 = ISO3166_1_Alpha2("BR"),
          iso3 = ISO3166_1_Alpha3("BRA"),
          isoNumeric = ISO3166_1_Numeric("076"),
          fips = Fips10_4("BR"),
          name = "Brazil",
          capital = "Brasilia",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("br"),
          Currency = Currency.BRL
        )

    case Bahamas extends Country(
          iso2 = ISO3166_1_Alpha2("BS"),
          iso3 = ISO3166_1_Alpha3("BHS"),
          isoNumeric = ISO3166_1_Numeric("044"),
          fips = Fips10_4("BF"),
          name = "Bahamas",
          capital = "Nassau",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("bs"),
          Currency = Currency.BSD
        )

    case Bhutan extends Country(
          iso2 = ISO3166_1_Alpha2("BT"),
          iso3 = ISO3166_1_Alpha3("BTN"),
          isoNumeric = ISO3166_1_Numeric("064"),
          fips = Fips10_4("BT"),
          name = "Bhutan",
          capital = "Thimphu",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          topLevelDomain = CcTLD("bt"),
          Currency = Currency.BTN
        )

    case BouvetIsland extends Country(
          iso2 = ISO3166_1_Alpha2("BV"),
          iso3 = ISO3166_1_Alpha3("BVT"),
          isoNumeric = ISO3166_1_Numeric("074"),
          fips = Fips10_4("BV"),
          name = "Bouvet Island",
          capital = "",
          region = Region.Antarctica,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("bv"),
          Currency = Currency.NOK
        )

    case Botswana extends Country(
          iso2 = ISO3166_1_Alpha2("BW"),
          iso3 = ISO3166_1_Alpha3("BWA"),
          isoNumeric = ISO3166_1_Numeric("072"),
          fips = Fips10_4("BC"),
          name = "Botswana",
          capital = "Gaborone",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.SouthernAfrica,
          topLevelDomain = CcTLD("bw"),
          Currency = Currency.BWP
        )

    case Belarus extends Country(
          iso2 = ISO3166_1_Alpha2("BY"),
          iso3 = ISO3166_1_Alpha3("BLR"),
          isoNumeric = ISO3166_1_Numeric("112"),
          fips = Fips10_4("BO"),
          name = "Belarus",
          capital = "Minsk",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("by"),
          Currency = Currency.BYN
        )

    case Belize extends Country(
          iso2 = ISO3166_1_Alpha2("BZ"),
          iso3 = ISO3166_1_Alpha3("BLZ"),
          isoNumeric = ISO3166_1_Numeric("084"),
          fips = Fips10_4("BH"),
          name = "Belize",
          capital = "Belmopan",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("bz"),
          Currency = Currency.BZD
        )

    case Canada extends Country(
          iso2 = ISO3166_1_Alpha2("CA"),
          iso3 = ISO3166_1_Alpha3("CAN"),
          isoNumeric = ISO3166_1_Numeric("124"),
          fips = Fips10_4("CA"),
          name = "Canada",
          capital = "Ottawa",
          region = Region.Americas,
          subRegion = SubRegion.NorthernAmerica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ca"),
          Currency = Currency.CAD
        )

    case CocosIslands extends Country(
          iso2 = ISO3166_1_Alpha2("CC"),
          iso3 = ISO3166_1_Alpha3("CCK"),
          isoNumeric = ISO3166_1_Numeric("166"),
          fips = Fips10_4("CK"),
          name = "Cocos Islands",
          capital = "West Island",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("cc"),
          Currency = Currency.AUD
        )

    case DemocraticRepublicOfTheCongo extends Country(
          iso2 = ISO3166_1_Alpha2("CD"),
          iso3 = ISO3166_1_Alpha3("COD"),
          isoNumeric = ISO3166_1_Numeric("180"),
          fips = Fips10_4("CG"),
          name = "Democratic Republic of the Congo",
          capital = "Kinshasa",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("cd"),
          Currency = Currency.CDF
        )

    case CentralAfricanRepublic extends Country(
          iso2 = ISO3166_1_Alpha2("CF"),
          iso3 = ISO3166_1_Alpha3("CAF"),
          isoNumeric = ISO3166_1_Numeric("140"),
          fips = Fips10_4("CT"),
          name = "Central African Republic",
          capital = "Bangui",
          region = Region.Africa,
          subRegion = SubRegion.SouthernAsia,
          topLevelDomain = CcTLD("cf"),
          Currency = Currency.XAF
        )

    case RepublicOfTheCongo extends Country(
          iso2 = ISO3166_1_Alpha2("CG"),
          iso3 = ISO3166_1_Alpha3("COG"),
          isoNumeric = ISO3166_1_Numeric("178"),
          fips = Fips10_4("CF"),
          name = "Republic of the Congo",
          capital = "Brazzaville",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("cg"),
          Currency = Currency.XAF
        )

    case Switzerland extends Country(
          iso2 = ISO3166_1_Alpha2("CH"),
          iso3 = ISO3166_1_Alpha3("CHE"),
          isoNumeric = ISO3166_1_Numeric("756"),
          fips = Fips10_4("SZ"),
          name = "Switzerland",
          capital = "Bern",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ch"),
          Currency = Currency.CHF
        )

    case IvoryCoast extends Country(
          iso2 = ISO3166_1_Alpha2("CI"),
          iso3 = ISO3166_1_Alpha3("CIV"),
          isoNumeric = ISO3166_1_Numeric("384"),
          fips = Fips10_4("IV"),
          name = "Ivory Coast",
          capital = "Yamoussoukro",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("ci"),
          Currency = Currency.XOF
        )

    case CookIslands extends Country(
          iso2 = ISO3166_1_Alpha2("CK"),
          iso3 = ISO3166_1_Alpha3("COK"),
          isoNumeric = ISO3166_1_Numeric("184"),
          fips = Fips10_4("CW"),
          name = "Cook Islands",
          capital = "Avarua",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ck"),
          Currency = Currency.NZD
        )

    case Chile extends Country(
          iso2 = ISO3166_1_Alpha2("CL"),
          iso3 = ISO3166_1_Alpha3("CHL"),
          isoNumeric = ISO3166_1_Numeric("152"),
          fips = Fips10_4("CI"),
          name = "Chile",
          capital = "Santiago",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("cl"),
          Currency = Currency.CLP
        )

    case Cameroon extends Country(
          iso2 = ISO3166_1_Alpha2("CM"),
          iso3 = ISO3166_1_Alpha3("CMR"),
          isoNumeric = ISO3166_1_Numeric("120"),
          fips = Fips10_4("CM"),
          name = "Cameroon",
          capital = "Yaounde",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("cm"),
          Currency = Currency.XAF
        )

    case China extends Country(
          iso2 = ISO3166_1_Alpha2("CN"),
          iso3 = ISO3166_1_Alpha3("CHN"),
          isoNumeric = ISO3166_1_Numeric("156"),
          fips = Fips10_4("CH"),
          name = "China",
          capital = "Beijing",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("cn"),
          Currency = Currency.CNY
        )

    case Colombia extends Country(
          iso2 = ISO3166_1_Alpha2("CO"),
          iso3 = ISO3166_1_Alpha3("COL"),
          isoNumeric = ISO3166_1_Numeric("170"),
          fips = Fips10_4("CO"),
          name = "Colombia",
          capital = "Bogota",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("co"),
          Currency = Currency.COP
        )

    case CostaRica extends Country(
          iso2 = ISO3166_1_Alpha2("CR"),
          iso3 = ISO3166_1_Alpha3("CRI"),
          isoNumeric = ISO3166_1_Numeric("188"),
          fips = Fips10_4("CS"),
          name = "Costa Rica",
          capital = "San Jose",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("cr"),
          Currency = Currency.CRC
        )

    case Cuba extends Country(
          iso2 = ISO3166_1_Alpha2("CU"),
          iso3 = ISO3166_1_Alpha3("CUB"),
          isoNumeric = ISO3166_1_Numeric("192"),
          fips = Fips10_4("CU"),
          name = "Cuba",
          capital = "Havana",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("cu"),
          Currency = Currency.CUP
        )

    case CaboVerde extends Country(
          iso2 = ISO3166_1_Alpha2("CV"),
          iso3 = ISO3166_1_Alpha3("CPV"),
          isoNumeric = ISO3166_1_Numeric("132"),
          fips = Fips10_4("CV"),
          name = "Cabo Verde",
          capital = "Praia",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("cv"),
          Currency = Currency.CVE
        )

    case Curacao extends Country(
          iso2 = ISO3166_1_Alpha2("CW"),
          iso3 = ISO3166_1_Alpha3("CUW"),
          isoNumeric = ISO3166_1_Numeric("531"),
          fips = Fips10_4("UC"),
          name = "Curacao",
          capital = " Willemstad",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("cw"),
          Currency = Currency.ANG
        )

    case ChristmasIsland extends Country(
          iso2 = ISO3166_1_Alpha2("CX"),
          iso3 = ISO3166_1_Alpha3("CXR"),
          isoNumeric = ISO3166_1_Numeric("162"),
          fips = Fips10_4("KT"),
          name = "Christmas Island",
          capital = "Flying Fish Cove",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("cx"),
          Currency = Currency.AUD
        )

    case Cyprus extends Country(
          iso2 = ISO3166_1_Alpha2("CY"),
          iso3 = ISO3166_1_Alpha3("CYP"),
          isoNumeric = ISO3166_1_Numeric("196"),
          fips = Fips10_4("CY"),
          name = "Cyprus",
          capital = "Nicosia",
          region = Region.Europe,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("cy"),
          Currency = Currency.EUR
        )

    case Czechia extends Country(
          iso2 = ISO3166_1_Alpha2("CZ"),
          iso3 = ISO3166_1_Alpha3("CZE"),
          isoNumeric = ISO3166_1_Numeric("203"),
          fips = Fips10_4("EZ"),
          name = "Czechia",
          capital = "Prague",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("cz"),
          Currency = Currency.CZK
        )

    case Germany extends Country(
          iso2 = ISO3166_1_Alpha2("DE"),
          iso3 = ISO3166_1_Alpha3("DEU"),
          isoNumeric = ISO3166_1_Numeric("276"),
          fips = Fips10_4("GM"),
          name = "Germany",
          capital = "Berlin",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("de"),
          Currency = Currency.EUR
        )

    case Djibouti extends Country(
          iso2 = ISO3166_1_Alpha2("DJ"),
          iso3 = ISO3166_1_Alpha3("DJI"),
          isoNumeric = ISO3166_1_Numeric("262"),
          fips = Fips10_4("DJ"),
          name = "Djibouti",
          capital = "Djibouti",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("dj"),
          Currency = Currency.DJF
        )

    case Denmark extends Country(
          iso2 = ISO3166_1_Alpha2("DK"),
          iso3 = ISO3166_1_Alpha3("DNK"),
          isoNumeric = ISO3166_1_Numeric("208"),
          fips = Fips10_4("DA"),
          name = "Denmark",
          capital = "Copenhagen",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("dk"),
          Currency = Currency.DKK
        )

    case Dominica extends Country(
          iso2 = ISO3166_1_Alpha2("DM"),
          iso3 = ISO3166_1_Alpha3("DMA"),
          isoNumeric = ISO3166_1_Numeric("212"),
          fips = Fips10_4("DO"),
          name = "Dominica",
          capital = "Roseau",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("dm"),
          Currency = Currency.XCD
        )

    case DominicanRepublic extends Country(
          iso2 = ISO3166_1_Alpha2("DO"),
          iso3 = ISO3166_1_Alpha3("DOM"),
          isoNumeric = ISO3166_1_Numeric("214"),
          fips = Fips10_4("DR"),
          name = "Dominican Republic",
          capital = "Santo Domingo",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("do"),
          Currency = Currency.DOP
        )

    case Algeria extends Country(
          iso2 = ISO3166_1_Alpha2("DZ"),
          iso3 = ISO3166_1_Alpha3("DZA"),
          isoNumeric = ISO3166_1_Numeric("012"),
          fips = Fips10_4("AG"),
          name = "Algeria",
          capital = "Algiers",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("dz"),
          Currency = Currency.DZD
        )

    case Ecuador extends Country(
          iso2 = ISO3166_1_Alpha2("EC"),
          iso3 = ISO3166_1_Alpha3("ECU"),
          isoNumeric = ISO3166_1_Numeric("218"),
          fips = Fips10_4("EC"),
          name = "Ecuador",
          capital = "Quito",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("ec"),
          Currency = Currency.USD
        )

    case Estonia extends Country(
          iso2 = ISO3166_1_Alpha2("EE"),
          iso3 = ISO3166_1_Alpha3("EST"),
          isoNumeric = ISO3166_1_Numeric("233"),
          fips = Fips10_4("EN"),
          name = "Estonia",
          capital = "Tallinn",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ee"),
          Currency = Currency.EUR
        )

    case Egypt extends Country(
          iso2 = ISO3166_1_Alpha2("EG"),
          iso3 = ISO3166_1_Alpha3("EGY"),
          isoNumeric = ISO3166_1_Numeric("818"),
          fips = Fips10_4("EG"),
          name = "Egypt",
          capital = "Cairo",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("eg"),
          Currency = Currency.EGP
        )

    case WesternSahara extends Country(
          iso2 = ISO3166_1_Alpha2("EH"),
          iso3 = ISO3166_1_Alpha3("ESH"),
          isoNumeric = ISO3166_1_Numeric("732"),
          fips = Fips10_4("WI"),
          name = "Western Sahara",
          capital = "El-Aaiun",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("eh"),
          Currency = Currency.MAD
        )

    case Eritrea extends Country(
          iso2 = ISO3166_1_Alpha2("ER"),
          iso3 = ISO3166_1_Alpha3("ERI"),
          isoNumeric = ISO3166_1_Numeric("232"),
          fips = Fips10_4("ER"),
          name = "Eritrea",
          capital = "Asmara",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("er"),
          Currency = Currency.ERN
        )

    case Spain extends Country(
          iso2 = ISO3166_1_Alpha2("ES"),
          iso3 = ISO3166_1_Alpha3("ESP"),
          isoNumeric = ISO3166_1_Numeric("724"),
          fips = Fips10_4("SP"),
          name = "Spain",
          capital = "Madrid",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("es"),
          Currency = Currency.EUR
        )

    case Ethiopia extends Country(
          iso2 = ISO3166_1_Alpha2("ET"),
          iso3 = ISO3166_1_Alpha3("ETH"),
          isoNumeric = ISO3166_1_Numeric("231"),
          fips = Fips10_4("ET"),
          name = "Ethiopia",
          capital = "Addis Ababa",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("et"),
          Currency = Currency.ETB
        )

    case Finland extends Country(
          iso2 = ISO3166_1_Alpha2("FI"),
          iso3 = ISO3166_1_Alpha3("FIN"),
          isoNumeric = ISO3166_1_Numeric("246"),
          fips = Fips10_4("FI"),
          name = "Finland",
          capital = "Helsinki",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          topLevelDomain = CcTLD("fi"),
          Currency = Currency.EUR
        )

    case Fiji extends Country(
          iso2 = ISO3166_1_Alpha2("FJ"),
          iso3 = ISO3166_1_Alpha3("FJI"),
          isoNumeric = ISO3166_1_Numeric("242"),
          fips = Fips10_4("FJ"),
          name = "Fiji",
          capital = "Suva",
          region = Region.Oceania,
          subRegion = SubRegion.Melanesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("fj"),
          Currency = Currency.FJD
        )

    case FalklandIslands extends Country(
          iso2 = ISO3166_1_Alpha2("FK"),
          iso3 = ISO3166_1_Alpha3("FLK"),
          isoNumeric = ISO3166_1_Numeric("238"),
          fips = Fips10_4("FK"),
          name = "Falkland Islands (Malvinas)",
          capital = "Stanley",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("fk"),
          Currency = Currency.FKP
        )

    case Micronesia extends Country(
          iso2 = ISO3166_1_Alpha2("FM"),
          iso3 = ISO3166_1_Alpha3("FSM"),
          isoNumeric = ISO3166_1_Numeric("583"),
          fips = Fips10_4("FM"),
          name = "Micronesia (Federated States of)",
          capital = "Palikir",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("fm"),
          Currency = Currency.USD
        )

    case FaroeIslands extends Country(
          iso2 = ISO3166_1_Alpha2("FO"),
          iso3 = ISO3166_1_Alpha3("FRO"),
          isoNumeric = ISO3166_1_Numeric("234"),
          fips = Fips10_4("FO"),
          name = "Faroe Islands",
          capital = "Torshavn",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("fo"),
          Currency = Currency.DKK
        )

    case France extends Country(
          iso2 = ISO3166_1_Alpha2("FR"),
          iso3 = ISO3166_1_Alpha3("FRA"),
          isoNumeric = ISO3166_1_Numeric("250"),
          fips = Fips10_4("FR"),
          name = "France",
          capital = "Paris",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("fr"),
          Currency = Currency.EUR
        )

    case Gabon extends Country(
          iso2 = ISO3166_1_Alpha2("GA"),
          iso3 = ISO3166_1_Alpha3("GAB"),
          isoNumeric = ISO3166_1_Numeric("266"),
          fips = Fips10_4("GB"),
          name = "Gabon",
          capital = "Libreville",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("ga"),
          Currency = Currency.XAF
        )

    case UnitedKingdom extends Country(
          iso2 = ISO3166_1_Alpha2("GB"),
          iso3 = ISO3166_1_Alpha3("GBR"),
          isoNumeric = ISO3166_1_Numeric("826"),
          fips = Fips10_4("UK"),
          name = "United Kingdom of Great Britain and Northern Ireland",
          capital = "London",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("uk"),
          Currency = Currency.GBP
        )

    case Grenada extends Country(
          iso2 = ISO3166_1_Alpha2("GD"),
          iso3 = ISO3166_1_Alpha3("GRD"),
          isoNumeric = ISO3166_1_Numeric("308"),
          fips = Fips10_4("GJ"),
          name = "Grenada",
          capital = "St. George's",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("gd"),
          Currency = Currency.XCD
        )

    case Georgia extends Country(
          iso2 = ISO3166_1_Alpha2("GE"),
          iso3 = ISO3166_1_Alpha3("GEO"),
          isoNumeric = ISO3166_1_Numeric("268"),
          fips = Fips10_4("GG"),
          name = "Georgia",
          capital = "Tbilisi",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ge"),
          Currency = Currency.GEL
        )

    case FrenchGuiana extends Country(
          iso2 = ISO3166_1_Alpha2("GF"),
          iso3 = ISO3166_1_Alpha3("GUF"),
          isoNumeric = ISO3166_1_Numeric("254"),
          fips = Fips10_4("FG"),
          name = "French Guiana",
          capital = "Cayenne",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("gf"),
          Currency = Currency.EUR
        )

    case Guernsey extends Country(
          iso2 = ISO3166_1_Alpha2("GG"),
          iso3 = ISO3166_1_Alpha3("GGY"),
          isoNumeric = ISO3166_1_Numeric("831"),
          fips = Fips10_4("GK"),
          name = "Guernsey",
          capital = "St Peter Port",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("gg"),
          Currency = Currency.GBP
        )

    case Ghana extends Country(
          iso2 = ISO3166_1_Alpha2("GH"),
          iso3 = ISO3166_1_Alpha3("GHA"),
          isoNumeric = ISO3166_1_Numeric("288"),
          fips = Fips10_4("GH"),
          name = "Ghana",
          capital = "Accra",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("gh"),
          Currency = Currency.GHS
        )

    case Gibraltar extends Country(
          iso2 = ISO3166_1_Alpha2("GI"),
          iso3 = ISO3166_1_Alpha3("GIB"),
          isoNumeric = ISO3166_1_Numeric("292"),
          fips = Fips10_4("GI"),
          name = "Gibraltar",
          capital = "Gibraltar",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("gi"),
          Currency = Currency.GIP
        )

    case Greenland extends Country(
          iso2 = ISO3166_1_Alpha2("GL"),
          iso3 = ISO3166_1_Alpha3("GRL"),
          isoNumeric = ISO3166_1_Numeric("304"),
          fips = Fips10_4("GL"),
          name = "Greenland",
          capital = "Nuuk",
          region = Region.Americas,
          subRegion = SubRegion.NorthernAmerica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("gl"),
          Currency = Currency.DKK
        )

    case Gambia extends Country(
          iso2 = ISO3166_1_Alpha2("GM"),
          iso3 = ISO3166_1_Alpha3("GMB"),
          isoNumeric = ISO3166_1_Numeric("270"),
          fips = Fips10_4("GA"),
          name = "Gambia",
          capital = "Banjul",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("gm"),
          Currency = Currency.GMD
        )

    case Guinea extends Country(
          iso2 = ISO3166_1_Alpha2("GN"),
          iso3 = ISO3166_1_Alpha3("GIN"),
          isoNumeric = ISO3166_1_Numeric("324"),
          fips = Fips10_4("GV"),
          name = "Guinea",
          capital = "Conakry",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("gn"),
          Currency = Currency.GNF
        )

    case Guadeloupe extends Country(
          iso2 = ISO3166_1_Alpha2("GP"),
          iso3 = ISO3166_1_Alpha3("GLP"),
          isoNumeric = ISO3166_1_Numeric("312"),
          fips = Fips10_4("GP"),
          name = "Guadeloupe",
          capital = "Basse-Terre",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("gp"),
          Currency = Currency.EUR
        )

    case EquatorialGuinea extends Country(
          iso2 = ISO3166_1_Alpha2("GQ"),
          iso3 = ISO3166_1_Alpha3("GNQ"),
          isoNumeric = ISO3166_1_Numeric("226"),
          fips = Fips10_4("EK"),
          name = "Equatorial Guinea",
          capital = "Malabo",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("gq"),
          Currency = Currency.XAF
        )

    case Greece extends Country(
          iso2 = ISO3166_1_Alpha2("GR"),
          iso3 = ISO3166_1_Alpha3("GRC"),
          isoNumeric = ISO3166_1_Numeric("300"),
          fips = Fips10_4("GR"),
          name = "Greece",
          capital = "Athens",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("gr"),
          Currency = Currency.EUR
        )

    case SouthGeorgiaAndtheSouthSandwichIslands extends Country(
          iso2 = ISO3166_1_Alpha2("GS"),
          iso3 = ISO3166_1_Alpha3("SGS"),
          isoNumeric = ISO3166_1_Numeric("239"),
          fips = Fips10_4("SX"),
          name = "South Georgia and the South Sandwich Islands",
          capital = "Grytviken",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("gs"),
          Currency = Currency.GBP
        )

    case Guatemala extends Country(
          iso2 = ISO3166_1_Alpha2("GT"),
          iso3 = ISO3166_1_Alpha3("GTM"),
          isoNumeric = ISO3166_1_Numeric("320"),
          fips = Fips10_4("GT"),
          name = "Guatemala",
          capital = "Guatemala City",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("gt"),
          Currency = Currency.GTQ
        )

    case Guam extends Country(
          iso2 = ISO3166_1_Alpha2("GU"),
          iso3 = ISO3166_1_Alpha3("GUM"),
          isoNumeric = ISO3166_1_Numeric("316"),
          fips = Fips10_4("GQ"),
          name = "Guam",
          capital = "Hagatna",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("gu"),
          Currency = Currency.USD
        )

    case GuineaBissau extends Country(
          iso2 = ISO3166_1_Alpha2("GW"),
          iso3 = ISO3166_1_Alpha3("GNB"),
          isoNumeric = ISO3166_1_Numeric("624"),
          fips = Fips10_4("PU"),
          name = "Guinea-Bissau",
          capital = "Bissau",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("gw"),
          Currency = Currency.XOF
        )

    case Guyana extends Country(
          iso2 = ISO3166_1_Alpha2("GY"),
          iso3 = ISO3166_1_Alpha3("GUY"),
          isoNumeric = ISO3166_1_Numeric("328"),
          fips = Fips10_4("GY"),
          name = "Guyana",
          capital = "Georgetown",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("gy"),
          Currency = Currency.GYD
        )

    case HongKong extends Country(
          iso2 = ISO3166_1_Alpha2("HK"),
          iso3 = ISO3166_1_Alpha3("HKG"),
          isoNumeric = ISO3166_1_Numeric("344"),
          fips = Fips10_4("HK"),
          name = "China, Hong Kong Special Administrative Region",
          capital = "Hong Kong",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("hk"),
          Currency = Currency.HKD
        )

    case HeardIslandAndMcDonaldIslands extends Country(
          iso2 = ISO3166_1_Alpha2("HM"),
          iso3 = ISO3166_1_Alpha3("HMD"),
          isoNumeric = ISO3166_1_Numeric("334"),
          fips = Fips10_4("HM"),
          name = "Heard Island and McDonald Islands",
          capital = "",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("hm"),
          Currency = Currency.AUD
        )

    case Honduras extends Country(
          iso2 = ISO3166_1_Alpha2("HN"),
          iso3 = ISO3166_1_Alpha3("HND"),
          isoNumeric = ISO3166_1_Numeric("340"),
          fips = Fips10_4("HO"),
          name = "Honduras",
          capital = "Tegucigalpa",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("hn"),
          Currency = Currency.HNL
        )

    case Croatia extends Country(
          iso2 = ISO3166_1_Alpha2("HR"),
          iso3 = ISO3166_1_Alpha3("HRV"),
          isoNumeric = ISO3166_1_Numeric("191"),
          fips = Fips10_4("HR"),
          name = "Croatia",
          capital = "Zagreb",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("hr"),
          Currency = Currency.EUR
        )

    case Haiti extends Country(
          iso2 = ISO3166_1_Alpha2("HT"),
          iso3 = ISO3166_1_Alpha3("HTI"),
          isoNumeric = ISO3166_1_Numeric("332"),
          fips = Fips10_4("HA"),
          name = "Haiti",
          capital = "Port-au-Prince",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("ht"),
          Currency = Currency.HTG
        )

    case Hungary extends Country(
          iso2 = ISO3166_1_Alpha2("HU"),
          iso3 = ISO3166_1_Alpha3("HUN"),
          isoNumeric = ISO3166_1_Numeric("348"),
          fips = Fips10_4("HU"),
          name = "Hungary",
          capital = "Budapest",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("hu"),
          Currency = Currency.HUF
        )

    case Indonesia extends Country(
          iso2 = ISO3166_1_Alpha2("ID"),
          iso3 = ISO3166_1_Alpha3("IDN"),
          isoNumeric = ISO3166_1_Numeric("360"),
          fips = Fips10_4("ID"),
          name = "Indonesia",
          capital = "Jakarta",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("id"),
          Currency = Currency.IDR
        )

    case Ireland extends Country(
          iso2 = ISO3166_1_Alpha2("IE"),
          iso3 = ISO3166_1_Alpha3("IRL"),
          isoNumeric = ISO3166_1_Numeric("372"),
          fips = Fips10_4("EI"),
          name = "Ireland",
          capital = "Dublin",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ie"),
          Currency = Currency.EUR
        )

    case Israel extends Country(
          iso2 = ISO3166_1_Alpha2("IL"),
          iso3 = ISO3166_1_Alpha3("ISR"),
          isoNumeric = ISO3166_1_Numeric("376"),
          fips = Fips10_4("IS"),
          name = "Israel",
          capital = "Jerusalem",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("il"),
          Currency = Currency.ILS
        )

    case IsleofMan extends Country(
          iso2 = ISO3166_1_Alpha2("IM"),
          iso3 = ISO3166_1_Alpha3("IMN"),
          isoNumeric = ISO3166_1_Numeric("833"),
          fips = Fips10_4("IM"),
          name = "Isle of Man",
          capital = "Douglas",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("im"),
          Currency = Currency.GBP
        )

    case India extends Country(
          iso2 = ISO3166_1_Alpha2("IN"),
          iso3 = ISO3166_1_Alpha3("IND"),
          isoNumeric = ISO3166_1_Numeric("356"),
          fips = Fips10_4("IN"),
          name = "India",
          capital = "New Delhi",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("in"),
          Currency = Currency.INR
        )

    case BritishIndianOceanTerritory extends Country(
          iso2 = ISO3166_1_Alpha2("IO"),
          iso3 = ISO3166_1_Alpha3("IOT"),
          isoNumeric = ISO3166_1_Numeric("086"),
          fips = Fips10_4("IO"),
          name = "British Indian Ocean Territory",
          capital = "Diego Garcia",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("io"),
          Currency = Currency.USD
        )

    case Iraq extends Country(
          iso2 = ISO3166_1_Alpha2("IQ"),
          iso3 = ISO3166_1_Alpha3("IRQ"),
          isoNumeric = ISO3166_1_Numeric("368"),
          fips = Fips10_4("IZ"),
          name = "Iraq",
          capital = "Baghdad",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("iq"),
          Currency = Currency.IQD
        )

    case Iran extends Country(
          iso2 = ISO3166_1_Alpha2("IR"),
          iso3 = ISO3166_1_Alpha3("IRN"),
          isoNumeric = ISO3166_1_Numeric("364"),
          fips = Fips10_4("IR"),
          name = "Iran (Islamic Republic of)",
          capital = "Tehran",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ir"),
          Currency = Currency.IRR
        )

    case Iceland extends Country(
          iso2 = ISO3166_1_Alpha2("IS"),
          iso3 = ISO3166_1_Alpha3("ISL"),
          isoNumeric = ISO3166_1_Numeric("352"),
          fips = Fips10_4("IC"),
          name = "Iceland",
          capital = "Reykjavik",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("is"),
          Currency = Currency.ISK
        )

    case Italy extends Country(
          iso2 = ISO3166_1_Alpha2("IT"),
          iso3 = ISO3166_1_Alpha3("ITA"),
          isoNumeric = ISO3166_1_Numeric("380"),
          fips = Fips10_4("IT"),
          name = "Italy",
          capital = "Rome",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("it"),
          Currency = Currency.EUR
        )

    case Jersey extends Country(
          iso2 = ISO3166_1_Alpha2("JE"),
          iso3 = ISO3166_1_Alpha3("JEY"),
          isoNumeric = ISO3166_1_Numeric("832"),
          fips = Fips10_4("JE"),
          name = "Jersey",
          capital = "Saint Helier",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("je"),
          Currency = Currency.GBP
        )

    case Jamaica extends Country(
          iso2 = ISO3166_1_Alpha2("JM"),
          iso3 = ISO3166_1_Alpha3("JAM"),
          isoNumeric = ISO3166_1_Numeric("388"),
          fips = Fips10_4("JM"),
          name = "Jamaica",
          capital = "Kingston",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("jm"),
          Currency = Currency.JMD
        )

    case Jordan extends Country(
          iso2 = ISO3166_1_Alpha2("JO"),
          iso3 = ISO3166_1_Alpha3("JOR"),
          isoNumeric = ISO3166_1_Numeric("400"),
          fips = Fips10_4("JO"),
          name = "Jordan",
          capital = "Amman",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("jo"),
          Currency = Currency.JOD
        )

    case Japan extends Country(
          iso2 = ISO3166_1_Alpha2("JP"),
          iso3 = ISO3166_1_Alpha3("JPN"),
          isoNumeric = ISO3166_1_Numeric("392"),
          fips = Fips10_4("JA"),
          name = "Japan",
          capital = "Tokyo",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("jp"),
          Currency = Currency.JPY
        )

    case Kenya extends Country(
          iso2 = ISO3166_1_Alpha2("KE"),
          iso3 = ISO3166_1_Alpha3("KEN"),
          isoNumeric = ISO3166_1_Numeric("404"),
          fips = Fips10_4("KE"),
          name = "Kenya",
          capital = "Nairobi",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("ke"),
          Currency = Currency.KES
        )

    case Kyrgyzstan extends Country(
          iso2 = ISO3166_1_Alpha2("KG"),
          iso3 = ISO3166_1_Alpha3("KGZ"),
          isoNumeric = ISO3166_1_Numeric("417"),
          fips = Fips10_4("KG"),
          name = "Kyrgyzstan",
          capital = "Bishkek",
          region = Region.Asia,
          subRegion = SubRegion.CentralAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kg"),
          Currency = Currency.KGS
        )

    case Cambodia extends Country(
          iso2 = ISO3166_1_Alpha2("KH"),
          iso3 = ISO3166_1_Alpha3("KHM"),
          isoNumeric = ISO3166_1_Numeric("116"),
          fips = Fips10_4("CB"),
          name = "Cambodia",
          capital = "Phnom Penh",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kh"),
          Currency = Currency.KHR
        )

    case Kiribati extends Country(
          iso2 = ISO3166_1_Alpha2("KI"),
          iso3 = ISO3166_1_Alpha3("KIR"),
          isoNumeric = ISO3166_1_Numeric("296"),
          fips = Fips10_4("KR"),
          name = "Kiribati",
          capital = "Tarawa",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ki"),
          Currency = Currency.AUD
        )

    case Comoros extends Country(
          iso2 = ISO3166_1_Alpha2("KM"),
          iso3 = ISO3166_1_Alpha3("COM"),
          isoNumeric = ISO3166_1_Numeric("174"),
          fips = Fips10_4("CN"),
          name = "Comoros",
          capital = "Moroni",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("km"),
          Currency = Currency.KMF
        )

    case SaintKittsAndNevis extends Country(
          iso2 = ISO3166_1_Alpha2("KN"),
          iso3 = ISO3166_1_Alpha3("KNA"),
          isoNumeric = ISO3166_1_Numeric("659"),
          fips = Fips10_4("SC"),
          name = "Saint Kitts and Nevis",
          capital = "Basseterre",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("kn"),
          Currency = Currency.XCD
        )

    case NorthKorea extends Country(
          iso2 = ISO3166_1_Alpha2("KP"),
          iso3 = ISO3166_1_Alpha3("PRK"),
          isoNumeric = ISO3166_1_Numeric("408"),
          fips = Fips10_4("KN"),
          name = "Democratic People's Republic of Korea",
          capital = "Pyongyang",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kp"),
          Currency = Currency.KPW
        )

    case SouthKorea extends Country(
          iso2 = ISO3166_1_Alpha2("KR"),
          iso3 = ISO3166_1_Alpha3("KOR"),
          isoNumeric = ISO3166_1_Numeric("410"),
          fips = Fips10_4("KS"),
          name = "Republic of Korea",
          capital = "Seoul",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kr"),
          Currency = Currency.KRW
        )

    case Kosovo extends Country(
          iso2 = ISO3166_1_Alpha2("XK"),
          iso3 = ISO3166_1_Alpha3("XKX"),
          isoNumeric = Absent,
          fips = Fips10_4("KV"),
          name = "Kosovo",
          capital = "Pristina",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = Absent,
          Currency = Currency.EUR
        )

    case Kuwait extends Country(
          iso2 = ISO3166_1_Alpha2("KW"),
          iso3 = ISO3166_1_Alpha3("KWT"),
          isoNumeric = ISO3166_1_Numeric("414"),
          fips = Fips10_4("KU"),
          name = "Kuwait",
          capital = "Kuwait City",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kw"),
          Currency = Currency.KWD
        )

    case CaymanIslands extends Country(
          iso2 = ISO3166_1_Alpha2("KY"),
          iso3 = ISO3166_1_Alpha3("CYM"),
          isoNumeric = ISO3166_1_Numeric("136"),
          fips = Fips10_4("CJ"),
          name = "Cayman Islands",
          capital = "George Town",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("ky"),
          Currency = Currency.KYD
        )

    case Kazakhstan extends Country(
          iso2 = ISO3166_1_Alpha2("KZ"),
          iso3 = ISO3166_1_Alpha3("KAZ"),
          isoNumeric = ISO3166_1_Numeric("398"),
          fips = Fips10_4("KZ"),
          name = "Kazakhstan",
          capital = "Nur-Sultan",
          region = Region.Asia,
          subRegion = SubRegion.CentralAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("kz"),
          Currency = Currency.KZT
        )

    case Laos extends Country(
          iso2 = ISO3166_1_Alpha2("LA"),
          iso3 = ISO3166_1_Alpha3("LAO"),
          isoNumeric = ISO3166_1_Numeric("418"),
          fips = Fips10_4("LA"),
          name = "Lao People's Democratic Republic",
          capital = "Vientiane",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("la"),
          Currency = Currency.LAK
        )

    case Lebanon extends Country(
          iso2 = ISO3166_1_Alpha2("LB"),
          iso3 = ISO3166_1_Alpha3("LBN"),
          isoNumeric = ISO3166_1_Numeric("422"),
          fips = Fips10_4("LE"),
          name = "Lebanon",
          capital = "Beirut",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("lb"),
          Currency = Currency.LBP
        )

    case SaintLucia extends Country(
          iso2 = ISO3166_1_Alpha2("LC"),
          iso3 = ISO3166_1_Alpha3("LCA"),
          isoNumeric = ISO3166_1_Numeric("662"),
          fips = Fips10_4("ST"),
          name = "Saint Lucia",
          capital = "Castries",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("lc"),
          Currency = Currency.XCD
        )

    case Liechtenstein extends Country(
          iso2 = ISO3166_1_Alpha2("LI"),
          iso3 = ISO3166_1_Alpha3("LIE"),
          isoNumeric = ISO3166_1_Numeric("438"),
          fips = Fips10_4("LS"),
          name = "Liechtenstein",
          capital = "Vaduz",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("li"),
          Currency = Currency.CHF
        )

    case SriLanka extends Country(
          iso2 = ISO3166_1_Alpha2("LK"),
          iso3 = ISO3166_1_Alpha3("LKA"),
          isoNumeric = ISO3166_1_Numeric("144"),
          fips = Fips10_4("CE"),
          name = "Sri Lanka",
          capital = "Colombo",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("lk"),
          Currency = Currency.LKR
        )

    case Liberia extends Country(
          iso2 = ISO3166_1_Alpha2("LR"),
          iso3 = ISO3166_1_Alpha3("LBR"),
          isoNumeric = ISO3166_1_Numeric("430"),
          fips = Fips10_4("LI"),
          name = "Liberia",
          capital = "Monrovia",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("lr"),
          Currency = Currency.LRD
        )

    case Lesotho extends Country(
          iso2 = ISO3166_1_Alpha2("LS"),
          iso3 = ISO3166_1_Alpha3("LSO"),
          isoNumeric = ISO3166_1_Numeric("426"),
          fips = Fips10_4("LT"),
          name = "Lesotho",
          capital = "Maseru",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.SouthernAfrica,
          topLevelDomain = CcTLD("ls"),
          Currency = Currency.LSL
        )

    case Lithuania extends Country(
          iso2 = ISO3166_1_Alpha2("LT"),
          iso3 = ISO3166_1_Alpha3("LTU"),
          isoNumeric = ISO3166_1_Numeric("440"),
          fips = Fips10_4("LH"),
          name = "Lithuania",
          capital = "Vilnius",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("lt"),
          Currency = Currency.EUR
        )

    case Luxembourg extends Country(
          iso2 = ISO3166_1_Alpha2("LU"),
          iso3 = ISO3166_1_Alpha3("LUX"),
          isoNumeric = ISO3166_1_Numeric("442"),
          fips = Fips10_4("LU"),
          name = "Luxembourg",
          capital = "Luxembourg",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("lu"),
          Currency = Currency.EUR
        )

    case Latvia extends Country(
          iso2 = ISO3166_1_Alpha2("LV"),
          iso3 = ISO3166_1_Alpha3("LVA"),
          isoNumeric = ISO3166_1_Numeric("428"),
          fips = Fips10_4("LG"),
          name = "Latvia",
          capital = "Riga",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("lv"),
          Currency = Currency.EUR
        )

    case Libya extends Country(
          iso2 = ISO3166_1_Alpha2("LY"),
          iso3 = ISO3166_1_Alpha3("LBY"),
          isoNumeric = ISO3166_1_Numeric("434"),
          fips = Fips10_4("LY"),
          name = "Libya",
          capital = "Tripoli",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ly"),
          Currency = Currency.LYD
        )

    case Morocco extends Country(
          iso2 = ISO3166_1_Alpha2("MA"),
          iso3 = ISO3166_1_Alpha3("MAR"),
          isoNumeric = ISO3166_1_Numeric("504"),
          fips = Fips10_4("MO"),
          name = "Morocco",
          capital = "Rabat",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ma"),
          Currency = Currency.MAD
        )

    case Monaco extends Country(
          iso2 = ISO3166_1_Alpha2("MC"),
          iso3 = ISO3166_1_Alpha3("MCO"),
          isoNumeric = ISO3166_1_Numeric("492"),
          fips = Fips10_4("MN"),
          name = "Monaco",
          capital = "Monaco",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mc"),
          Currency = Currency.EUR
        )

    case Moldova extends Country(
          iso2 = ISO3166_1_Alpha2("MD"),
          iso3 = ISO3166_1_Alpha3("MDA"),
          isoNumeric = ISO3166_1_Numeric("498"),
          fips = Fips10_4("MD"),
          name = "republic of Moldova",
          capital = "Chisinau",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("md"),
          Currency = Currency.MDL
        )

    case Montenegro extends Country(
          iso2 = ISO3166_1_Alpha2("ME"),
          iso3 = ISO3166_1_Alpha3("MNE"),
          isoNumeric = ISO3166_1_Numeric("499"),
          fips = Fips10_4("MJ"),
          name = "Montenegro",
          capital = "Podgorica",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("me"),
          Currency = Currency.EUR
        )

    case SaintMartin extends Country(
          iso2 = ISO3166_1_Alpha2("MF"),
          iso3 = ISO3166_1_Alpha3("MAF"),
          isoNumeric = ISO3166_1_Numeric("663"),
          fips = Fips10_4("RN"),
          name = "Saint Martin",
          capital = "Marigot",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("gp"),
          Currency = Currency.EUR
        )

    case Madagascar extends Country(
          iso2 = ISO3166_1_Alpha2("MG"),
          iso3 = ISO3166_1_Alpha3("MDG"),
          isoNumeric = ISO3166_1_Numeric("450"),
          fips = Fips10_4("MA"),
          name = "Madagascar",
          capital = "Antananarivo",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("mg"),
          Currency = Currency.MGA
        )

    case MarshallIslands extends Country(
          iso2 = ISO3166_1_Alpha2("MH"),
          iso3 = ISO3166_1_Alpha3("MHL"),
          isoNumeric = ISO3166_1_Numeric("584"),
          fips = Fips10_4("RM"),
          name = "Marshall Islands",
          capital = "Majuro",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mh"),
          Currency = Currency.USD
        )

    case NorthMacedonia extends Country(
          iso2 = ISO3166_1_Alpha2("MK"),
          iso3 = ISO3166_1_Alpha3("MKD"),
          isoNumeric = ISO3166_1_Numeric("807"),
          fips = Fips10_4("MK"),
          name = "North Macedonia",
          capital = "Skopje",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mk"),
          Currency = Currency.MKD
        )

    case Mali extends Country(
          iso2 = ISO3166_1_Alpha2("ML"),
          iso3 = ISO3166_1_Alpha3("MLI"),
          isoNumeric = ISO3166_1_Numeric("466"),
          fips = Fips10_4("ML"),
          name = "Mali",
          capital = "Bamako",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("ml"),
          Currency = Currency.XOF
        )

    case Myanmar extends Country(
          iso2 = ISO3166_1_Alpha2("MM"),
          iso3 = ISO3166_1_Alpha3("MMR"),
          isoNumeric = ISO3166_1_Numeric("104"),
          fips = Fips10_4("BM"),
          name = "Myanmar",
          capital = "Nay Pyi Taw",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mm"),
          Currency = Currency.MMK
        )

    case Mongolia extends Country(
          iso2 = ISO3166_1_Alpha2("MN"),
          iso3 = ISO3166_1_Alpha3("MNG"),
          isoNumeric = ISO3166_1_Numeric("496"),
          fips = Fips10_4("MG"),
          name = "Mongolia",
          capital = "Ulaanbaatar",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mn"),
          Currency = Currency.MNT
        )

    case Macao extends Country(
          iso2 = ISO3166_1_Alpha2("MO"),
          iso3 = ISO3166_1_Alpha3("MAC"),
          isoNumeric = ISO3166_1_Numeric("446"),
          fips = Fips10_4("MC"),
          name = "China, Macao Special Administrative Region",
          capital = "Macao",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mo"),
          Currency = Currency.MOP
        )

    case NorthernMarianaIslands extends Country(
          iso2 = ISO3166_1_Alpha2("MP"),
          iso3 = ISO3166_1_Alpha3("MNP"),
          isoNumeric = ISO3166_1_Numeric("580"),
          fips = Fips10_4("CQ"),
          name = "Northern Mariana Islands",
          capital = "Saipan",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mp"),
          Currency = Currency.USD
        )

    case Martinique extends Country(
          iso2 = ISO3166_1_Alpha2("MQ"),
          iso3 = ISO3166_1_Alpha3("MTQ"),
          isoNumeric = ISO3166_1_Numeric("474"),
          fips = Fips10_4("MB"),
          name = "Martinique",
          capital = "Fort-de-France",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("mq"),
          Currency = Currency.EUR
        )

    case Mauritania extends Country(
          iso2 = ISO3166_1_Alpha2("MR"),
          iso3 = ISO3166_1_Alpha3("MRT"),
          isoNumeric = ISO3166_1_Numeric("478"),
          fips = Fips10_4("MR"),
          name = "Mauritania",
          capital = "Nouakchott",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("mr"),
          Currency = Currency.MRU
        )

    case Montserrat extends Country(
          iso2 = ISO3166_1_Alpha2("MS"),
          iso3 = ISO3166_1_Alpha3("MSR"),
          isoNumeric = ISO3166_1_Numeric("500"),
          fips = Fips10_4("MH"),
          name = "Montserrat",
          capital = "Plymouth",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("ms"),
          Currency = Currency.XCD
        )

    case Malta extends Country(
          iso2 = ISO3166_1_Alpha2("MT"),
          iso3 = ISO3166_1_Alpha3("MLT"),
          isoNumeric = ISO3166_1_Numeric("470"),
          fips = Fips10_4("MT"),
          name = "Malta",
          capital = "Valletta",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mt"),
          Currency = Currency.EUR
        )

    case Mauritius extends Country(
          iso2 = ISO3166_1_Alpha2("MU"),
          iso3 = ISO3166_1_Alpha3("MUS"),
          isoNumeric = ISO3166_1_Numeric("480"),
          fips = Fips10_4("MP"),
          name = "Mauritius",
          capital = "Port Louis",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("mu"),
          Currency = Currency.MUR
        )

    case Maldives extends Country(
          iso2 = ISO3166_1_Alpha2("MV"),
          iso3 = ISO3166_1_Alpha3("MDV"),
          isoNumeric = ISO3166_1_Numeric("462"),
          fips = Fips10_4("MV"),
          name = "Maldives",
          capital = "Male",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("mv"),
          Currency = Currency.MVR
        )

    case Malawi extends Country(
          iso2 = ISO3166_1_Alpha2("MW"),
          iso3 = ISO3166_1_Alpha3("MWI"),
          isoNumeric = ISO3166_1_Numeric("454"),
          fips = Fips10_4("MI"),
          name = "Malawi",
          capital = "Lilongwe",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("mw"),
          Currency = Currency.MWK
        )

    case Mexico extends Country(
          iso2 = ISO3166_1_Alpha2("MX"),
          iso3 = ISO3166_1_Alpha3("MEX"),
          isoNumeric = ISO3166_1_Numeric("484"),
          fips = Fips10_4("MX"),
          name = "Mexico",
          capital = "Mexico City",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("mx"),
          Currency = Currency.MXN
        )

    case Malaysia extends Country(
          iso2 = ISO3166_1_Alpha2("MY"),
          iso3 = ISO3166_1_Alpha3("MYS"),
          isoNumeric = ISO3166_1_Numeric("458"),
          fips = Fips10_4("MY"),
          name = "Malaysia",
          capital = "Kuala Lumpur",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("my"),
          Currency = Currency.MYR
        )

    case Mozambique extends Country(
          iso2 = ISO3166_1_Alpha2("MZ"),
          iso3 = ISO3166_1_Alpha3("MOZ"),
          isoNumeric = ISO3166_1_Numeric("508"),
          fips = Fips10_4("MZ"),
          name = "Mozambique",
          capital = "Maputo",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("mz"),
          Currency = Currency.MZN
        )

    case Namibia extends Country(
          iso2 = ISO3166_1_Alpha2("NA"),
          iso3 = ISO3166_1_Alpha3("NAM"),
          isoNumeric = ISO3166_1_Numeric("516"),
          fips = Fips10_4("WA"),
          name = "Namibia",
          capital = "Windhoek",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.SouthernAfrica,
          topLevelDomain = CcTLD("na"),
          Currency = Currency.NAD
        )

    case NewCaledonia extends Country(
          iso2 = ISO3166_1_Alpha2("NC"),
          iso3 = ISO3166_1_Alpha3("NCL"),
          isoNumeric = ISO3166_1_Numeric("540"),
          fips = Fips10_4("NC"),
          name = "New Caledonia",
          capital = "Noumea",
          region = Region.Oceania,
          subRegion = SubRegion.Melanesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nc"),
          Currency = Currency.XPF
        )

    case Niger extends Country(
          iso2 = ISO3166_1_Alpha2("NE"),
          iso3 = ISO3166_1_Alpha3("NER"),
          isoNumeric = ISO3166_1_Numeric("562"),
          fips = Fips10_4("NG"),
          name = "Niger",
          capital = "Niamey",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("ne"),
          Currency = Currency.XOF
        )

    case NorfolkIsland extends Country(
          iso2 = ISO3166_1_Alpha2("NF"),
          iso3 = ISO3166_1_Alpha3("NFK"),
          isoNumeric = ISO3166_1_Numeric("574"),
          fips = Fips10_4("NF"),
          name = "Norfolk Island",
          capital = "Kingston",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nf"),
          Currency = Currency.AUD
        )

    case Nigeria extends Country(
          iso2 = ISO3166_1_Alpha2("NG"),
          iso3 = ISO3166_1_Alpha3("NGA"),
          isoNumeric = ISO3166_1_Numeric("566"),
          fips = Fips10_4("NI"),
          name = "Nigeria",
          capital = "Abuja",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("ng"),
          Currency = Currency.NGN
        )

    case Nicaragua extends Country(
          iso2 = ISO3166_1_Alpha2("NI"),
          iso3 = ISO3166_1_Alpha3("NIC"),
          isoNumeric = ISO3166_1_Numeric("558"),
          fips = Fips10_4("NU"),
          name = "Nicaragua",
          capital = "Managua",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("ni"),
          Currency = Currency.NIO
        )

    case TheNetherlands extends Country(
          iso2 = ISO3166_1_Alpha2("NL"),
          iso3 = ISO3166_1_Alpha3("NLD"),
          isoNumeric = ISO3166_1_Numeric("528"),
          fips = Fips10_4("NL"),
          name = "Netherlands (Kingdom of the)",
          capital = "Amsterdam",
          region = Region.Europe,
          subRegion = SubRegion.WesternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nl"),
          Currency = Currency.EUR
        )

    case Norway extends Country(
          iso2 = ISO3166_1_Alpha2("NO"),
          iso3 = ISO3166_1_Alpha3("NOR"),
          isoNumeric = ISO3166_1_Numeric("578"),
          fips = Fips10_4("NO"),
          name = "Norway",
          capital = "Oslo",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("no"),
          Currency = Currency.NOK
        )

    case Nepal extends Country(
          iso2 = ISO3166_1_Alpha2("NP"),
          iso3 = ISO3166_1_Alpha3("NPL"),
          isoNumeric = ISO3166_1_Numeric("524"),
          fips = Fips10_4("NP"),
          name = "Nepal",
          capital = "Kathmandu",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("np"),
          Currency = Currency.NPR
        )

    case Nauru extends Country(
          iso2 = ISO3166_1_Alpha2("NR"),
          iso3 = ISO3166_1_Alpha3("NRU"),
          isoNumeric = ISO3166_1_Numeric("520"),
          fips = Fips10_4("NR"),
          name = "Nauru",
          capital = "Yaren",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nr"),
          Currency = Currency.AUD
        )

    case Niue extends Country(
          iso2 = ISO3166_1_Alpha2("NU"),
          iso3 = ISO3166_1_Alpha3("NIU"),
          isoNumeric = ISO3166_1_Numeric("570"),
          fips = Fips10_4("NE"),
          name = "Niue",
          capital = "Alofi",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nu"),
          Currency = Currency.NZD
        )

    case NewZealand extends Country(
          iso2 = ISO3166_1_Alpha2("NZ"),
          iso3 = ISO3166_1_Alpha3("NZL"),
          isoNumeric = ISO3166_1_Numeric("554"),
          fips = Fips10_4("NZ"),
          name = "New Zealand",
          capital = "Wellington",
          region = Region.Oceania,
          subRegion = SubRegion.AustraliaAndNewZealand,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("nz"),
          Currency = Currency.NZD
        )

    case Oman extends Country(
          iso2 = ISO3166_1_Alpha2("OM"),
          iso3 = ISO3166_1_Alpha3("OMN"),
          isoNumeric = ISO3166_1_Numeric("512"),
          fips = Fips10_4("MU"),
          name = "Oman",
          capital = "Muscat",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("om"),
          Currency = Currency.OMR
        )

    case Panama extends Country(
          iso2 = ISO3166_1_Alpha2("PA"),
          iso3 = ISO3166_1_Alpha3("PAN"),
          isoNumeric = ISO3166_1_Numeric("591"),
          fips = Fips10_4("PM"),
          name = "Panama",
          capital = "Panama City",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("pa"),
          Currency = Currency.PAB
        )

    case Peru extends Country(
          iso2 = ISO3166_1_Alpha2("PE"),
          iso3 = ISO3166_1_Alpha3("PER"),
          isoNumeric = ISO3166_1_Numeric("604"),
          fips = Fips10_4("PE"),
          name = "Peru",
          capital = "Lima",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("pe"),
          Currency = Currency.PEN
        )

    case FrenchPolynesia extends Country(
          iso2 = ISO3166_1_Alpha2("PF"),
          iso3 = ISO3166_1_Alpha3("PYF"),
          isoNumeric = ISO3166_1_Numeric("258"),
          fips = Fips10_4("FP"),
          name = "French Polynesia",
          capital = "Papeete",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pf"),
          Currency = Currency.XPF
        )

    case PapuaNewGuinea extends Country(
          iso2 = ISO3166_1_Alpha2("PG"),
          iso3 = ISO3166_1_Alpha3("PNG"),
          isoNumeric = ISO3166_1_Numeric("598"),
          fips = Fips10_4("PP"),
          name = "Papua New Guinea",
          capital = "Port Moresby",
          region = Region.Oceania,
          subRegion = SubRegion.Melanesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pg"),
          Currency = Currency.PGK
        )

    case Philippines extends Country(
          iso2 = ISO3166_1_Alpha2("PH"),
          iso3 = ISO3166_1_Alpha3("PHL"),
          isoNumeric = ISO3166_1_Numeric("608"),
          fips = Fips10_4("RP"),
          name = "Philippines",
          capital = "Manila",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ph"),
          Currency = Currency.PHP
        )

    case Pakistan extends Country(
          iso2 = ISO3166_1_Alpha2("PK"),
          iso3 = ISO3166_1_Alpha3("PAK"),
          isoNumeric = ISO3166_1_Numeric("586"),
          fips = Fips10_4("PK"),
          name = "Pakistan",
          capital = "Islamabad",
          region = Region.Asia,
          subRegion = SubRegion.SouthernAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pk"),
          Currency = Currency.PKR
        )

    case Poland extends Country(
          iso2 = ISO3166_1_Alpha2("PL"),
          iso3 = ISO3166_1_Alpha3("POL"),
          isoNumeric = ISO3166_1_Numeric("616"),
          fips = Fips10_4("PL"),
          name = "Poland",
          capital = "Warsaw",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pl"),
          Currency = Currency.PLN
        )

    case SaintPierreAndMiquelon extends Country(
          iso2 = ISO3166_1_Alpha2("PM"),
          iso3 = ISO3166_1_Alpha3("SPM"),
          isoNumeric = ISO3166_1_Numeric("666"),
          fips = Fips10_4("SB"),
          name = "Saint Pierre and Miquelon",
          capital = "Saint-Pierre",
          region = Region.Americas,
          subRegion = SubRegion.NorthernAmerica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pm"),
          Currency = Currency.EUR
        )

    case Pitcairn extends Country(
          iso2 = ISO3166_1_Alpha2("PN"),
          iso3 = ISO3166_1_Alpha3("PCN"),
          isoNumeric = ISO3166_1_Numeric("612"),
          fips = Fips10_4("PC"),
          name = "Pitcairn",
          capital = "Adamstown",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pn"),
          Currency = Currency.NZD
        )

    case PuertoRico extends Country(
          iso2 = ISO3166_1_Alpha2("PR"),
          iso3 = ISO3166_1_Alpha3("PRI"),
          isoNumeric = ISO3166_1_Numeric("630"),
          fips = Fips10_4("RQ"),
          name = "Puerto Rico",
          capital = "San Juan",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("pr"),
          Currency = Currency.USD
        )

    case Palestine extends Country(
          iso2 = ISO3166_1_Alpha2("PS"),
          iso3 = ISO3166_1_Alpha3("PSE"),
          isoNumeric = ISO3166_1_Numeric("275"),
          fips = Fips10_4("WE"),
          name = "State of Palestine",
          capital = "East Jerusalem",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ps"),
          Currency = Currency.ILS
        )

    case Portugal extends Country(
          iso2 = ISO3166_1_Alpha2("PT"),
          iso3 = ISO3166_1_Alpha3("PRT"),
          isoNumeric = ISO3166_1_Numeric("620"),
          fips = Fips10_4("PO"),
          name = "Portugal",
          capital = "Lisbon",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pt"),
          Currency = Currency.EUR
        )

    case Palau extends Country(
          iso2 = ISO3166_1_Alpha2("PW"),
          iso3 = ISO3166_1_Alpha3("PLW"),
          isoNumeric = ISO3166_1_Numeric("585"),
          fips = Fips10_4("PS"),
          name = "Palau",
          capital = "Melekeok",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("pw"),
          Currency = Currency.USD
        )

    case Paraguay extends Country(
          iso2 = ISO3166_1_Alpha2("PY"),
          iso3 = ISO3166_1_Alpha3("PRY"),
          isoNumeric = ISO3166_1_Numeric("600"),
          fips = Fips10_4("PA"),
          name = "Paraguay",
          capital = "Asuncion",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("py"),
          Currency = Currency.PYG
        )

    case Qatar extends Country(
          iso2 = ISO3166_1_Alpha2("QA"),
          iso3 = ISO3166_1_Alpha3("QAT"),
          isoNumeric = ISO3166_1_Numeric("634"),
          fips = Fips10_4("QA"),
          name = "Qatar",
          capital = "Doha",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("qa"),
          Currency = Currency.QAR
        )

    case Reunion extends Country(
          iso2 = ISO3166_1_Alpha2("RE"),
          iso3 = ISO3166_1_Alpha3("REU"),
          isoNumeric = ISO3166_1_Numeric("638"),
          fips = Fips10_4("RE"),
          name = "Reunion",
          capital = "Saint-Denis",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("re"),
          Currency = Currency.EUR
        )

    case Romania extends Country(
          iso2 = ISO3166_1_Alpha2("RO"),
          iso3 = ISO3166_1_Alpha3("ROU"),
          isoNumeric = ISO3166_1_Numeric("642"),
          fips = Fips10_4("RO"),
          name = "Romania",
          capital = "Bucharest",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ro"),
          Currency = Currency.RON
        )

    case Serbia extends Country(
          iso2 = ISO3166_1_Alpha2("RS"),
          iso3 = ISO3166_1_Alpha3("SRB"),
          isoNumeric = ISO3166_1_Numeric("688"),
          fips = Fips10_4("RI"),
          name = "Serbia",
          capital = "Belgrade",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("rs"),
          Currency = Currency.RSD
        )

    case RussianFederation extends Country(
          iso2 = ISO3166_1_Alpha2("RU"),
          iso3 = ISO3166_1_Alpha3("RUS"),
          isoNumeric = ISO3166_1_Numeric("643"),
          fips = Fips10_4("RS"),
          name = "Russian Federation",
          capital = "Moscow",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ru"),
          Currency = Currency.RUB
        )

    case Rwanda extends Country(
          iso2 = ISO3166_1_Alpha2("RW"),
          iso3 = ISO3166_1_Alpha3("RWA"),
          isoNumeric = ISO3166_1_Numeric("646"),
          fips = Fips10_4("RW"),
          name = "Rwanda",
          capital = "Kigali",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("rw"),
          Currency = Currency.RWF
        )

    case SaudiArabia extends Country(
          iso2 = ISO3166_1_Alpha2("SA"),
          iso3 = ISO3166_1_Alpha3("SAU"),
          isoNumeric = ISO3166_1_Numeric("682"),
          fips = Fips10_4("SA"),
          name = "Saudi Arabia",
          capital = "Riyadh",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sa"),
          Currency = Currency.SAR
        )

    case SolomonIslands extends Country(
          iso2 = ISO3166_1_Alpha2("SB"),
          iso3 = ISO3166_1_Alpha3("SLB"),
          isoNumeric = ISO3166_1_Numeric("090"),
          fips = Fips10_4("BP"),
          name = "Solomon Islands",
          capital = "Honiara",
          region = Region.Oceania,
          subRegion = SubRegion.Melanesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sb"),
          Currency = Currency.SBD
        )

    case Seychelles extends Country(
          iso2 = ISO3166_1_Alpha2("SC"),
          iso3 = ISO3166_1_Alpha3("SYC"),
          isoNumeric = ISO3166_1_Numeric("690"),
          fips = Fips10_4("SE"),
          name = "Seychelles",
          capital = "Victoria",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("sc"),
          Currency = Currency.SCR
        )

    case Sudan extends Country(
          iso2 = ISO3166_1_Alpha2("SD"),
          iso3 = ISO3166_1_Alpha3("SDN"),
          isoNumeric = ISO3166_1_Numeric("729"),
          fips = Fips10_4("SU"),
          name = "Sudan",
          capital = "Khartoum",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sd"),
          Currency = Currency.SDG
        )

    case SouthSudan extends Country(
          iso2 = ISO3166_1_Alpha2("SS"),
          iso3 = ISO3166_1_Alpha3("SSD"),
          isoNumeric = ISO3166_1_Numeric("728"),
          fips = Fips10_4("OD"),
          name = "South Sudan",
          capital = "Juba",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("ss"),
          Currency = Currency.SSP
        )

    case Sweden extends Country(
          iso2 = ISO3166_1_Alpha2("SE"),
          iso3 = ISO3166_1_Alpha3("SWE"),
          isoNumeric = ISO3166_1_Numeric("752"),
          fips = Fips10_4("SW"),
          name = "Sweden",
          capital = "Stockholm",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("se"),
          Currency = Currency.SEK
        )

    case Singapore extends Country(
          iso2 = ISO3166_1_Alpha2("SG"),
          iso3 = ISO3166_1_Alpha3("SGP"),
          isoNumeric = ISO3166_1_Numeric("702"),
          fips = Fips10_4("SN"),
          name = "Singapore",
          capital = "Singapore",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sg"),
          Currency = Currency.SGD
        )

    case SaintHelena extends Country(
          iso2 = ISO3166_1_Alpha2("SH"),
          iso3 = ISO3166_1_Alpha3("SHN"),
          isoNumeric = ISO3166_1_Numeric("654"),
          fips = Fips10_4("SH"),
          name = "Saint Helena",
          capital = "Jamestown",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("sh"),
          Currency = Currency.SHP
        )

    case Slovenia extends Country(
          iso2 = ISO3166_1_Alpha2("SI"),
          iso3 = ISO3166_1_Alpha3("SVN"),
          isoNumeric = ISO3166_1_Numeric("705"),
          fips = Fips10_4("SI"),
          name = "Slovenia",
          capital = "Ljubljana",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("si"),
          Currency = Currency.EUR
        )

    case SvalbardAndJanMayen extends Country(
          iso2 = ISO3166_1_Alpha2("SJ"),
          iso3 = ISO3166_1_Alpha3("SJM"),
          isoNumeric = ISO3166_1_Numeric("744"),
          fips = Fips10_4("SV"),
          name = "Svalbard and Jan Mayen",
          capital = "Longyearbyen",
          region = Region.Europe,
          subRegion = SubRegion.NorthernEurope,
          topLevelDomain = CcTLD("sj"),
          Currency = Currency.NOK
        )

    case Slovakia extends Country(
          iso2 = ISO3166_1_Alpha2("SK"),
          iso3 = ISO3166_1_Alpha3("SVK"),
          isoNumeric = ISO3166_1_Numeric("703"),
          fips = Fips10_4("LO"),
          name = "Slovakia",
          capital = "Bratislava",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sk"),
          Currency = Currency.EUR
        )

    case SierraLeone extends Country(
          iso2 = ISO3166_1_Alpha2("SL"),
          iso3 = ISO3166_1_Alpha3("SLE"),
          isoNumeric = ISO3166_1_Numeric("694"),
          fips = Fips10_4("SL"),
          name = "Sierra Leone",
          capital = "Freetown",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("sl"),
          Currency = Currency.SLL
        )

    case SanMarino extends Country(
          iso2 = ISO3166_1_Alpha2("SM"),
          iso3 = ISO3166_1_Alpha3("SMR"),
          isoNumeric = ISO3166_1_Numeric("674"),
          fips = Fips10_4("SM"),
          name = "San Marino",
          capital = "San Marino",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sm"),
          Currency = Currency.EUR
        )

    case Senegal extends Country(
          iso2 = ISO3166_1_Alpha2("SN"),
          iso3 = ISO3166_1_Alpha3("SEN"),
          isoNumeric = ISO3166_1_Numeric("686"),
          fips = Fips10_4("SG"),
          name = "Senegal",
          capital = "Dakar",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("sn"),
          Currency = Currency.XOF
        )

    case Somalia extends Country(
          iso2 = ISO3166_1_Alpha2("SO"),
          iso3 = ISO3166_1_Alpha3("SOM"),
          isoNumeric = ISO3166_1_Numeric("706"),
          fips = Fips10_4("SO"),
          name = "Somalia",
          capital = "Mogadishu",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("so"),
          Currency = Currency.SOS
        )

    case Suriname extends Country(
          iso2 = ISO3166_1_Alpha2("SR"),
          iso3 = ISO3166_1_Alpha3("SUR"),
          isoNumeric = ISO3166_1_Numeric("740"),
          fips = Fips10_4("NS"),
          name = "Suriname",
          capital = "Paramaribo",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("sr"),
          Currency = Currency.SRD
        )

    case SaoTomeAndPrincipe extends Country(
          iso2 = ISO3166_1_Alpha2("ST"),
          iso3 = ISO3166_1_Alpha3("STP"),
          isoNumeric = ISO3166_1_Numeric("678"),
          fips = Fips10_4("TP"),
          name = "Sao Tome and Principe",
          capital = "Sao Tome",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("st"),
          Currency = Currency.STN
        )

    case ElSalvador extends Country(
          iso2 = ISO3166_1_Alpha2("SV"),
          iso3 = ISO3166_1_Alpha3("SLV"),
          isoNumeric = ISO3166_1_Numeric("222"),
          fips = Fips10_4("ES"),
          name = "El Salvador",
          capital = "San Salvador",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.CentralAmerica,
          topLevelDomain = CcTLD("sv"),
          Currency = Currency.USD
        )

    case SintMaarten extends Country(
          iso2 = ISO3166_1_Alpha2("SX"),
          iso3 = ISO3166_1_Alpha3("SXM"),
          isoNumeric = ISO3166_1_Numeric("534"),
          fips = Fips10_4("NN"),
          name = "Sint Maarten (Dutch part)",
          capital = "Philipsburg",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("sx"),
          Currency = Currency.ANG
        )

    case Syria extends Country(
          iso2 = ISO3166_1_Alpha2("SY"),
          iso3 = ISO3166_1_Alpha3("SYR"),
          isoNumeric = ISO3166_1_Numeric("760"),
          fips = Fips10_4("SY"),
          name = "Syrian Arab Republic",
          capital = "Damascus",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("sy"),
          Currency = Currency.SYP
        )

    case Eswatini extends Country(
          iso2 = ISO3166_1_Alpha2("SZ"),
          iso3 = ISO3166_1_Alpha3("SWZ"),
          isoNumeric = ISO3166_1_Numeric("748"),
          fips = Fips10_4("WZ"),
          name = "Eswatini",
          capital = "Mbabane",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.SouthernAfrica,
          topLevelDomain = CcTLD("sz"),
          Currency = Currency.SZL
        )

    case TurksAndCaicosIslands extends Country(
          iso2 = ISO3166_1_Alpha2("TC"),
          iso3 = ISO3166_1_Alpha3("TCA"),
          isoNumeric = ISO3166_1_Numeric("796"),
          fips = Fips10_4("TK"),
          name = "Turks and Caicos Islands",
          capital = "Cockburn Town",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("tc"),
          Currency = Currency.USD
        )

    case Chad extends Country(
          iso2 = ISO3166_1_Alpha2("TD"),
          iso3 = ISO3166_1_Alpha3("TCD"),
          isoNumeric = ISO3166_1_Numeric("148"),
          fips = Fips10_4("CD"),
          name = "Chad",
          capital = "N'Djamena",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.MiddleAfrica,
          topLevelDomain = CcTLD("td"),
          Currency = Currency.XAF
        )

    case FrenchSouthernTerritories extends Country(
          iso2 = ISO3166_1_Alpha2("TF"),
          iso3 = ISO3166_1_Alpha3("ATF"),
          isoNumeric = ISO3166_1_Numeric("260"),
          fips = Fips10_4("FS"),
          name = "French Southern Territories",
          capital = "Port-aux-Francais",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("tf"),
          Currency = Currency.EUR
        )

    case Togo extends Country(
          iso2 = ISO3166_1_Alpha2("TG"),
          iso3 = ISO3166_1_Alpha3("TGO"),
          isoNumeric = ISO3166_1_Numeric("768"),
          fips = Fips10_4("TO"),
          name = "Togo",
          capital = "Lome",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.WesternAfrica,
          topLevelDomain = CcTLD("tg"),
          Currency = Currency.XOF
        )

    case Thailand extends Country(
          iso2 = ISO3166_1_Alpha2("TH"),
          iso3 = ISO3166_1_Alpha3("THA"),
          isoNumeric = ISO3166_1_Numeric("764"),
          fips = Fips10_4("TH"),
          name = "Thailand",
          capital = "Bangkok",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("th"),
          Currency = Currency.THB
        )

    case Tajikistan extends Country(
          iso2 = ISO3166_1_Alpha2("TJ"),
          iso3 = ISO3166_1_Alpha3("TJK"),
          isoNumeric = ISO3166_1_Numeric("762"),
          fips = Fips10_4("TI"),
          name = "Tajikistan",
          capital = "Dushanbe",
          region = Region.Asia,
          subRegion = SubRegion.CentralAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tj"),
          Currency = Currency.TJS
        )

    case Tokelau extends Country(
          iso2 = ISO3166_1_Alpha2("TK"),
          iso3 = ISO3166_1_Alpha3("TKL"),
          isoNumeric = ISO3166_1_Numeric("772"),
          fips = Fips10_4("TL"),
          name = "Tokelau",
          capital = "",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tk"),
          Currency = Currency.NZD
        )

    case TimorLeste extends Country(
          iso2 = ISO3166_1_Alpha2("TL"),
          iso3 = ISO3166_1_Alpha3("TLS"),
          isoNumeric = ISO3166_1_Numeric("626"),
          fips = Fips10_4("TT"),
          name = "Timor Leste",
          capital = "Dili",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tl"),
          Currency = Currency.USD
        )

    case Turkmenistan extends Country(
          iso2 = ISO3166_1_Alpha2("TM"),
          iso3 = ISO3166_1_Alpha3("TKM"),
          isoNumeric = ISO3166_1_Numeric("795"),
          fips = Fips10_4("TX"),
          name = "Turkmenistan",
          capital = "Ashgabat",
          region = Region.Asia,
          subRegion = SubRegion.CentralAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tm"),
          Currency = Currency.TMT
        )

    case Tunisia extends Country(
          iso2 = ISO3166_1_Alpha2("TN"),
          iso3 = ISO3166_1_Alpha3("TUN"),
          isoNumeric = ISO3166_1_Numeric("788"),
          fips = Fips10_4("TS"),
          name = "Tunisia",
          capital = "Tunis",
          region = Region.Africa,
          subRegion = SubRegion.NorthernAfrica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tn"),
          Currency = Currency.TND
        )

    case Tonga extends Country(
          iso2 = ISO3166_1_Alpha2("TO"),
          iso3 = ISO3166_1_Alpha3("TON"),
          isoNumeric = ISO3166_1_Numeric("776"),
          fips = Fips10_4("TN"),
          name = "Tonga",
          capital = "Nuku'alofa",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("to"),
          Currency = Currency.TOP
        )

    case Turkey extends Country(
          iso2 = ISO3166_1_Alpha2("TR"),
          iso3 = ISO3166_1_Alpha3("TUR"),
          isoNumeric = ISO3166_1_Numeric("792"),
          fips = Fips10_4("TU"),
          name = "Türkiye",
          capital = "Ankara",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tr"),
          Currency = Currency.TRY
        )

    case TrinidadAndTobago extends Country(
          iso2 = ISO3166_1_Alpha2("TT"),
          iso3 = ISO3166_1_Alpha3("TTO"),
          isoNumeric = ISO3166_1_Numeric("780"),
          fips = Fips10_4("TD"),
          name = "Trinidad and Tobago",
          capital = "Port of Spain",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("tt"),
          Currency = Currency.TTD
        )

    case Tuvalu extends Country(
          iso2 = ISO3166_1_Alpha2("TV"),
          iso3 = ISO3166_1_Alpha3("TUV"),
          isoNumeric = ISO3166_1_Numeric("798"),
          fips = Fips10_4("TV"),
          name = "Tuvalu",
          capital = "Funafuti",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tv"),
          Currency = Currency.AUD
        )

    case Taiwan extends Country(
          iso2 = ISO3166_1_Alpha2("TW"),
          iso3 = ISO3166_1_Alpha3("TWN"),
          isoNumeric = ISO3166_1_Numeric("158"),
          fips = Fips10_4("TW"),
          name = "Taiwan",
          capital = "Taipei",
          region = Region.Asia,
          subRegion = SubRegion.EasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("tw"),
          Currency = Currency.TWD
        )

    case Tanzania extends Country(
          iso2 = ISO3166_1_Alpha2("TZ"),
          iso3 = ISO3166_1_Alpha3("TZA"),
          isoNumeric = ISO3166_1_Numeric("834"),
          fips = Fips10_4("TZ"),
          name = "United Republic of Tanzania",
          capital = "Dodoma",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("tz"),
          Currency = Currency.TZS
        )

    case Ukraine extends Country(
          iso2 = ISO3166_1_Alpha2("UA"),
          iso3 = ISO3166_1_Alpha3("UKR"),
          isoNumeric = ISO3166_1_Numeric("804"),
          fips = Fips10_4("UP"),
          name = "Ukraine",
          capital = "Kyiv",
          region = Region.Europe,
          subRegion = SubRegion.EasternEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ua"),
          Currency = Currency.UAH
        )

    case Uganda extends Country(
          iso2 = ISO3166_1_Alpha2("UG"),
          iso3 = ISO3166_1_Alpha3("UGA"),
          isoNumeric = ISO3166_1_Numeric("800"),
          fips = Fips10_4("UG"),
          name = "Uganda",
          capital = "Kampala",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("ug"),
          Currency = Currency.UGX
        )

    case UnitedStatesMinorOutlyingIslands extends Country(
          iso2 = ISO3166_1_Alpha2("UM"),
          iso3 = ISO3166_1_Alpha3("UMI"),
          isoNumeric = ISO3166_1_Numeric("581"),
          fips = Absent,
          name = "United States Minor Outlying Islands",
          capital = "",
          region = Region.Oceania,
          subRegion = SubRegion.Micronesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("um"),
          Currency = Currency.USD
        )

    case UnitedStates extends Country(
          iso2 = ISO3166_1_Alpha2("US"),
          iso3 = ISO3166_1_Alpha3("USA"),
          isoNumeric = ISO3166_1_Numeric("840"),
          fips = Fips10_4("US"),
          name = "United States",
          capital = "Washington",
          region = Region.Americas,
          subRegion = SubRegion.NorthernAmerica,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("us"),
          Currency = Currency.USD
        )

    case Uruguay extends Country(
          iso2 = ISO3166_1_Alpha2("UY"),
          iso3 = ISO3166_1_Alpha3("URY"),
          isoNumeric = ISO3166_1_Numeric("858"),
          fips = Fips10_4("UY"),
          name = "Uruguay",
          capital = "Montevideo",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("uy"),
          Currency = Currency.UYU
        )

    case Uzbekistan extends Country(
          iso2 = ISO3166_1_Alpha2("UZ"),
          iso3 = ISO3166_1_Alpha3("UZB"),
          isoNumeric = ISO3166_1_Numeric("860"),
          fips = Fips10_4("UZ"),
          name = "Uzbekistan",
          capital = "Tashkent",
          region = Region.Asia,
          subRegion = SubRegion.CentralAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("uz"),
          Currency = Currency.UZS
        )

    case Vatican extends Country(
          iso2 = ISO3166_1_Alpha2("VA"),
          iso3 = ISO3166_1_Alpha3("VAT"),
          isoNumeric = ISO3166_1_Numeric("336"),
          fips = Fips10_4("VT"),
          name = "Holy See",
          capital = "Vatican City",
          region = Region.Europe,
          subRegion = SubRegion.SouthernEurope,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("va"),
          Currency = Currency.EUR
        )

    case SaintVincentAndTheGrenadines extends Country(
          iso2 = ISO3166_1_Alpha2("VC"),
          iso3 = ISO3166_1_Alpha3("VCT"),
          isoNumeric = ISO3166_1_Numeric("670"),
          fips = Fips10_4("VC"),
          name = "Saint Vincent and the Grenadines",
          capital = "Kingstown",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("vc"),
          Currency = Currency.XCD
        )

    case Venezuela extends Country(
          iso2 = ISO3166_1_Alpha2("VE"),
          iso3 = ISO3166_1_Alpha3("VEN"),
          isoNumeric = ISO3166_1_Numeric("862"),
          fips = Fips10_4("VE"),
          name = "Venezuela",
          capital = "Caracas",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.SouthAmerica,
          topLevelDomain = CcTLD("ve"),
          Currency = Currency.VES
        )

    case BritishVirginIslands extends Country(
          iso2 = ISO3166_1_Alpha2("VG"),
          iso3 = ISO3166_1_Alpha3("VGB"),
          isoNumeric = ISO3166_1_Numeric("092"),
          fips = Fips10_4("VI"),
          name = "British Virgin Islands",
          capital = "Road Town",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("vg"),
          Currency = Currency.USD
        )

    case USVirginIslands extends Country(
          iso2 = ISO3166_1_Alpha2("VI"),
          iso3 = ISO3166_1_Alpha3("VIR"),
          isoNumeric = ISO3166_1_Numeric("850"),
          fips = Fips10_4("VQ"),
          name = "U.S. Virgin Islands",
          capital = "Charlotte Amalie",
          region = Region.Americas,
          subRegion = SubRegion.LatinAmericaAndTheCaribbean,
          intermediateRegion = IntermediateRegion.Caribbean,
          topLevelDomain = CcTLD("vi"),
          Currency = Currency.USD
        )

    case Vietnam extends Country(
          iso2 = ISO3166_1_Alpha2("VN"),
          iso3 = ISO3166_1_Alpha3("VNM"),
          isoNumeric = ISO3166_1_Numeric("704"),
          fips = Fips10_4("VM"),
          name = "Vietnam",
          capital = "Hanoi",
          region = Region.Asia,
          subRegion = SubRegion.SouthEasternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("vn"),
          Currency = Currency.VND
        )

    case Vanuatu extends Country(
          iso2 = ISO3166_1_Alpha2("VU"),
          iso3 = ISO3166_1_Alpha3("VUT"),
          isoNumeric = ISO3166_1_Numeric("548"),
          fips = Fips10_4("NH"),
          name = "Vanuatu",
          capital = "Port Vila",
          region = Region.Oceania,
          subRegion = SubRegion.Melanesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("vu"),
          Currency = Currency.VUV
        )

    case WallisAndFutuna extends Country(
          iso2 = ISO3166_1_Alpha2("WF"),
          iso3 = ISO3166_1_Alpha3("WLF"),
          isoNumeric = ISO3166_1_Numeric("876"),
          fips = Fips10_4("WF"),
          name = "Wallis and Futuna",
          capital = "Mata Utu",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("wf"),
          Currency = Currency.XPF
        )

    case Samoa extends Country(
          iso2 = ISO3166_1_Alpha2("WS"),
          iso3 = ISO3166_1_Alpha3("WSM"),
          isoNumeric = ISO3166_1_Numeric("882"),
          fips = Fips10_4("WS"),
          name = "Samoa",
          capital = "Apia",
          region = Region.Oceania,
          subRegion = SubRegion.Polynesia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ws"),
          Currency = Currency.WST
        )

    case Yemen extends Country(
          iso2 = ISO3166_1_Alpha2("YE"),
          iso3 = ISO3166_1_Alpha3("YEM"),
          isoNumeric = ISO3166_1_Numeric("887"),
          fips = Fips10_4("YM"),
          name = "Yemen",
          capital = "Sanaa",
          region = Region.Asia,
          subRegion = SubRegion.WesternAsia,
          intermediateRegion = Absent,
          topLevelDomain = CcTLD("ye"),
          Currency = Currency.YER
        )

    case Mayotte extends Country(
          iso2 = ISO3166_1_Alpha2("YT"),
          iso3 = ISO3166_1_Alpha3("MYT"),
          isoNumeric = ISO3166_1_Numeric("175"),
          fips = Fips10_4("MF"),
          name = "Mayotte",
          capital = "Mamoudzou",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("yt"),
          Currency = Currency.EUR
        )

    case SouthAfrica extends Country(
          iso2 = ISO3166_1_Alpha2("ZA"),
          iso3 = ISO3166_1_Alpha3("ZAF"),
          isoNumeric = ISO3166_1_Numeric("710"),
          fips = Fips10_4("SF"),
          name = "South Africa",
          capital = "Pretoria",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.SouthernAfrica,
          topLevelDomain = CcTLD("za"),
          Currency = Currency.ZAR
        )

    case Zambia extends Country(
          iso2 = ISO3166_1_Alpha2("ZM"),
          iso3 = ISO3166_1_Alpha3("ZMB"),
          isoNumeric = ISO3166_1_Numeric("894"),
          fips = Fips10_4("ZA"),
          name = "Zambia",
          capital = "Lusaka",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("zm"),
          Currency = Currency.ZMW
        )

    case Zimbabwe extends Country(
          iso2 = ISO3166_1_Alpha2("ZW"),
          iso3 = ISO3166_1_Alpha3("ZWE"),
          isoNumeric = ISO3166_1_Numeric("716"),
          fips = Fips10_4("ZI"),
          name = "Zimbabwe",
          capital = "Harare",
          region = Region.Africa,
          subRegion = SubRegion.SubSaharanAfrica,
          intermediateRegion = IntermediateRegion.EasternAfrica,
          topLevelDomain = CcTLD("zw"),
          Currency = Currency.ZWL
        )

end Country
