// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil

import io.github.iltotore.iron.*

/**
 * Enumeration representing major languages (all languages that have a ISO 639-1 code) with their ISO 639 codes and names.
 *
 * @param iso The ISO 639-1 code for the language.
 * @param iso2T The ISO 639-2 Terminology code for the language.
 * @param iso2B The ISO 639-2 Bibliographic code for the language.
 * @param iso3 The ISO 639-3 code for the language.
 * @param name The name of the language.
 */
enum Language(
    val iso: ISO639_1,
    val iso2T: Maybe[ISO639_2],
    val iso2B: Maybe[ISO639_2],
    val iso3: Maybe[ISO639_3],
    val name: String
):
    /**
     * Bihari languages
     */
    case Bihari extends Language(ISO639_1("bh"), ISO639_2("bih"), ISO639_2("bih"), Absent, "Bihari languages")

    /**
     * Afar language
     */
    case Afar extends Language(ISO639_1("aa"), ISO639_2("aar"), ISO639_2("aar"), ISO639_3("aar"), "Afar")

    /**
     * Abkhazian language
     */
    case Abkhazian extends Language(ISO639_1("ab"), ISO639_2("abk"), ISO639_2("abk"), ISO639_3("abk"), "Abkhazian")

    /**
     * Afrikaans language
     */
    case Afrikaans extends Language(ISO639_1("af"), ISO639_2("afr"), ISO639_2("afr"), ISO639_3("afr"), "Afrikaans")

    /**
     * Akan language
     */
    case Akan extends Language(ISO639_1("ak"), ISO639_2("aka"), ISO639_2("aka"), ISO639_3("aka"), "Akan")

    /**
     * Amharic language
     */
    case Amharic extends Language(ISO639_1("am"), ISO639_2("amh"), ISO639_2("amh"), ISO639_3("amh"), "Amharic")

    /**
     * Arabic language
     */
    case Arabic extends Language(ISO639_1("ar"), ISO639_2("ara"), ISO639_2("ara"), ISO639_3("ara"), "Arabic")

    /**
     * Aragonese language
     */
    case Aragonese extends Language(ISO639_1("an"), ISO639_2("arg"), ISO639_2("arg"), ISO639_3("arg"), "Aragonese")

    /**
     * Assamese language
     */
    case Assamese extends Language(ISO639_1("as"), ISO639_2("asm"), ISO639_2("asm"), ISO639_3("asm"), "Assamese")

    /**
     * Avaric language
     */
    case Avaric extends Language(ISO639_1("av"), ISO639_2("ava"), ISO639_2("ava"), ISO639_3("ava"), "Avaric")

    /**
     * Avestan language
     */
    case Avestan extends Language(ISO639_1("ae"), ISO639_2("ave"), ISO639_2("ave"), ISO639_3("ave"), "Avestan")

    /**
     * Aymara language
     */
    case Aymara extends Language(ISO639_1("ay"), ISO639_2("aym"), ISO639_2("aym"), ISO639_3("aym"), "Aymara")

    /**
     * Azerbaijani language
     */
    case Azerbaijani extends Language(ISO639_1("az"), ISO639_2("aze"), ISO639_2("aze"), ISO639_3("aze"), "Azerbaijani")

    /**
     * Bashkir language
     */
    case Bashkir extends Language(ISO639_1("ba"), ISO639_2("bak"), ISO639_2("bak"), ISO639_3("bak"), "Bashkir")

    /**
     * Bambara language
     */
    case Bambara extends Language(ISO639_1("bm"), ISO639_2("bam"), ISO639_2("bam"), ISO639_3("bam"), "Bambara")

    /**
     * Belarusian language
     */
    case Belarusian extends Language(ISO639_1("be"), ISO639_2("bel"), ISO639_2("bel"), ISO639_3("bel"), "Belarusian")

    /**
     * Bengali language
     */
    case Bengali extends Language(ISO639_1("bn"), ISO639_2("ben"), ISO639_2("ben"), ISO639_3("ben"), "Bengali")

    /**
     * Bislama language
     */
    case Bislama extends Language(ISO639_1("bi"), ISO639_2("bis"), ISO639_2("bis"), ISO639_3("bis"), "Bislama")

    /**
     * Tibetan language
     */
    case Tibetan extends Language(ISO639_1("bo"), ISO639_2("bod"), ISO639_2("tib"), ISO639_3("bod"), "Tibetan")

    /**
     * Bosnian language
     */
    case Bosnian extends Language(ISO639_1("bs"), ISO639_2("bos"), ISO639_2("bos"), ISO639_3("bos"), "Bosnian")

    /**
     * Breton language
     */
    case Breton extends Language(ISO639_1("br"), ISO639_2("bre"), ISO639_2("bre"), ISO639_3("bre"), "Breton")

    /**
     * Bulgarian language
     */
    case Bulgarian extends Language(ISO639_1("bg"), ISO639_2("bul"), ISO639_2("bul"), ISO639_3("bul"), "Bulgarian")

    /**
     * Catalan language
     */
    case Catalan extends Language(ISO639_1("ca"), ISO639_2("cat"), ISO639_2("cat"), ISO639_3("cat"), "Catalan")

    /**
     * Czech language
     */
    case Czech extends Language(ISO639_1("cs"), ISO639_2("ces"), ISO639_2("cze"), ISO639_3("ces"), "Czech")

    /**
     * Chamorro language
     */
    case Chamorro extends Language(ISO639_1("ch"), ISO639_2("cha"), ISO639_2("cha"), ISO639_3("cha"), "Chamorro")

    /**
     * Chechen language
     */
    case Chechen extends Language(ISO639_1("ce"), ISO639_2("che"), ISO639_2("che"), ISO639_3("che"), "Chechen")

    /**
     * Church Slavic language
     */
    case ChurchSlavic
        extends Language(ISO639_1("cu"), ISO639_2("chu"), ISO639_2("chu"), ISO639_3("chu"), "Church Slavic")

    /**
     * Chuvash language
     */
    case Chuvash extends Language(ISO639_1("cv"), ISO639_2("chv"), ISO639_2("chv"), ISO639_3("chv"), "Chuvash")

    /**
     * Cornish language
     */
    case Cornish extends Language(ISO639_1("kw"), ISO639_2("cor"), ISO639_2("cor"), ISO639_3("cor"), "Cornish")

    /**
     * Corsican language
     */
    case Corsican extends Language(ISO639_1("co"), ISO639_2("cos"), ISO639_2("cos"), ISO639_3("cos"), "Corsican")

    /**
     * Cree language
     */
    case Cree extends Language(ISO639_1("cr"), ISO639_2("cre"), ISO639_2("cre"), ISO639_3("cre"), "Cree")

    /**
     * Welsh language
     */
    case Welsh extends Language(ISO639_1("cy"), ISO639_2("cym"), ISO639_2("wel"), ISO639_3("cym"), "Welsh")

    /**
     * Danish language
     */
    case Danish extends Language(ISO639_1("da"), ISO639_2("dan"), ISO639_2("dan"), ISO639_3("dan"), "Danish")

    /**
     * German language
     */
    case German extends Language(ISO639_1("de"), ISO639_2("deu"), ISO639_2("ger"), ISO639_3("deu"), "German")

    /**
     * Dhivehi language
     */
    case Dhivehi extends Language(ISO639_1("dv"), ISO639_2("div"), ISO639_2("div"), ISO639_3("div"), "Dhivehi")

    /**
     * Dzongkha language
     */
    case Dzongkha extends Language(ISO639_1("dz"), ISO639_2("dzo"), ISO639_2("dzo"), ISO639_3("dzo"), "Dzongkha")

    /**
     * Modern Greek (1453-) language
     */
    case ModernGreek
        extends Language(ISO639_1("el"), ISO639_2("ell"), ISO639_2("gre"), ISO639_3("ell"), "Modern Greek (1453-)")

    /**
     * English language
     */
    case English extends Language(ISO639_1("en"), ISO639_2("eng"), ISO639_2("eng"), ISO639_3("eng"), "English")

    /**
     * Esperanto language
     */
    case Esperanto extends Language(ISO639_1("eo"), ISO639_2("epo"), ISO639_2("epo"), ISO639_3("epo"), "Esperanto")

    /**
     * Estonian language
     */
    case Estonian extends Language(ISO639_1("et"), ISO639_2("est"), ISO639_2("est"), ISO639_3("est"), "Estonian")

    /**
     * Basque language
     */
    case Basque extends Language(ISO639_1("eu"), ISO639_2("eus"), ISO639_2("baq"), ISO639_3("eus"), "Basque")

    /**
     * Ewe language
     */
    case Ewe extends Language(ISO639_1("ee"), ISO639_2("ewe"), ISO639_2("ewe"), ISO639_3("ewe"), "Ewe")

    /**
     * Faroese language
     */
    case Faroese extends Language(ISO639_1("fo"), ISO639_2("fao"), ISO639_2("fao"), ISO639_3("fao"), "Faroese")

    /**
     * Persian language
     */
    case Persian extends Language(ISO639_1("fa"), ISO639_2("fas"), ISO639_2("per"), ISO639_3("fas"), "Persian")

    /**
     * Fijian language
     */
    case Fijian extends Language(ISO639_1("fj"), ISO639_2("fij"), ISO639_2("fij"), ISO639_3("fij"), "Fijian")

    /**
     * Finnish language
     */
    case Finnish extends Language(ISO639_1("fi"), ISO639_2("fin"), ISO639_2("fin"), ISO639_3("fin"), "Finnish")

    /**
     * French language
     */
    case French extends Language(ISO639_1("fr"), ISO639_2("fra"), ISO639_2("fre"), ISO639_3("fra"), "French")

    /**
     * Western Frisian language
     */
    case WesternFrisian
        extends Language(ISO639_1("fy"), ISO639_2("fry"), ISO639_2("fry"), ISO639_3("fry"), "Western Frisian")

    /**
     * Fulah language
     */
    case Fulah extends Language(ISO639_1("ff"), ISO639_2("ful"), ISO639_2("ful"), ISO639_3("ful"), "Fulah")

    /**
     * Scottish Gaelic language
     */
    case ScottishGaelic
        extends Language(ISO639_1("gd"), ISO639_2("gla"), ISO639_2("gla"), ISO639_3("gla"), "Scottish Gaelic")

    /**
     * Irish language
     */
    case Irish extends Language(ISO639_1("ga"), ISO639_2("gle"), ISO639_2("gle"), ISO639_3("gle"), "Irish")

    /**
     * Galician language
     */
    case Galician extends Language(ISO639_1("gl"), ISO639_2("glg"), ISO639_2("glg"), ISO639_3("glg"), "Galician")

    /**
     * Manx language
     */
    case Manx extends Language(ISO639_1("gv"), ISO639_2("glv"), ISO639_2("glv"), ISO639_3("glv"), "Manx")

    /**
     * Guarani language
     */
    case Guarani extends Language(ISO639_1("gn"), ISO639_2("grn"), ISO639_2("grn"), ISO639_3("grn"), "Guarani")

    /**
     * Gujarati language
     */
    case Gujarati extends Language(ISO639_1("gu"), ISO639_2("guj"), ISO639_2("guj"), ISO639_3("guj"), "Gujarati")

    /**
     * Haitian language
     */
    case Haitian extends Language(ISO639_1("ht"), ISO639_2("hat"), ISO639_2("hat"), ISO639_3("hat"), "Haitian")

    /**
     * Hausa language
     */
    case Hausa extends Language(ISO639_1("ha"), ISO639_2("hau"), ISO639_2("hau"), ISO639_3("hau"), "Hausa")

    /**
     * Serbo-Croatian language
     */
    case SerboCroatian extends Language(ISO639_1("sh"), Absent, Absent, ISO639_3("hbs"), "Serbo-Croatian")

    /**
     * Hebrew language
     */
    case Hebrew extends Language(ISO639_1("he"), ISO639_2("heb"), ISO639_2("heb"), ISO639_3("heb"), "Hebrew")

    /**
     * Herero language
     */
    case Herero extends Language(ISO639_1("hz"), ISO639_2("her"), ISO639_2("her"), ISO639_3("her"), "Herero")

    /**
     * Hindi language
     */
    case Hindi extends Language(ISO639_1("hi"), ISO639_2("hin"), ISO639_2("hin"), ISO639_3("hin"), "Hindi")

    /**
     * Hiri Motu language
     */
    case HiriMotu extends Language(ISO639_1("ho"), ISO639_2("hmo"), ISO639_2("hmo"), ISO639_3("hmo"), "Hiri Motu")

    /**
     * Croatian language
     */
    case Croatian extends Language(ISO639_1("hr"), ISO639_2("hrv"), ISO639_2("hrv"), ISO639_3("hrv"), "Croatian")

    /**
     * Hungarian language
     */
    case Hungarian extends Language(ISO639_1("hu"), ISO639_2("hun"), ISO639_2("hun"), ISO639_3("hun"), "Hungarian")

    /**
     * Armenian language
     */
    case Armenian extends Language(ISO639_1("hy"), ISO639_2("hye"), ISO639_2("arm"), ISO639_3("hye"), "Armenian")

    /**
     * Igbo language
     */
    case Igbo extends Language(ISO639_1("ig"), ISO639_2("ibo"), ISO639_2("ibo"), ISO639_3("ibo"), "Igbo")

    /**
     * Ido language
     */
    case Ido extends Language(ISO639_1("io"), ISO639_2("ido"), ISO639_2("ido"), ISO639_3("ido"), "Ido")

    /**
     * Sichuan Yi language
     */
    case SichuanYi extends Language(ISO639_1("ii"), ISO639_2("iii"), ISO639_2("iii"), ISO639_3("iii"), "Sichuan Yi")

    /**
     * Inuktitut language
     */
    case Inuktitut extends Language(ISO639_1("iu"), ISO639_2("iku"), ISO639_2("iku"), ISO639_3("iku"), "Inuktitut")

    /**
     * Interlingue language
     */
    case Interlingue extends Language(ISO639_1("ie"), ISO639_2("ile"), ISO639_2("ile"), ISO639_3("ile"), "Interlingue")

    /**
     * Interlingua (International Auxiliary Language Association) language
     */
    case Interlingua extends Language(
          ISO639_1("ia"),
          ISO639_2("ina"),
          ISO639_2("ina"),
          ISO639_3("ina"),
          "Interlingua (International Auxiliary Language Association)"
        )

    /**
     * Indonesian language
     */
    case Indonesian extends Language(ISO639_1("id"), ISO639_2("ind"), ISO639_2("ind"), ISO639_3("ind"), "Indonesian")

    /**
     * Inupiaq language
     */
    case Inupiaq extends Language(ISO639_1("ik"), ISO639_2("ipk"), ISO639_2("ipk"), ISO639_3("ipk"), "Inupiaq")

    /**
     * Icelandic language
     */
    case Icelandic extends Language(ISO639_1("is"), ISO639_2("isl"), ISO639_2("ice"), ISO639_3("isl"), "Icelandic")

    /**
     * Italian language
     */
    case Italian extends Language(ISO639_1("it"), ISO639_2("ita"), ISO639_2("ita"), ISO639_3("ita"), "Italian")

    /**
     * Javanese language
     */
    case Javanese extends Language(ISO639_1("jv"), ISO639_2("jav"), ISO639_2("jav"), ISO639_3("jav"), "Javanese")

    /**
     * Japanese language
     */
    case Japanese extends Language(ISO639_1("ja"), ISO639_2("jpn"), ISO639_2("jpn"), ISO639_3("jpn"), "Japanese")

    /**
     * Kalaallisut language
     */
    case Kalaallisut extends Language(ISO639_1("kl"), ISO639_2("kal"), ISO639_2("kal"), ISO639_3("kal"), "Kalaallisut")

    /**
     * Kannada language
     */
    case Kannada extends Language(ISO639_1("kn"), ISO639_2("kan"), ISO639_2("kan"), ISO639_3("kan"), "Kannada")

    /**
     * Kashmiri language
     */
    case Kashmiri extends Language(ISO639_1("ks"), ISO639_2("kas"), ISO639_2("kas"), ISO639_3("kas"), "Kashmiri")

    /**
     * Georgian language
     */
    case Georgian extends Language(ISO639_1("ka"), ISO639_2("kat"), ISO639_2("geo"), ISO639_3("kat"), "Georgian")

    /**
     * Kanuri language
     */
    case Kanuri extends Language(ISO639_1("kr"), ISO639_2("kau"), ISO639_2("kau"), ISO639_3("kau"), "Kanuri")

    /**
     * Kazakh language
     */
    case Kazakh extends Language(ISO639_1("kk"), ISO639_2("kaz"), ISO639_2("kaz"), ISO639_3("kaz"), "Kazakh")

    /**
     * Khmer language
     */
    case Khmer extends Language(ISO639_1("km"), ISO639_2("khm"), ISO639_2("khm"), ISO639_3("khm"), "Khmer")

    /**
     * Kikuyu language
     */
    case Kikuyu extends Language(ISO639_1("ki"), ISO639_2("kik"), ISO639_2("kik"), ISO639_3("kik"), "Kikuyu")

    /**
     * Kinyarwanda language
     */
    case Kinyarwanda extends Language(ISO639_1("rw"), ISO639_2("kin"), ISO639_2("kin"), ISO639_3("kin"), "Kinyarwanda")

    /**
     * Kirghiz language
     */
    case Kirghiz extends Language(ISO639_1("ky"), ISO639_2("kir"), ISO639_2("kir"), ISO639_3("kir"), "Kirghiz")

    /**
     * Komi language
     */
    case Komi extends Language(ISO639_1("kv"), ISO639_2("kom"), ISO639_2("kom"), ISO639_3("kom"), "Komi")

    /**
     * Kongo language
     */
    case Kongo extends Language(ISO639_1("kg"), ISO639_2("kon"), ISO639_2("kon"), ISO639_3("kon"), "Kongo")

    /**
     * Korean language
     */
    case Korean extends Language(ISO639_1("ko"), ISO639_2("kor"), ISO639_2("kor"), ISO639_3("kor"), "Korean")

    /**
     * Kuanyama language
     */
    case Kuanyama extends Language(ISO639_1("kj"), ISO639_2("kua"), ISO639_2("kua"), ISO639_3("kua"), "Kuanyama")

    /**
     * Kurdish language
     */
    case Kurdish extends Language(ISO639_1("ku"), ISO639_2("kur"), ISO639_2("kur"), ISO639_3("kur"), "Kurdish")

    /**
     * Lao language
     */
    case Lao extends Language(ISO639_1("lo"), ISO639_2("lao"), ISO639_2("lao"), ISO639_3("lao"), "Lao")

    /**
     * Latin language
     */
    case Latin extends Language(ISO639_1("la"), ISO639_2("lat"), ISO639_2("lat"), ISO639_3("lat"), "Latin")

    /**
     * Latvian language
     */
    case Latvian extends Language(ISO639_1("lv"), ISO639_2("lav"), ISO639_2("lav"), ISO639_3("lav"), "Latvian")

    /**
     * Limburgan language
     */
    case Limburgan extends Language(ISO639_1("li"), ISO639_2("lim"), ISO639_2("lim"), ISO639_3("lim"), "Limburgan")

    /**
     * Lingala language
     */
    case Lingala extends Language(ISO639_1("ln"), ISO639_2("lin"), ISO639_2("lin"), ISO639_3("lin"), "Lingala")

    /**
     * Lithuanian language
     */
    case Lithuanian extends Language(ISO639_1("lt"), ISO639_2("lit"), ISO639_2("lit"), ISO639_3("lit"), "Lithuanian")

    /**
     * Luxembourgish language
     */
    case Luxembourgish
        extends Language(ISO639_1("lb"), ISO639_2("ltz"), ISO639_2("ltz"), ISO639_3("ltz"), "Luxembourgish")

    /**
     * Luba-Katanga language
     */
    case LubaKatanga extends Language(ISO639_1("lu"), ISO639_2("lub"), ISO639_2("lub"), ISO639_3("lub"), "Luba-Katanga")

    /**
     * Ganda language
     */
    case Ganda extends Language(ISO639_1("lg"), ISO639_2("lug"), ISO639_2("lug"), ISO639_3("lug"), "Ganda")

    /**
     * Marshallese language
     */
    case Marshallese extends Language(ISO639_1("mh"), ISO639_2("mah"), ISO639_2("mah"), ISO639_3("mah"), "Marshallese")

    /**
     * Malayalam language
     */
    case Malayalam extends Language(ISO639_1("ml"), ISO639_2("mal"), ISO639_2("mal"), ISO639_3("mal"), "Malayalam")

    /**
     * Marathi language
     */
    case Marathi extends Language(ISO639_1("mr"), ISO639_2("mar"), ISO639_2("mar"), ISO639_3("mar"), "Marathi")

    /**
     * Macedonian language
     */
    case Macedonian extends Language(ISO639_1("mk"), ISO639_2("mkd"), ISO639_2("mac"), ISO639_3("mkd"), "Macedonian")

    /**
     * Malagasy language
     */
    case Malagasy extends Language(ISO639_1("mg"), ISO639_2("mlg"), ISO639_2("mlg"), ISO639_3("mlg"), "Malagasy")

    /**
     * Maltese language
     */
    case Maltese extends Language(ISO639_1("mt"), ISO639_2("mlt"), ISO639_2("mlt"), ISO639_3("mlt"), "Maltese")

    /**
     * Mongolian language
     */
    case Mongolian extends Language(ISO639_1("mn"), ISO639_2("mon"), ISO639_2("mon"), ISO639_3("mon"), "Mongolian")

    /**
     * Maori language
     */
    case Maori extends Language(ISO639_1("mi"), ISO639_2("mri"), ISO639_2("mao"), ISO639_3("mri"), "Maori")

    /**
     * Malay (macrolanguage)
     */
    case Malay
        extends Language(ISO639_1("ms"), ISO639_2("msa"), ISO639_2("may"), ISO639_3("msa"), "Malay (macrolanguage)")

    /**
     * Burmese language
     */
    case Burmese extends Language(ISO639_1("my"), ISO639_2("mya"), ISO639_2("bur"), ISO639_3("mya"), "Burmese")

    /**
     * Nauru language
     */
    case Nauru extends Language(ISO639_1("na"), ISO639_2("nau"), ISO639_2("nau"), ISO639_3("nau"), "Nauru")

    /**
     * Navajo language
     */
    case Navajo extends Language(ISO639_1("nv"), ISO639_2("nav"), ISO639_2("nav"), ISO639_3("nav"), "Navajo")

    /**
     * South Ndebele language
     */
    case SouthNdebele
        extends Language(ISO639_1("nr"), ISO639_2("nbl"), ISO639_2("nbl"), ISO639_3("nbl"), "South Ndebele")

    /**
     * North Ndebele language
     */
    case NorthNdebele
        extends Language(ISO639_1("nd"), ISO639_2("nde"), ISO639_2("nde"), ISO639_3("nde"), "North Ndebele")

    /**
     * Ndonga language
     */
    case Ndonga extends Language(ISO639_1("ng"), ISO639_2("ndo"), ISO639_2("ndo"), ISO639_3("ndo"), "Ndonga")

    /**
     * Nepali (macrolanguage)
     */
    case Nepali
        extends Language(ISO639_1("ne"), ISO639_2("nep"), ISO639_2("nep"), ISO639_3("nep"), "Nepali (macrolanguage)")

    /**
     * Dutch language
     */
    case Dutch extends Language(ISO639_1("nl"), ISO639_2("nld"), ISO639_2("dut"), ISO639_3("nld"), "Dutch")

    /**
     * Norwegian Nynorsk language
     */
    case NorwegianNynorsk
        extends Language(ISO639_1("nn"), ISO639_2("nno"), ISO639_2("nno"), ISO639_3("nno"), "Norwegian Nynorsk")

    /**
     * Norwegian Bokmål language
     */
    case NorwegianBokmål
        extends Language(ISO639_1("nb"), ISO639_2("nob"), ISO639_2("nob"), ISO639_3("nob"), "Norwegian Bokmål")

    /**
     * Norwegian language
     */
    case Norwegian extends Language(ISO639_1("no"), ISO639_2("nor"), ISO639_2("nor"), ISO639_3("nor"), "Norwegian")

    /**
     * Nyanja language
     */
    case Nyanja extends Language(ISO639_1("ny"), ISO639_2("nya"), ISO639_2("nya"), ISO639_3("nya"), "Nyanja")

    /**
     * Occitan (post 1500) language
     */
    case Occitan
        extends Language(ISO639_1("oc"), ISO639_2("oci"), ISO639_2("oci"), ISO639_3("oci"), "Occitan (post 1500)")

    /**
     * Ojibwa language
     */
    case Ojibwa extends Language(ISO639_1("oj"), ISO639_2("oji"), ISO639_2("oji"), ISO639_3("oji"), "Ojibwa")

    /**
     * Oriya (macrolanguage)
     */
    case Oriya
        extends Language(ISO639_1("or"), ISO639_2("ori"), ISO639_2("ori"), ISO639_3("ori"), "Oriya (macrolanguage)")

    /**
     * Oromo language
     */
    case Oromo extends Language(ISO639_1("om"), ISO639_2("orm"), ISO639_2("orm"), ISO639_3("orm"), "Oromo")

    /**
     * Ossetian language
     */
    case Ossetian extends Language(ISO639_1("os"), ISO639_2("oss"), ISO639_2("oss"), ISO639_3("oss"), "Ossetian")

    /**
     * Panjabi language
     */
    case Panjabi extends Language(ISO639_1("pa"), ISO639_2("pan"), ISO639_2("pan"), ISO639_3("pan"), "Panjabi")

    /**
     * Pali language
     */
    case Pali extends Language(ISO639_1("pi"), ISO639_2("pli"), ISO639_2("pli"), ISO639_3("pli"), "Pali")

    /**
     * Polish language
     */
    case Polish extends Language(ISO639_1("pl"), ISO639_2("pol"), ISO639_2("pol"), ISO639_3("pol"), "Polish")

    /**
     * Portuguese language
     */
    case Portuguese extends Language(ISO639_1("pt"), ISO639_2("por"), ISO639_2("por"), ISO639_3("por"), "Portuguese")

    /**
     * Pushto language
     */
    case Pushto extends Language(ISO639_1("ps"), ISO639_2("pus"), ISO639_2("pus"), ISO639_3("pus"), "Pushto")

    /**
     * Quechua language
     */
    case Quechua extends Language(ISO639_1("qu"), ISO639_2("que"), ISO639_2("que"), ISO639_3("que"), "Quechua")

    /**
     * Romansh language
     */
    case Romansh extends Language(ISO639_1("rm"), ISO639_2("roh"), ISO639_2("roh"), ISO639_3("roh"), "Romansh")

    /**
     * Romanian language
     */
    case Romanian extends Language(ISO639_1("ro"), ISO639_2("ron"), ISO639_2("rum"), ISO639_3("ron"), "Romanian")

    /**
     * Rundi language
     */
    case Rundi extends Language(ISO639_1("rn"), ISO639_2("run"), ISO639_2("run"), ISO639_3("run"), "Rundi")

    /**
     * Russian language
     */
    case Russian extends Language(ISO639_1("ru"), ISO639_2("rus"), ISO639_2("rus"), ISO639_3("rus"), "Russian")

    /**
     * Sango language
     */
    case Sango extends Language(ISO639_1("sg"), ISO639_2("sag"), ISO639_2("sag"), ISO639_3("sag"), "Sango")

    /**
     * Sanskrit language
     */
    case Sanskrit extends Language(ISO639_1("sa"), ISO639_2("san"), ISO639_2("san"), ISO639_3("san"), "Sanskrit")

    /**
     * Sinhala language
     */
    case Sinhala extends Language(ISO639_1("si"), ISO639_2("sin"), ISO639_2("sin"), ISO639_3("sin"), "Sinhala")

    /**
     * Slovak language
     */
    case Slovak extends Language(ISO639_1("sk"), ISO639_2("slk"), ISO639_2("slo"), ISO639_3("slk"), "Slovak")

    /**
     * Slovenian language
     */
    case Slovenian extends Language(ISO639_1("sl"), ISO639_2("slv"), ISO639_2("slv"), ISO639_3("slv"), "Slovenian")

    /**
     * Northern Sami language
     */
    case NorthernSami
        extends Language(ISO639_1("se"), ISO639_2("sme"), ISO639_2("sme"), ISO639_3("sme"), "Northern Sami")

    /**
     * Samoan language
     */
    case Samoan extends Language(ISO639_1("sm"), ISO639_2("smo"), ISO639_2("smo"), ISO639_3("smo"), "Samoan")

    /**
     * Shona language
     */
    case Shona extends Language(ISO639_1("sn"), ISO639_2("sna"), ISO639_2("sna"), ISO639_3("sna"), "Shona")

    /**
     * Sindhi language
     */
    case Sindhi extends Language(ISO639_1("sd"), ISO639_2("snd"), ISO639_2("snd"), ISO639_3("snd"), "Sindhi")

    /**
     * Somali language
     */
    case Somali extends Language(ISO639_1("so"), ISO639_2("som"), ISO639_2("som"), ISO639_3("som"), "Somali")

    /**
     * Southern Sotho language
     */
    case SouthernSotho
        extends Language(ISO639_1("st"), ISO639_2("sot"), ISO639_2("sot"), ISO639_3("sot"), "Southern Sotho")

    /**
     * Spanish language
     */
    case Spanish extends Language(ISO639_1("es"), ISO639_2("spa"), ISO639_2("spa"), ISO639_3("spa"), "Spanish")

    /**
     * Albanian language
     */
    case Albanian extends Language(ISO639_1("sq"), ISO639_2("sqi"), ISO639_2("alb"), ISO639_3("sqi"), "Albanian")

    /**
     * Sardinian language
     */
    case Sardinian extends Language(ISO639_1("sc"), ISO639_2("srd"), ISO639_2("srd"), ISO639_3("srd"), "Sardinian")

    /**
     * Serbian language
     */
    case Serbian extends Language(ISO639_1("sr"), ISO639_2("srp"), ISO639_2("srp"), ISO639_3("srp"), "Serbian")

    /**
     * Swati language
     */
    case Swati extends Language(ISO639_1("ss"), ISO639_2("ssw"), ISO639_2("ssw"), ISO639_3("ssw"), "Swati")

    /**
     * Sundanese language
     */
    case Sundanese extends Language(ISO639_1("su"), ISO639_2("sun"), ISO639_2("sun"), ISO639_3("sun"), "Sundanese")

    /**
     * Swahili (macrolanguage)
     */
    case Swahili
        extends Language(ISO639_1("sw"), ISO639_2("swa"), ISO639_2("swa"), ISO639_3("swa"), "Swahili (macrolanguage)")

    /**
     * Swedish language
     */
    case Swedish extends Language(ISO639_1("sv"), ISO639_2("swe"), ISO639_2("swe"), ISO639_3("swe"), "Swedish")

    /**
     * Tahitian language
     */
    case Tahitian extends Language(ISO639_1("ty"), ISO639_2("tah"), ISO639_2("tah"), ISO639_3("tah"), "Tahitian")

    /**
     * Tamil language
     */
    case Tamil extends Language(ISO639_1("ta"), ISO639_2("tam"), ISO639_2("tam"), ISO639_3("tam"), "Tamil")

    /**
     * Tatar language
     */
    case Tatar extends Language(ISO639_1("tt"), ISO639_2("tat"), ISO639_2("tat"), ISO639_3("tat"), "Tatar")

    /**
     * Telugu language
     */
    case Telugu extends Language(ISO639_1("te"), ISO639_2("tel"), ISO639_2("tel"), ISO639_3("tel"), "Telugu")

    /**
     * Tajik language
     */
    case Tajik extends Language(ISO639_1("tg"), ISO639_2("tgk"), ISO639_2("tgk"), ISO639_3("tgk"), "Tajik")

    /**
     * Tagalog language
     */
    case Tagalog extends Language(ISO639_1("tl"), ISO639_2("tgl"), ISO639_2("tgl"), ISO639_3("tgl"), "Tagalog")

    /**
     * Thai language
     */
    case Thai extends Language(ISO639_1("th"), ISO639_2("tha"), ISO639_2("tha"), ISO639_3("tha"), "Thai")

    /**
     * Tigrinya language
     */
    case Tigrinya extends Language(ISO639_1("ti"), ISO639_2("tir"), ISO639_2("tir"), ISO639_3("tir"), "Tigrinya")

    /**
     * Tonga (Tonga Islands) language
     */
    case Tonga
        extends Language(ISO639_1("to"), ISO639_2("ton"), ISO639_2("ton"), ISO639_3("ton"), "Tonga (Tonga Islands)")

    /**
     * Tswana language
     */
    case Tswana extends Language(ISO639_1("tn"), ISO639_2("tsn"), ISO639_2("tsn"), ISO639_3("tsn"), "Tswana")

    /**
     * Tsonga language
     */
    case Tsonga extends Language(ISO639_1("ts"), ISO639_2("tso"), ISO639_2("tso"), ISO639_3("tso"), "Tsonga")

    /**
     * Turkmen language
     */
    case Turkmen extends Language(ISO639_1("tk"), ISO639_2("tuk"), ISO639_2("tuk"), ISO639_3("tuk"), "Turkmen")

    /**
     * Turkish language
     */
    case Turkish extends Language(ISO639_1("tr"), ISO639_2("tur"), ISO639_2("tur"), ISO639_3("tur"), "Turkish")

    /**
     * Twi language
     */
    case Twi extends Language(ISO639_1("tw"), ISO639_2("twi"), ISO639_2("twi"), ISO639_3("twi"), "Twi")

    /**
     * Uighur language
     */
    case Uighur extends Language(ISO639_1("ug"), ISO639_2("uig"), ISO639_2("uig"), ISO639_3("uig"), "Uighur")

    /**
     * Ukrainian language
     */
    case Ukrainian extends Language(ISO639_1("uk"), ISO639_2("ukr"), ISO639_2("ukr"), ISO639_3("ukr"), "Ukrainian")

    /**
     * Urdu language
     */
    case Urdu extends Language(ISO639_1("ur"), ISO639_2("urd"), ISO639_2("urd"), ISO639_3("urd"), "Urdu")

    /**
     * Uzbek language
     */
    case Uzbek extends Language(ISO639_1("uz"), ISO639_2("uzb"), ISO639_2("uzb"), ISO639_3("uzb"), "Uzbek")

    /**
     * Venda language
     */
    case Venda extends Language(ISO639_1("ve"), ISO639_2("ven"), ISO639_2("ven"), ISO639_3("ven"), "Venda")

    /**
     * Vietnamese language
     */
    case Vietnamese extends Language(ISO639_1("vi"), ISO639_2("vie"), ISO639_2("vie"), ISO639_3("vie"), "Vietnamese")

    /**
     * Volapük language
     */
    case Volapuk extends Language(ISO639_1("vo"), ISO639_2("vol"), ISO639_2("vol"), ISO639_3("vol"), "Volapük")

    /**
     * Walloon language
     */
    case Walloon extends Language(ISO639_1("wa"), ISO639_2("wln"), ISO639_2("wln"), ISO639_3("wln"), "Walloon")

    /**
     * Wolof language
     */
    case Wolof extends Language(ISO639_1("wo"), ISO639_2("wol"), ISO639_2("wol"), ISO639_3("wol"), "Wolof")

    /**
     * Xhosa language
     */
    case Xhosa extends Language(ISO639_1("xh"), ISO639_2("xho"), ISO639_2("xho"), ISO639_3("xho"), "Xhosa")

    /**
     * Yiddish language
     */
    case Yiddish extends Language(ISO639_1("yi"), ISO639_2("yid"), ISO639_2("yid"), ISO639_3("yid"), "Yiddish")

    /**
     * Yoruba language
     */
    case Yoruba extends Language(ISO639_1("yo"), ISO639_2("yor"), ISO639_2("yor"), ISO639_3("yor"), "Yoruba")

    /**
     * Zhuang language
     */
    case Zhuang extends Language(ISO639_1("za"), ISO639_2("zha"), ISO639_2("zha"), ISO639_3("zha"), "Zhuang")

    /**
     * Chinese language
     */
    case Chinese extends Language(ISO639_1("zh"), ISO639_2("zho"), ISO639_2("chi"), ISO639_3("zho"), "Chinese")

    /**
     * Zulu language
     */
    case Zulu extends Language(ISO639_1("zu"), ISO639_2("zul"), ISO639_2("zul"), ISO639_3("zul"), "Zulu")
end Language
