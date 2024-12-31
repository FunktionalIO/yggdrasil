// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.github.iltotore.iron.*

/**
 * Represents a currency, as listed in ISO 4217.
 *
 * @param code the ISO 4217 code of the currency
 * @param name the name of the currency
 * @param numericCode the ISO 4217 numeric code of the currency
 * @param minorUnit the number of decimal places used by the currency
 */
enum Currency(
    val code: ISO4217,
    val name: String,
    val numericCode: Maybe[ISO3166_1_Numeric],
    val minorUnit: Maybe[Int]
):
    /**
     * Andorran Peseta
     */
    case ADP extends Currency(ISO4217("ADP"), "Andorran Peseta", ISO3166_1_Numeric("020"), Absent)

    /**
     * UAE Dirham
     */
    case AED extends Currency(ISO4217("AED"), "UAE Dirham", ISO3166_1_Numeric("784"), 2)

    /**
     * Afghani (old)
     */
    case AFA extends Currency(ISO4217("AFA"), "Afghani", ISO3166_1_Numeric("004"), Absent)

    /**
     * Afghani
     */
    case AFN extends Currency(ISO4217("AFN"), "Afghani", ISO3166_1_Numeric("971"), 2)

    /**
     * Old Lek
     */
    case ALK extends Currency(ISO4217("ALK"), "Old Lek", ISO3166_1_Numeric("008"), Absent)

    /**
     * Lek
     */
    case ALL extends Currency(ISO4217("ALL"), "Lek", ISO3166_1_Numeric("008"), 2)

    /**
     * Armenian Dram
     */
    case AMD extends Currency(ISO4217("AMD"), "Armenian Dram", ISO3166_1_Numeric("051"), 2)

    /**
     * Netherlands Antillean Guilder
     */
    case ANG extends Currency(ISO4217("ANG"), "Netherlands Antillean Guilder", ISO3166_1_Numeric("532"), 2)

    /**
     * Kwanza
     */
    case AOA extends Currency(ISO4217("AOA"), "Kwanza", ISO3166_1_Numeric("973"), 2)

    /**
     * Kwanza (old)
     */
    case AOK extends Currency(ISO4217("AOK"), "Kwanza", ISO3166_1_Numeric("024"), Absent)

    /**
     * New Kwanza
     */
    case AON extends Currency(ISO4217("AON"), "New Kwanza", ISO3166_1_Numeric("024"), Absent)

    /**
     * Kwanza Reajustado
     */
    case AOR extends Currency(ISO4217("AOR"), "Kwanza Reajustado", ISO3166_1_Numeric("982"), Absent)

    /**
     * Austral
     */
    case ARA extends Currency(ISO4217("ARA"), "Austral", ISO3166_1_Numeric("032"), Absent)

    /**
     * Peso Argentino
     */
    case ARP extends Currency(ISO4217("ARP"), "Peso Argentino", ISO3166_1_Numeric("032"), Absent)

    /**
     * Argentine Peso
     */
    case ARS extends Currency(ISO4217("ARS"), "Argentine Peso", ISO3166_1_Numeric("032"), 2)

    /**
     * Peso
     */
    case ARY extends Currency(ISO4217("ARY"), "Peso", ISO3166_1_Numeric("032"), Absent)

    /**
     * Schilling
     */
    case ATS extends Currency(ISO4217("ATS"), "Schilling", ISO3166_1_Numeric("040"), Absent)

    /**
     * Australian Dollar
     */
    case AUD extends Currency(ISO4217("AUD"), "Australian Dollar", ISO3166_1_Numeric("036"), 2)

    /**
     * Aruban Florin
     */
    case AWG extends Currency(ISO4217("AWG"), "Aruban Florin", ISO3166_1_Numeric("533"), 2)

    /**
     * Azerbaijan Manat (old)
     */
    case AYM extends Currency(ISO4217("AYM"), "Azerbaijan Manat", ISO3166_1_Numeric("945"), Absent)

    /**
     * Azerbaijanian Manat
     */
    case AZM extends Currency(ISO4217("AZM"), "Azerbaijanian Manat", ISO3166_1_Numeric("031"), Absent)

    /**
     * Azerbaijan Manat
     */
    case AZN extends Currency(ISO4217("AZN"), "Azerbaijan Manat", ISO3166_1_Numeric("944"), 2)

    /**
     * Dinar (Bosnia and Herzegovina)
     */
    case BAD extends Currency(ISO4217("BAD"), "Dinar", ISO3166_1_Numeric("070"), Absent)

    /**
     * Convertible Mark
     */
    case BAM extends Currency(ISO4217("BAM"), "Convertible Mark", ISO3166_1_Numeric("977"), 2)

    /**
     * Barbados Dollar
     */
    case BBD extends Currency(ISO4217("BBD"), "Barbados Dollar", ISO3166_1_Numeric("052"), 2)

    /**
     * Taka
     */
    case BDT extends Currency(ISO4217("BDT"), "Taka", ISO3166_1_Numeric("050"), 2)

    /**
     * Convertible Franc
     */
    case BEC extends Currency(ISO4217("BEC"), "Convertible Franc", ISO3166_1_Numeric("993"), Absent)

    /**
     * Belgian Franc
     */
    case BEF extends Currency(ISO4217("BEF"), "Belgian Franc", ISO3166_1_Numeric("056"), Absent)

    /**
     * Financial Franc
     */
    case BEL extends Currency(ISO4217("BEL"), "Financial Franc", ISO3166_1_Numeric("992"), Absent)

    /**
     * Lev A/52
     */
    case BGJ extends Currency(ISO4217("BGJ"), "Lev A/52", ISO3166_1_Numeric("100"), Absent)

    /**
     * Lev A/62
     */
    case BGK extends Currency(ISO4217("BGK"), "Lev A/62", ISO3166_1_Numeric("100"), Absent)

    /**
     * Lev
     */
    case BGL extends Currency(ISO4217("BGL"), "Lev", ISO3166_1_Numeric("100"), Absent)

    /**
     * Bulgarian Lev
     */
    case BGN extends Currency(ISO4217("BGN"), "Bulgarian Lev", ISO3166_1_Numeric("975"), 2)

    /**
     * Bahraini Dinar
     */
    case BHD extends Currency(ISO4217("BHD"), "Bahraini Dinar", ISO3166_1_Numeric("048"), 3)

    /**
     * Burundi Franc
     */
    case BIF extends Currency(ISO4217("BIF"), "Burundi Franc", ISO3166_1_Numeric("108"), 0)

    /**
     * Bermudian Dollar
     */
    case BMD extends Currency(ISO4217("BMD"), "Bermudian Dollar", ISO3166_1_Numeric("060"), 2)

    /**
     * Brunei Dollar
     */
    case BND extends Currency(ISO4217("BND"), "Brunei Dollar", ISO3166_1_Numeric("096"), 2)

    /**
     * Boliviano
     */
    case BOB extends Currency(ISO4217("BOB"), "Boliviano", ISO3166_1_Numeric("068"), 2)

    /**
     * Peso boliviano
     */
    case BOP extends Currency(ISO4217("BOP"), "Peso boliviano", ISO3166_1_Numeric("068"), Absent)

    /**
     * Mvdol
     */
    case BOV extends Currency(ISO4217("BOV"), "Mvdol", ISO3166_1_Numeric("984"), 2)

    /**
     * Cruzeiro (old)
     */
    case BRB extends Currency(ISO4217("BRB"), "Cruzeiro", ISO3166_1_Numeric("076"), Absent)

    /**
     * Cruzado
     */
    case BRC extends Currency(ISO4217("BRC"), "Cruzado", ISO3166_1_Numeric("076"), Absent)

    /**
     * Cruzeiro (old)
     */
    case BRE extends Currency(ISO4217("BRE"), "Cruzeiro", ISO3166_1_Numeric("076"), Absent)

    /**
     * Brazilian Real
     */
    case BRL extends Currency(ISO4217("BRL"), "Brazilian Real", ISO3166_1_Numeric("986"), 2)

    /**
     * New Cruzado
     */
    case BRN extends Currency(ISO4217("BRN"), "New Cruzado", ISO3166_1_Numeric("076"), Absent)

    /**
     * Cruzeiro Real
     */
    case BRR extends Currency(ISO4217("BRR"), "Cruzeiro Real", ISO3166_1_Numeric("987"), Absent)

    /**
     * Bahamian Dollar
     */
    case BSD extends Currency(ISO4217("BSD"), "Bahamian Dollar", ISO3166_1_Numeric("044"), 2)

    /**
     * Ngultrum
     */
    case BTN extends Currency(ISO4217("BTN"), "Ngultrum", ISO3166_1_Numeric("064"), 2)

    /**
     * Kyat (old)
     */
    case BUK extends Currency(ISO4217("BUK"), "Kyat", ISO3166_1_Numeric("104"), Absent)

    /**
     * Pula
     */
    case BWP extends Currency(ISO4217("BWP"), "Pula", ISO3166_1_Numeric("072"), 2)

    /**
     * Belarusian Ruble (old)
     */
    case BYB extends Currency(ISO4217("BYB"), "Belarusian Ruble", ISO3166_1_Numeric("112"), Absent)

    /**
     * Belarusian Ruble
     */
    case BYN extends Currency(ISO4217("BYN"), "Belarusian Ruble", ISO3166_1_Numeric("933"), 2)

    /**
     * Belarusian Ruble (old)
     */
    case BYR extends Currency(ISO4217("BYR"), "Belarusian Ruble", ISO3166_1_Numeric("974"), Absent)

    /**
     * Belize Dollar
     */
    case BZD extends Currency(ISO4217("BZD"), "Belize Dollar", ISO3166_1_Numeric("084"), 2)

    /**
     * Canadian Dollar
     */
    case CAD extends Currency(ISO4217("CAD"), "Canadian Dollar", ISO3166_1_Numeric("124"), 2)

    /**
     * Congolese Franc
     */
    case CDF extends Currency(ISO4217("CDF"), "Congolese Franc", ISO3166_1_Numeric("976"), 2)

    /**
     * WIR Franc (for electronic)
     */
    case CHC extends Currency(ISO4217("CHC"), "WIR Franc (for electronic)", ISO3166_1_Numeric("948"), Absent)

    /**
     * WIR Euro
     */
    case CHE extends Currency(ISO4217("CHE"), "WIR Euro", ISO3166_1_Numeric("947"), 2)

    /**
     * Swiss Franc
     */
    case CHF extends Currency(ISO4217("CHF"), "Swiss Franc", ISO3166_1_Numeric("756"), 2)

    /**
     * WIR Franc
     */
    case CHW extends Currency(ISO4217("CHW"), "WIR Franc", ISO3166_1_Numeric("948"), 2)

    /**
     * Unidad de Fomento
     */
    case CLF extends Currency(ISO4217("CLF"), "Unidad de Fomento", ISO3166_1_Numeric("990"), 4)

    /**
     * Chilean Peso
     */
    case CLP extends Currency(ISO4217("CLP"), "Chilean Peso", ISO3166_1_Numeric("152"), 0)

    /**
     * Yuan Renminbi
     */
    case CNY extends Currency(ISO4217("CNY"), "Yuan Renminbi", ISO3166_1_Numeric("156"), 2)

    /**
     * Colombian Peso
     */
    case COP extends Currency(ISO4217("COP"), "Colombian Peso", ISO3166_1_Numeric("170"), 2)

    /**
     * Unidad de Valor Real
     */
    case COU extends Currency(ISO4217("COU"), "Unidad de Valor Real", ISO3166_1_Numeric("970"), 2)

    /**
     * Costa Rican Colon
     */
    case CRC extends Currency(ISO4217("CRC"), "Costa Rican Colon", ISO3166_1_Numeric("188"), 2)

    /**
     * Serbian Dinar (old)
     */
    case CSD extends Currency(ISO4217("CSD"), "Serbian Dinar", ISO3166_1_Numeric("891"), Absent)

    /**
     * Krona A/53
     */
    case CSJ extends Currency(ISO4217("CSJ"), "Krona A/53", ISO3166_1_Numeric("203"), Absent)

    /**
     * Koruna
     */
    case CSK extends Currency(ISO4217("CSK"), "Koruna", ISO3166_1_Numeric("200"), Absent)

    /**
     * Peso Convertible
     */
    case CUC extends Currency(ISO4217("CUC"), "Peso Convertible", ISO3166_1_Numeric("931"), 2)

    /**
     * Cuban Peso
     */
    case CUP extends Currency(ISO4217("CUP"), "Cuban Peso", ISO3166_1_Numeric("192"), 2)

    /**
     * Cabo Verde Escudo
     */
    case CVE extends Currency(ISO4217("CVE"), "Cabo Verde Escudo", ISO3166_1_Numeric("132"), 2)

    /**
     * Cyprus Pound
     */
    case CYP extends Currency(ISO4217("CYP"), "Cyprus Pound", ISO3166_1_Numeric("196"), Absent)

    /**
     * Czech Koruna
     */
    case CZK extends Currency(ISO4217("CZK"), "Czech Koruna", ISO3166_1_Numeric("203"), 2)

    /**
     * Mark der DDR
     */
    case DDM extends Currency(ISO4217("DDM"), "Mark der DDR", ISO3166_1_Numeric("278"), Absent)

    /**
     * Deutsche Mark
     */
    case DEM extends Currency(ISO4217("DEM"), "Deutsche Mark", ISO3166_1_Numeric("276"), Absent)

    /**
     * Djibouti Franc
     */
    case DJF extends Currency(ISO4217("DJF"), "Djibouti Franc", ISO3166_1_Numeric("262"), 0)

    /**
     * Danish Krone
     */
    case DKK extends Currency(ISO4217("DKK"), "Danish Krone", ISO3166_1_Numeric("208"), 2)

    /**
     * Dominican Peso
     */
    case DOP extends Currency(ISO4217("DOP"), "Dominican Peso", ISO3166_1_Numeric("214"), 2)

    /**
     * Algerian Dinar
     */
    case DZD extends Currency(ISO4217("DZD"), "Algerian Dinar", ISO3166_1_Numeric("012"), 2)

    /**
     * Sucre
     */
    case ECS extends Currency(ISO4217("ECS"), "Sucre", ISO3166_1_Numeric("218"), Absent)

    /**
     * Unidad de Valor Constante (UVC)
     */
    case ECV extends Currency(ISO4217("ECV"), "Unidad de Valor Constante (UVC)", ISO3166_1_Numeric("983"), Absent)

    /**
     * Kroon
     */
    case EEK extends Currency(ISO4217("EEK"), "Kroon", ISO3166_1_Numeric("233"), Absent)

    /**
     * Egyptian Pound
     */
    case EGP extends Currency(ISO4217("EGP"), "Egyptian Pound", ISO3166_1_Numeric("818"), 2)

    /**
     * Nakfa
     */
    case ERN extends Currency(ISO4217("ERN"), "Nakfa", ISO3166_1_Numeric("232"), 2)

    /**
     * Spanish Peseta
     */
    case ESA extends Currency(ISO4217("ESA"), "Spanish Peseta", ISO3166_1_Numeric("996"), Absent)

    /**
     * "A" Account (convertible Peseta Account)
     */
    case ESB extends Currency(
          ISO4217("ESB"),
          """"A" Account (convertible Peseta Account)""",
          ISO3166_1_Numeric("995"),
          Absent
        )

    /**
     * Spanish Peseta
     */
    case ESP extends Currency(ISO4217("ESP"), "Spanish Peseta", ISO3166_1_Numeric("724"), Absent)

    /**
     * Ethiopian Birr
     */
    case ETB extends Currency(ISO4217("ETB"), "Ethiopian Birr", ISO3166_1_Numeric("230"), 2)

    /**
     * Euro
     */
    case EUR extends Currency(ISO4217("EUR"), "Euro", ISO3166_1_Numeric("978"), 2)

    /**
     * Markka
     */
    case FIM extends Currency(ISO4217("FIM"), "Markka", ISO3166_1_Numeric("246"), Absent)

    /**
     * Fiji Dollar
     */
    case FJD extends Currency(ISO4217("FJD"), "Fiji Dollar", ISO3166_1_Numeric("242"), 2)

    /**
     * Falkland Islands Pound
     */
    case FKP extends Currency(ISO4217("FKP"), "Falkland Islands Pound", ISO3166_1_Numeric("238"), 2)

    /**
     * French Franc
     */
    case FRF extends Currency(ISO4217("FRF"), "French Franc", ISO3166_1_Numeric("250"), Absent)

    /**
     * Pound Sterling
     */
    case GBP extends Currency(ISO4217("GBP"), "Pound Sterling", ISO3166_1_Numeric("826"), 2)

    /**
     * Georgian Kupon Larit
     */
    case GEK extends Currency(ISO4217("GEK"), "Georgian Coupon", ISO3166_1_Numeric("268"), Absent)

    /**
     * Lari
     */
    case GEL extends Currency(ISO4217("GEL"), "Lari", ISO3166_1_Numeric("981"), 2)

    /**
     * Ghana Cedi (new)
     */
    case GHC extends Currency(ISO4217("GHC"), "Cedi", ISO3166_1_Numeric("288"), Absent)

    /**
     * Ghana Cedi
     */
    case GHP extends Currency(ISO4217("GHP"), "Ghana Cedi", ISO3166_1_Numeric("939"), Absent)

    /**
     * Ghana Cedi
     */
    case GHS extends Currency(ISO4217("GHS"), "Ghana Cedi", ISO3166_1_Numeric("936"), 2)

    /**
     * Gibraltar Pound
     */
    case GIP extends Currency(ISO4217("GIP"), "Gibraltar Pound", ISO3166_1_Numeric("292"), 2)

    /**
     * Dalasi
     */
    case GMD extends Currency(ISO4217("GMD"), "Dalasi", ISO3166_1_Numeric("270"), 2)

    /**
     * Syli
     */
    case GNE extends Currency(ISO4217("GNE"), "Syli", ISO3166_1_Numeric("324"), Absent)

    /**
     * Guinean Franc
     */
    case GNF extends Currency(ISO4217("GNF"), "Guinean Franc", ISO3166_1_Numeric("324"), 0)

    /**
     * Syli
     */
    case GNS extends Currency(ISO4217("GNS"), "Syli", ISO3166_1_Numeric("324"), Absent)

    /**
     * Equatorial Guinea Ekwele
     */
    case GQE extends Currency(ISO4217("GQE"), "Ekwele", ISO3166_1_Numeric("226"), Absent)

    /**
     * Greek Drachma
     */
    case GRD extends Currency(ISO4217("GRD"), "Drachma", ISO3166_1_Numeric("300"), Absent)

    /**
     * Quetzal
     */
    case GTQ extends Currency(ISO4217("GTQ"), "Quetzal", ISO3166_1_Numeric("320"), 2)

    /**
     * Portuguese Guinea Escudo
     */
    case GWE extends Currency(ISO4217("GWE"), "Guinea Escudo", ISO3166_1_Numeric("624"), Absent)

    /**
     * Guinea-Bissau Peso
     */
    case GWP extends Currency(ISO4217("GWP"), "Guinea-Bissau Peso", ISO3166_1_Numeric("624"), Absent)

    /**
     * Guyana Dollar
     */
    case GYD extends Currency(ISO4217("GYD"), "Guyana Dollar", ISO3166_1_Numeric("328"), 2)

    /**
     * Hong Kong Dollar
     */
    case HKD extends Currency(ISO4217("HKD"), "Hong Kong Dollar", ISO3166_1_Numeric("344"), 2)

    /**
     * Lempira
     */
    case HNL extends Currency(ISO4217("HNL"), "Lempira", ISO3166_1_Numeric("340"), 2)

    /**
     * Croatian Dinar
     */
    case HRD extends Currency(ISO4217("HRD"), "Croatian Dinar", ISO3166_1_Numeric("191"), Absent)

    /**
     * Croatian Kuna
     */
    case HRK extends Currency(ISO4217("HRK"), "Kuna", ISO3166_1_Numeric("191"), Absent)

    /**
     * Gourde
     */
    case HTG extends Currency(ISO4217("HTG"), "Gourde", ISO3166_1_Numeric("332"), 2)

    /**
     * Forint
     */
    case HUF extends Currency(ISO4217("HUF"), "Forint", ISO3166_1_Numeric("348"), 2)

    /**
     * Rupiah
     */
    case IDR extends Currency(ISO4217("IDR"), "Rupiah", ISO3166_1_Numeric("360"), 2)

    /**
     * Irish Pound
     */
    case IEP extends Currency(ISO4217("IEP"), "Irish Pound", ISO3166_1_Numeric("372"), Absent)

    /**
     * Israeli Pound
     */
    case ILP extends Currency(ISO4217("ILP"), "Pound", ISO3166_1_Numeric("376"), Absent)

    /**
     * Old Shekel
     */
    case ILR extends Currency(ISO4217("ILR"), "Old Shekel", ISO3166_1_Numeric("376"), Absent)

    /**
     * New Israeli Sheqel
     */
    case ILS extends Currency(ISO4217("ILS"), "New Israeli Sheqel", ISO3166_1_Numeric("376"), 2)

    /**
     * Indian Rupee
     */
    case INR extends Currency(ISO4217("INR"), "Indian Rupee", ISO3166_1_Numeric("356"), 2)

    /**
     * Iraqi Dinar
     */
    case IQD extends Currency(ISO4217("IQD"), "Iraqi Dinar", ISO3166_1_Numeric("368"), 3)

    /**
     * Iranian Rial
     */
    case IRR extends Currency(ISO4217("IRR"), "Iranian Rial", ISO3166_1_Numeric("364"), 2)

    /**
     * Iceland Old Krona
     */
    case ISJ extends Currency(ISO4217("ISJ"), "Old Krona", ISO3166_1_Numeric("352"), Absent)

    /**
     * Iceland Krona
     */
    case ISK extends Currency(ISO4217("ISK"), "Iceland Krona", ISO3166_1_Numeric("352"), 0)

    /**
     * Italian Lira
     */
    case ITL extends Currency(ISO4217("ITL"), "Italian Lira", ISO3166_1_Numeric("380"), Absent)

    /**
     * Jamaican Dollar
     */
    case JMD extends Currency(ISO4217("JMD"), "Jamaican Dollar", ISO3166_1_Numeric("388"), 2)

    /**
     * Jordanian Dinar
     */
    case JOD extends Currency(ISO4217("JOD"), "Jordanian Dinar", ISO3166_1_Numeric("400"), 3)

    /**
     * Yen
     */
    case JPY extends Currency(ISO4217("JPY"), "Yen", ISO3166_1_Numeric("392"), 0)

    /**
     * Kenyan Shilling
     */
    case KES extends Currency(ISO4217("KES"), "Kenyan Shilling", ISO3166_1_Numeric("404"), 2)

    /**
     * Som
     */
    case KGS extends Currency(ISO4217("KGS"), "Som", ISO3166_1_Numeric("417"), 2)

    /**
     * Riel
     */
    case KHR extends Currency(ISO4217("KHR"), "Riel", ISO3166_1_Numeric("116"), 2)

    /**
     * Comorian Franc
     */
    case KMF extends Currency(ISO4217("KMF"), "Comorian Franc", ISO3166_1_Numeric("174"), 0)

    /**
     * North Korean Won
     */
    case KPW extends Currency(ISO4217("KPW"), "North Korean Won", ISO3166_1_Numeric("408"), 2)

    /**
     * Won
     */
    case KRW extends Currency(ISO4217("KRW"), "Won", ISO3166_1_Numeric("410"), 0)

    /**
     * Kuwaiti Dinar
     */
    case KWD extends Currency(ISO4217("KWD"), "Kuwaiti Dinar", ISO3166_1_Numeric("414"), 3)

    /**
     * Cayman Islands Dollar
     */
    case KYD extends Currency(ISO4217("KYD"), "Cayman Islands Dollar", ISO3166_1_Numeric("136"), 2)

    /**
     * Tenge
     */
    case KZT extends Currency(ISO4217("KZT"), "Tenge", ISO3166_1_Numeric("398"), 2)

    /**
     * Pathet Lao Kip
     */
    case LAJ extends Currency(ISO4217("LAJ"), "Pathet Lao Kip", ISO3166_1_Numeric("418"), Absent)

    /**
     * Lao Kip
     */
    case LAK extends Currency(ISO4217("LAK"), "Lao Kip", ISO3166_1_Numeric("418"), 2)

    /**
     * Lebanese Pound
     */
    case LBP extends Currency(ISO4217("LBP"), "Lebanese Pound", ISO3166_1_Numeric("422"), 2)

    /**
     * Sri Lanka Rupee
     */
    case LKR extends Currency(ISO4217("LKR"), "Sri Lanka Rupee", ISO3166_1_Numeric("144"), 2)

    /**
     * Liberian Dollar
     */
    case LRD extends Currency(ISO4217("LRD"), "Liberian Dollar", ISO3166_1_Numeric("430"), 2)

    /**
     * Loti
     */
    case LSL extends Currency(ISO4217("LSL"), "Loti", ISO3166_1_Numeric("426"), 2)

    /**
     * Loti
     */
    case LSM extends Currency(ISO4217("LSM"), "Loti", ISO3166_1_Numeric("426"), Absent)

    /**
     * Lithuanian Litas
     */
    case LTL extends Currency(ISO4217("LTL"), "Lithuanian Litas", ISO3166_1_Numeric("440"), Absent)

    /**
     * Talonas
     */
    case LTT extends Currency(ISO4217("LTT"), "Talonas", ISO3166_1_Numeric("440"), Absent)

    /**
     * Luxembourg Convertible Franc
     */
    case LUC extends Currency(ISO4217("LUC"), "Luxembourg Convertible Franc", ISO3166_1_Numeric("989"), Absent)

    /**
     * Luxembourg Franc
     */
    case LUF extends Currency(ISO4217("LUF"), "Luxembourg Franc", ISO3166_1_Numeric("442"), Absent)

    /**
     * Luxembourg Financial Franc
     */
    case LUL extends Currency(ISO4217("LUL"), "Luxembourg Financial Franc", ISO3166_1_Numeric("988"), Absent)

    /**
     * Latvian Lats
     */
    case LVL extends Currency(ISO4217("LVL"), "Latvian Lats", ISO3166_1_Numeric("428"), Absent)

    /**
     * Latvian Ruble
     */
    case LVR extends Currency(ISO4217("LVR"), "Latvian Ruble", ISO3166_1_Numeric("428"), Absent)

    /**
     * Libyan Dinar
     */
    case LYD extends Currency(ISO4217("LYD"), "Libyan Dinar", ISO3166_1_Numeric("434"), 3)

    /**
     * Moroccan Dirham
     */
    case MAD extends Currency(ISO4217("MAD"), "Moroccan Dirham", ISO3166_1_Numeric("504"), 2)

    /**
     * Moldovan Leu
     */
    case MDL extends Currency(ISO4217("MDL"), "Moldovan Leu", ISO3166_1_Numeric("498"), 2)

    /**
     * Malagasy Ariary
     */
    case MGA extends Currency(ISO4217("MGA"), "Malagasy Ariary", ISO3166_1_Numeric("969"), 2)

    /**
     * Malagasy Franc
     */
    case MGF extends Currency(ISO4217("MGF"), "Malagasy Franc", ISO3166_1_Numeric("450"), Absent)

    /**
     * Denar
     */
    case MKD extends Currency(ISO4217("MKD"), "Denar", ISO3166_1_Numeric("807"), 2)

    /**
     * Mali Franc
     */
    case MLF extends Currency(ISO4217("MLF"), "Mali Franc", ISO3166_1_Numeric("466"), Absent)

    /**
     * Kyat
     */
    case MMK extends Currency(ISO4217("MMK"), "Kyat", ISO3166_1_Numeric("104"), 2)

    /**
     * Tugrik
     */
    case MNT extends Currency(ISO4217("MNT"), "Tugrik", ISO3166_1_Numeric("496"), 2)

    /**
     * Pataca
     */
    case MOP extends Currency(ISO4217("MOP"), "Pataca", ISO3166_1_Numeric("446"), 2)

    /**
     * Ouguiya
     */
    case MRO extends Currency(ISO4217("MRO"), "Ouguiya", ISO3166_1_Numeric("478"), Absent)

    /**
     * Mauritania Ouguiya
     */
    case MRU extends Currency(ISO4217("MRU"), "Ouguiya", ISO3166_1_Numeric("929"), 2)

    /**
     * Maltese Lira
     */
    case MTL extends Currency(ISO4217("MTL"), "Maltese Lira", ISO3166_1_Numeric("470"), Absent)

    /**
     * Maltese Pound
     */
    case MTP extends Currency(ISO4217("MTP"), "Maltese Pound", ISO3166_1_Numeric("470"), Absent)

    /**
     * Mauritius Rupee
     */
    case MUR extends Currency(ISO4217("MUR"), "Mauritius Rupee", ISO3166_1_Numeric("480"), 2)

    /**
     * Maldives Rupee
     */
    case MVQ extends Currency(ISO4217("MVQ"), "Maldive Rupee", ISO3166_1_Numeric("462"), Absent)

    /**
     * Rufiyaa
     */
    case MVR extends Currency(ISO4217("MVR"), "Rufiyaa", ISO3166_1_Numeric("462"), 2)

    /**
     * Malawi Kwacha
     */
    case MWK extends Currency(ISO4217("MWK"), "Malawi Kwacha", ISO3166_1_Numeric("454"), 2)

    /**
     * Mexican Peso
     */
    case MXN extends Currency(ISO4217("MXN"), "Mexican Peso", ISO3166_1_Numeric("484"), 2)

    /**
     * Mexican Peso
     */
    case MXP extends Currency(ISO4217("MXP"), "Mexican Peso", ISO3166_1_Numeric("484"), Absent)

    /**
     * Mexican Unidad de Inversion (UDI)
     */
    case MXV extends Currency(ISO4217("MXV"), "Mexican Unidad de Inversion (UDI)", ISO3166_1_Numeric("979"), 2)

    /**
     * Malaysian Ringgit
     */
    case MYR extends Currency(ISO4217("MYR"), "Malaysian Ringgit", ISO3166_1_Numeric("458"), 2)

    /**
     * Mozambique Escudo
     */
    case MZE extends Currency(ISO4217("MZE"), "Mozambique Escudo", ISO3166_1_Numeric("508"), Absent)

    /**
     * Mozambique Metical
     */
    case MZM extends Currency(ISO4217("MZM"), "Mozambique Metical", ISO3166_1_Numeric("508"), Absent)

    /**
     * Mozambique Metical
     */
    case MZN extends Currency(ISO4217("MZN"), "Mozambique Metical", ISO3166_1_Numeric("943"), 2)

    /**
     * Namibia Dollar
     */
    case NAD extends Currency(ISO4217("NAD"), "Namibia Dollar", ISO3166_1_Numeric("516"), 2)

    /**
     * Naira
     */
    case NGN extends Currency(ISO4217("NGN"), "Naira", ISO3166_1_Numeric("566"), 2)

    /**
     * Cordoba
     */
    case NIC extends Currency(ISO4217("NIC"), "Cordoba", ISO3166_1_Numeric("558"), Absent)

    /**
     * Cordoba Oro
     */
    case NIO extends Currency(ISO4217("NIO"), "Cordoba Oro", ISO3166_1_Numeric("558"), 2)

    /**
     * Dutch Guilder
     */
    case NLG extends Currency(ISO4217("NLG"), "Netherlands Guilder", ISO3166_1_Numeric("528"), Absent)

    /**
     * Norwegian Krone
     */
    case NOK extends Currency(ISO4217("NOK"), "Norwegian Krone", ISO3166_1_Numeric("578"), 2)

    /**
     * Nepalese Rupee
     */
    case NPR extends Currency(ISO4217("NPR"), "Nepalese Rupee", ISO3166_1_Numeric("524"), 2)

    /**
     * New Zealand Dollar
     */
    case NZD extends Currency(ISO4217("NZD"), "New Zealand Dollar", ISO3166_1_Numeric("554"), 2)

    /**
     * Rial Omani
     */
    case OMR extends Currency(ISO4217("OMR"), "Rial Omani", ISO3166_1_Numeric("512"), 3)

    /**
     * Balboa
     */
    case PAB extends Currency(ISO4217("PAB"), "Balboa", ISO3166_1_Numeric("590"), 2)

    /**
     * Peruvian Nuevo Sol
     */
    case PEH extends Currency(ISO4217("PEH"), "Sol", ISO3166_1_Numeric("604"), Absent)

    /**
     * Sol Inti
     */
    case PEI extends Currency(ISO4217("PEI"), "Inti", ISO3166_1_Numeric("604"), Absent)

    /**
     * Sol
     */
    case PEN extends Currency(ISO4217("PEN"), "Sol", ISO3166_1_Numeric("604"), 2)

    /**
     * Sol
     */
    case PES extends Currency(ISO4217("PES"), "Sol", ISO3166_1_Numeric("604"), Absent)

    /**
     * Papua New Guinea Kina
     */
    case PGK extends Currency(ISO4217("PGK"), "Kina", ISO3166_1_Numeric("598"), 2)

    /**
     * Philippine Peso
     */
    case PHP extends Currency(ISO4217("PHP"), "Philippine Peso", ISO3166_1_Numeric("608"), 2)

    /**
     * Pakistan Rupee
     */
    case PKR extends Currency(ISO4217("PKR"), "Pakistan Rupee", ISO3166_1_Numeric("586"), 2)

    /**
     * Zloty
     */
    case PLN extends Currency(ISO4217("PLN"), "Zloty", ISO3166_1_Numeric("985"), 2)

    /**
     * Zloty
     */
    case PLZ extends Currency(ISO4217("PLZ"), "Zloty", ISO3166_1_Numeric("616"), Absent)

    /**
     * Portuguese Escudo
     */
    case PTE extends Currency(ISO4217("PTE"), "Portuguese Escudo", ISO3166_1_Numeric("620"), Absent)

    /**
     * Guarani
     */
    case PYG extends Currency(ISO4217("PYG"), "Guarani", ISO3166_1_Numeric("600"), 0)

    /**
     * Qatari Rial
     */
    case QAR extends Currency(ISO4217("QAR"), "Qatari Rial", ISO3166_1_Numeric("634"), 2)

    /**
     * Rhodesian Dollar
     */
    case RHD extends Currency(ISO4217("RHD"), "Rhodesian Dollar", ISO3166_1_Numeric("716"), Absent)

    /**
     * Romanian Leu
     */
    case ROK extends Currency(ISO4217("ROK"), "Leu A/52", ISO3166_1_Numeric("642"), Absent)

    /**
     * Old Leu
     */
    case ROL extends Currency(ISO4217("ROL"), "Old Leu", ISO3166_1_Numeric("642"), Absent)

    /**
     * Romanian Leu
     */
    case RON extends Currency(ISO4217("RON"), "Romanian Leu", ISO3166_1_Numeric("946"), 2)

    /**
     * Serbian Dinar
     */
    case RSD extends Currency(ISO4217("RSD"), "Serbian Dinar", ISO3166_1_Numeric("941"), 2)

    /**
     * Russian Ruble
     */
    case RUB extends Currency(ISO4217("RUB"), "Russian Ruble", ISO3166_1_Numeric("643"), 2)

    /**
     * Russian Ruble
     */
    case RUR extends Currency(ISO4217("RUR"), "Russian Ruble", ISO3166_1_Numeric("810"), Absent)

    /**
     * Rwanda Franc
     */
    case RWF extends Currency(ISO4217("RWF"), "Rwanda Franc", ISO3166_1_Numeric("646"), 0)

    /**
     * Saudi Riyal
     */
    case SAR extends Currency(ISO4217("SAR"), "Saudi Riyal", ISO3166_1_Numeric("682"), 2)

    /**
     * Solomon Islands Dollar
     */
    case SBD extends Currency(ISO4217("SBD"), "Solomon Islands Dollar", ISO3166_1_Numeric("090"), 2)

    /**
     * Seychelles Rupee
     */
    case SCR extends Currency(ISO4217("SCR"), "Seychelles Rupee", ISO3166_1_Numeric("690"), 2)

    /**
     * Sudanese Dinar
     */
    case SDD extends Currency(ISO4217("SDD"), "Sudanese Dinar", ISO3166_1_Numeric("736"), Absent)

    /**
     * Sudanese Pound
     */
    case SDG extends Currency(ISO4217("SDG"), "Sudanese Pound", ISO3166_1_Numeric("938"), 2)

    /**
     * Sudanese Pound
     */
    case SDP extends Currency(ISO4217("SDP"), "Sudanese Pound", ISO3166_1_Numeric("736"), Absent)

    /**
     * Swedish Krona
     */
    case SEK extends Currency(ISO4217("SEK"), "Swedish Krona", ISO3166_1_Numeric("752"), 2)

    /**
     * Singapore Dollar
     */
    case SGD extends Currency(ISO4217("SGD"), "Singapore Dollar", ISO3166_1_Numeric("702"), 2)

    /**
     * St. Helena Pound
     */
    case SHP extends Currency(ISO4217("SHP"), "Saint Helena Pound", ISO3166_1_Numeric("654"), 2)

    /**
     * Tolar
     */
    case SIT extends Currency(ISO4217("SIT"), "Tolar", ISO3166_1_Numeric("705"), Absent)

    /**
     * Slovak Koruna
     */
    case SKK extends Currency(ISO4217("SKK"), "Slovak Koruna", ISO3166_1_Numeric("703"), Absent)

    /**
     * Leone
     */
    case SLE extends Currency(ISO4217("SLE"), "Leone", ISO3166_1_Numeric("925"), 2)

    /**
     * Somali Shilling
     */
    case SLL extends Currency(ISO4217("SLL"), "Leone", ISO3166_1_Numeric("694"), Absent)

    /**
     * Somali Shilling
     */
    case SOS extends Currency(ISO4217("SOS"), "Somali Shilling", ISO3166_1_Numeric("706"), 2)

    /**
     * Surinam Guilder
     */
    case SRD extends Currency(ISO4217("SRD"), "Surinam Dollar", ISO3166_1_Numeric("968"), 2)

    /**
     * Surinam Guilder
     */
    case SRG extends Currency(ISO4217("SRG"), "Surinam Guilder", ISO3166_1_Numeric("740"), Absent)

    /**
     * South Sudanese Pound
     */
    case SSP extends Currency(ISO4217("SSP"), "South Sudanese Pound", ISO3166_1_Numeric("728"), 2)

    /**
     * Dobra
     */
    case STD extends Currency(ISO4217("STD"), "Dobra", ISO3166_1_Numeric("678"), Absent)

    /**
     * Dobra
     */
    case STN extends Currency(ISO4217("STN"), "Dobra", ISO3166_1_Numeric("930"), 2)

    /**
     * Suriname Guilder
     */
    case SUR extends Currency(ISO4217("SUR"), "Rouble", ISO3166_1_Numeric("810"), Absent)

    /**
     * El Salvador Colon
     */
    case SVC extends Currency(ISO4217("SVC"), "El Salvador Colon", ISO3166_1_Numeric("222"), 2)

    /**
     * Syrian Pound
     */
    case SYP extends Currency(ISO4217("SYP"), "Syrian Pound", ISO3166_1_Numeric("760"), 2)

    /**
     * Lilangeni
     */
    case SZL extends Currency(ISO4217("SZL"), "Lilangeni", ISO3166_1_Numeric("748"), 2)

    /**
     * Baht
     */
    case THB extends Currency(ISO4217("THB"), "Baht", ISO3166_1_Numeric("764"), 2)

    /**
     * Tajik Ruble
     */
    case TJR extends Currency(ISO4217("TJR"), "Tajik Ruble", ISO3166_1_Numeric("762"), Absent)

    /**
     * Somoni
     */
    case TJS extends Currency(ISO4217("TJS"), "Somoni", ISO3166_1_Numeric("972"), 2)

    /**
     * Turkmenistan Manat
     */
    case TMM extends Currency(ISO4217("TMM"), "Turkmenistan Manat", ISO3166_1_Numeric("795"), Absent)

    /**
     * Turkmenistan New Manat
     */
    case TMT extends Currency(ISO4217("TMT"), "Turkmenistan New Manat", ISO3166_1_Numeric("934"), 2)

    /**
     * Tunisian Dinar
     */
    case TND extends Currency(ISO4217("TND"), "Tunisian Dinar", ISO3166_1_Numeric("788"), 3)

    /**
     * Paʻanga
     */
    case TOP extends Currency(ISO4217("TOP"), "Paʻanga", ISO3166_1_Numeric("776"), 2)

    /**
     * Timor Escudo
     */
    case TPE extends Currency(ISO4217("TPE"), "Timor Escudo", ISO3166_1_Numeric("626"), Absent)

    /**
     * Turkish Lira
     */
    case TRL extends Currency(ISO4217("TRL"), "Old Turkish Lira", ISO3166_1_Numeric("792"), Absent)

    /**
     * Turkish Lira
     */
    case TRY extends Currency(ISO4217("TRY"), "Turkish Lira", ISO3166_1_Numeric("949"), 2)

    /**
     * Trinidad and Tobago Dollar
     */
    case TTD extends Currency(ISO4217("TTD"), "Trinidad and Tobago Dollar", ISO3166_1_Numeric("780"), 2)

    /**
     * New Taiwan Dollar
     */
    case TWD extends Currency(ISO4217("TWD"), "New Taiwan Dollar", ISO3166_1_Numeric("901"), 2)

    /**
     * Tanzanian Shilling
     */
    case TZS extends Currency(ISO4217("TZS"), "Tanzanian Shilling", ISO3166_1_Numeric("834"), 2)

    /**
     * Hryvnia
     */
    case UAH extends Currency(ISO4217("UAH"), "Hryvnia", ISO3166_1_Numeric("980"), 2)

    /**
     * Karbovanet
     */
    case UAK extends Currency(ISO4217("UAK"), "Karbovanet", ISO3166_1_Numeric("804"), Absent)

    /**
     * Uganda Shilling
     */
    case UGS extends Currency(ISO4217("UGS"), "Uganda Shilling", ISO3166_1_Numeric("800"), Absent)

    /**
     * Old Shilling
     */
    case UGW extends Currency(ISO4217("UGW"), "Old Shilling", ISO3166_1_Numeric("800"), Absent)

    /**
     * Uganda Shilling
     */
    case UGX extends Currency(ISO4217("UGX"), "Uganda Shilling", ISO3166_1_Numeric("800"), 0)

    /**
     * US Dollar
     */
    case USD extends Currency(ISO4217("USD"), "US Dollar", ISO3166_1_Numeric("840"), 2)

    /**
     * US Dollar (Next day)
     */
    case USN extends Currency(ISO4217("USN"), "US Dollar (Next day)", ISO3166_1_Numeric("997"), 2)

    /**
     * US Dollar (Same day)
     */
    case USS extends Currency(ISO4217("USS"), "US Dollar (Same day)", ISO3166_1_Numeric("998"), Absent)

    /**
     * Uruguay Peso en Unidades Indexadas (UI)
     */
    case UYI extends Currency(ISO4217("UYI"), "Uruguay Peso en Unidades Indexadas (UI)", ISO3166_1_Numeric("940"), 0)

    /**
     * Old Peso Uruguayo
     */
    case UYN extends Currency(ISO4217("UYN"), "Old Uruguay Peso", ISO3166_1_Numeric("858"), Absent)

    /**
     * Peso Uruguayo
     */
    case UYP extends Currency(ISO4217("UYP"), "Uruguayan Peso", ISO3166_1_Numeric("858"), Absent)

    /**
     * Peso Uruguayo
     */
    case UYU extends Currency(ISO4217("UYU"), "Peso Uruguayo", ISO3166_1_Numeric("858"), 2)

    /**
     * Unidad Previsional
     */
    case UYW extends Currency(ISO4217("UYW"), "Unidad Previsional", ISO3166_1_Numeric("927"), 4)

    /**
     * Uzbekistan Sum
     */
    case UZS extends Currency(ISO4217("UZS"), "Uzbekistan Sum", ISO3166_1_Numeric("860"), 2)

    /**
     * Bolivar
     */
    case VEB extends Currency(ISO4217("VEB"), "Bolivar", ISO3166_1_Numeric("862"), Absent)

    /**
     * Bolivar Fuerte
     */
    case VED extends Currency(ISO4217("VED"), "Bolivar Soberano", ISO3166_1_Numeric("926"), 2)

    /**
     * Bolivar
     */
    case VEF extends Currency(ISO4217("VEF"), "Bolivar", ISO3166_1_Numeric("937"), Absent)

    /**
     * Bolivar Fuerte
     */
    case VES extends Currency(ISO4217("VES"), "Bolivar Soberano", ISO3166_1_Numeric("928"), 2)

    /**
     * Old Dong
     */
    case VNC extends Currency(ISO4217("VNC"), "Old Dong", ISO3166_1_Numeric("704"), Absent)

    /**
     * Dong
     */
    case VND extends Currency(ISO4217("VND"), "Dong", ISO3166_1_Numeric("704"), 0)

    /**
     * Vanuatu Vatu
     */
    case VUV extends Currency(ISO4217("VUV"), "Vatu", ISO3166_1_Numeric("548"), 0)

    /**
     * Tala
     */
    case WST extends Currency(ISO4217("WST"), "Tala", ISO3166_1_Numeric("882"), 2)

    /**
     * CFA Franc BEAC
     */
    case XAF extends Currency(ISO4217("XAF"), "CFA Franc BEAC", ISO3166_1_Numeric("950"), 0)

    /**
     * Silver
     */
    case XAG extends Currency(ISO4217("XAG"), "Silver", ISO3166_1_Numeric("961"), Absent)

    /**
     * Gold
     */
    case XAU extends Currency(ISO4217("XAU"), "Gold", ISO3166_1_Numeric("959"), Absent)

    /**
     * European Composite Unit (EURCO)
     */
    case XBA extends Currency(
          ISO4217("XBA"),
          "Bond Markets Unit European Composite Unit (EURCO)",
          ISO3166_1_Numeric("955"),
          Absent
        )

    /**
     * European Monetary Unit (E.M.U.-6)
     */
    case XBB extends Currency(
          ISO4217("XBB"),
          "Bond Markets Unit European Monetary Unit (E.M.U.-6)",
          ISO3166_1_Numeric("956"),
          Absent
        )

    /**
     * European Unit of Account 9 (E.U.A.-9)
     */
    case XBC extends Currency(
          ISO4217("XBC"),
          "Bond Markets Unit European Unit of Account 9 (E.U.A.-9)",
          ISO3166_1_Numeric("957"),
          Absent
        )

    /**
     * European Unit of Account 17 (E.U.A.-17)
     */
    case XBD extends Currency(
          ISO4217("XBD"),
          "Bond Markets Unit European Unit of Account 17 (E.U.A.-17)",
          ISO3166_1_Numeric("958"),
          Absent
        )

    /**
     * East Caribbean Dollar
     */
    case XCD extends Currency(ISO4217("XCD"), "East Caribbean Dollar", ISO3166_1_Numeric("951"), 2)

    /**
     * SDR (Special Drawing Right)
     */
    case XDR extends Currency(ISO4217("XDR"), "SDR (Special Drawing Right)", ISO3166_1_Numeric("960"), Absent)

    /**
     * European Currency Unit (E.C.U)
     */
    case XEU extends Currency(ISO4217("XEU"), "European Currency Unit (E.C.U)", ISO3166_1_Numeric("954"), Absent)

    /**
     * Gold-Franc
     */
    case XFO extends Currency(ISO4217("XFO"), "Gold-Franc", Absent, Absent)

    /**
     * UIC-Franc
     */
    case XFU extends Currency(ISO4217("XFU"), "UIC-Franc", Absent, Absent)

    /**
     * CFA Franc BCEAO
     */
    case XOF extends Currency(ISO4217("XOF"), "CFA Franc BCEAO", ISO3166_1_Numeric("952"), 0)

    /**
     * Palladium
     */
    case XPD extends Currency(ISO4217("XPD"), "Palladium", ISO3166_1_Numeric("964"), Absent)

    /**
     * CFP Franc
     */
    case XPF extends Currency(ISO4217("XPF"), "CFP Franc", ISO3166_1_Numeric("953"), 0)

    /**
     * Platinum
     */
    case XPT extends Currency(ISO4217("XPT"), "Platinum", ISO3166_1_Numeric("962"), Absent)

    /**
     * RINET Funds
     */
    case XRE extends Currency(ISO4217("XRE"), "RINET Funds Code", Absent, Absent)

    /**
     * Sucre
     */
    case XSU extends Currency(ISO4217("XSU"), "Sucre", ISO3166_1_Numeric("994"), Absent)

    /**
     * Codes specifically reserved for testing purposes
     */
    case XTS extends Currency(
          ISO4217("XTS"),
          "Codes specifically reserved for testing purposes",
          ISO3166_1_Numeric("963"),
          Absent
        )

    /**
     * ADB Unit of Account
     */
    case XUA extends Currency(ISO4217("XUA"), "ADB Unit of Account", ISO3166_1_Numeric("965"), Absent)

    /**
     * The codes assigned for transactions where no currency is involved
     */
    case XXX extends Currency(
          ISO4217("XXX"),
          "The codes assigned for transactions where no currency is involved",
          ISO3166_1_Numeric("999"),
          Absent
        )

    /**
     * Yemeni Dinar
     */
    case YDD extends Currency(ISO4217("YDD"), "Yemeni Dinar", ISO3166_1_Numeric("720"), Absent)

    /**
     * Yemeni Rial
     */
    case YER extends Currency(ISO4217("YER"), "Yemeni Rial", ISO3166_1_Numeric("886"), 2)

    /**
     * New Yugoslavian Dinar
     */
    case YUD extends Currency(ISO4217("YUD"), "New Yugoslavian Dinar", ISO3166_1_Numeric("890"), Absent)

    /**
     * Yugoslavian New Dinar
     */
    case YUM extends Currency(ISO4217("YUM"), "New Dinar", ISO3166_1_Numeric("891"), Absent)

    /**
     * Yugoslavian Convertible Dinar
     */
    case YUN extends Currency(ISO4217("YUN"), "Yugoslavian Dinar", ISO3166_1_Numeric("890"), Absent)

    /**
     * South African Financial Rand
     */
    case ZAL extends Currency(ISO4217("ZAL"), "Financial Rand", ISO3166_1_Numeric("991"), Absent)

    /**
     * Rand
     */
    case ZAR extends Currency(ISO4217("ZAR"), "Rand", ISO3166_1_Numeric("710"), 2)

    /**
     * Zambian Kwacha
     */
    case ZMK extends Currency(ISO4217("ZMK"), "Zambian Kwacha", ISO3166_1_Numeric("894"), Absent)

    /**
     * Zambian Kwacha
     */
    case ZMW extends Currency(ISO4217("ZMW"), "Zambian Kwacha", ISO3166_1_Numeric("967"), 2)

    /**
     * New Zaire
     */
    case ZRN extends Currency(ISO4217("ZRN"), "New Zaire", ISO3166_1_Numeric("180"), Absent)

    /**
     * Zaire
     */
    case ZRZ extends Currency(ISO4217("ZRZ"), "Zaire", ISO3166_1_Numeric("180"), Absent)

    /**
     * Zimbabwe Dollar
     */
    case ZWC extends Currency(ISO4217("ZWC"), "Rhodesian Dollar", ISO3166_1_Numeric("716"), Absent)

    /**
     * Zimbabwe Dollar
     */
    case ZWD extends Currency(ISO4217("ZWD"), "Zimbabwe Dollar", ISO3166_1_Numeric("716"), Absent)

    /**
     * Zimbabwe Dollar
     */
    case ZWG extends Currency(ISO4217("ZWG"), "Zimbabwe Gold", ISO3166_1_Numeric("924"), 2)

    /**
     * Zimbabwe Dollar
     */
    case ZWL extends Currency(ISO4217("ZWL"), "Zimbabwe Dollar", ISO3166_1_Numeric("932"), Absent)

    /**
     * Zimbabwe Dollar
     */
    case ZWN extends Currency(ISO4217("ZWN"), "Zimbabwe Dollar (new)", ISO3166_1_Numeric("942"), Absent)

    /**
     * Zimbabwe Dollar
     */
    case ZWR extends Currency(ISO4217("ZWR"), "Zimbabwe Dollar", ISO3166_1_Numeric("935"), Absent)
end Currency
