// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package io.funktional.yggdrasil.marc

import io.funktional.yggdrasil.Maybe
import io.funktional.yggdrasil.syntax.all.*

enum Language(val code: String, val name: String, val discontinued: Boolean):

    case Abkhaz extends Language("abk", "Abkhaz", discontinued = false)

    case Achinese extends Language("ace", "Achinese", discontinued = false)

    case Acoli extends Language("ach", "Acoli", discontinued = false)

    case Adangme extends Language("ada", "Adangme", discontinued = false)

    case Adygei extends Language("ady", "Adygei", discontinued = false)

    case Afar extends Language("aar", "Afar", discontinued = false)

    case Afrihili extends Language("afh", "Afrihili (Artificial language)", discontinued = false)

    case Afrikaans extends Language("afr", "Afrikaans", discontinued = false)

    case OtherAfroasiatic extends Language("afa", "Afroasiatic (Other)", discontinued = false)

    case Ainu extends Language("ain", "Ainu", discontinued = false)

    case Akan extends Language("aka", "Akan", discontinued = false)

    case Akkadian extends Language("akk", "Akkadian", discontinued = false)

    case Albanian extends Language("alb", "Albanian", discontinued = false)

    case Aleut extends Language("ale", "Aleut", discontinued = false)

    case OtherAlgonquian extends Language("alg", "Algonquian (Other)", discontinued = false)

    case Aljamia extends Language("ajm", "Aljamía", discontinued = true)

    case Altai extends Language("alt", "Altai", discontinued = false)

    case OtherAltaic extends Language("tut", "Altaic (Other)", discontinued = false)

    case Amharic extends Language("amh", "Amharic", discontinued = false)

    case Angika extends Language("anp", "Angika", discontinued = false)

    case ApacheLanguages extends Language("apa", "Apache languages", discontinued = false)

    case Arabic extends Language("ara", "Arabic", discontinued = false)

    case Aragonese extends Language("arg", "Aragonese", discontinued = false)

    case Aramaic extends Language("arc", "Aramaic", discontinued = false)

    case Arapaho extends Language("arp", "Arapaho", discontinued = false)

    case Arawak extends Language("arw", "Arawak", discontinued = false)

    case Armenian extends Language("arm", "Armenian", discontinued = false)

    case Aromanian extends Language("rup", "Aromanian", discontinued = false)

    case OtherArtificial extends Language("art", "Artificial (Other)", discontinued = false)

    case Assamese extends Language("asm", "Assamese", discontinued = false)

    case OtherAthapascan extends Language("ath", "Athapascan (Other)", discontinued = false)

    case AustralianLanguages extends Language("aus", "Australian languages", discontinued = false)

    case OtherAustronesian extends Language("map", "Austronesian (Other)", discontinued = false)

    case Avaric extends Language("ava", "Avaric", discontinued = false)

    case Avestan extends Language("ave", "Avestan", discontinued = false)

    case Awadhi extends Language("awa", "Awadhi", discontinued = false)

    case Aymara extends Language("aym", "Aymara", discontinued = false)

    case Azerbaijani extends Language("aze", "Azerbaijani", discontinued = false)

    case Bable extends Language("ast", "Bable", discontinued = false)

    case Balinese extends Language("ban", "Balinese", discontinued = false)

    case OtherBaltic extends Language("bat", "Baltic (Other)", discontinued = false)

    case Baluchi extends Language("bal", "Baluchi", discontinued = false)

    case Bambara extends Language("bam", "Bambara", discontinued = false)

    case BamilekeLanguages extends Language("bai", "Bamileke languages", discontinued = false)

    case BandaLanguages extends Language("bad", "Banda languages", discontinued = false)

    case OtherBantu extends Language("bnt", "Bantu (Other)", discontinued = false)

    case Basa extends Language("bas", "Basa", discontinued = false)

    case Bashkir extends Language("bak", "Bashkir", discontinued = false)

    case Basque extends Language("baq", "Basque", discontinued = false)

    case Batak extends Language("btk", "Batak", discontinued = false)

    case Beja extends Language("bej", "Beja", discontinued = false)

    case Belarusian extends Language("bel", "Belarusian", discontinued = false)

    case Bemba extends Language("bem", "Bemba", discontinued = false)

    case Bengali extends Language("ben", "Bengali", discontinued = false)

    case OtherBerber extends Language("ber", "Berber (Other)", discontinued = false)

    case Bhojpuri extends Language("bho", "Bhojpuri", discontinued = false)

    case OtherBihari extends Language("bih", "Bihari (Other)", discontinued = false)

    case Bikol extends Language("bik", "Bikol", discontinued = false)

    case Bilin extends Language("byn", "Bilin", discontinued = false)

    case Bislama extends Language("bis", "Bislama", discontinued = false)

    case Blissymbolics extends Language("zbl", "Blissymbolics", discontinued = false)

    case Bosnian extends Language("bos", "Bosnian", discontinued = false)

    case Braj extends Language("bra", "Braj", discontinued = false)

    case Breton extends Language("bre", "Breton", discontinued = false)

    case Bugis extends Language("bug", "Bugis", discontinued = false)

    case Bulgarian extends Language("bul", "Bulgarian", discontinued = false)

    case Buriat extends Language("bua", "Buriat", discontinued = false)

    case Burmese extends Language("bur", "Burmese", discontinued = false)

    case Caddo extends Language("cad", "Caddo", discontinued = false)

    case Carib extends Language("car", "Carib", discontinued = false)

    case Catalan extends Language("cat", "Catalan", discontinued = false)

    case OtherCaucasian extends Language("cau", "Caucasian (Other)", discontinued = false)

    case Cebuano extends Language("ceb", "Cebuano", discontinued = false)

    case OtherCeltic extends Language("cel", "Celtic (Other)", discontinued = false)

    case OtherCentralAmericanIndian extends Language("cai", "Central American Indian (Other)", discontinued = false)

    case Chagatai extends Language("chg", "Chagatai", discontinued = false)

    case ChamicLanguages extends Language("cmc", "Chamic languages", discontinued = false)

    case Chamorro extends Language("cha", "Chamorro", discontinued = false)

    case Chechen extends Language("che", "Chechen", discontinued = false)

    case Cherokee extends Language("chr", "Cherokee", discontinued = false)

    case Cheyenne extends Language("chy", "Cheyenne", discontinued = false)

    case Chibcha extends Language("chb", "Chibcha", discontinued = false)

    case Chinese extends Language("chi", "Chinese", discontinued = false)

    case ChinookJargon extends Language("chn", "Chinook jargon", discontinued = false)

    case Chipewyan extends Language("chp", "Chipewyan", discontinued = false)

    case Choctaw extends Language("cho", "Choctaw", discontinued = false)

    case ChurchSlavic extends Language("chu", "Church Slavic", discontinued = false)

    case Chuukese extends Language("chk", "Chuukese", discontinued = false)

    case Chuvash extends Language("chv", "Chuvash", discontinued = false)

    case Coptic extends Language("cop", "Coptic", discontinued = false)

    case Cornish extends Language("cor", "Cornish", discontinued = false)

    case Corsican extends Language("cos", "Corsican", discontinued = false)

    case Cree extends Language("cre", "Cree", discontinued = false)

    case Creek extends Language("mus", "Creek", discontinued = false)

    case OtherCreolesAndPidgins extends Language("crp", "Creoles and Pidgins (Other)", discontinued = false)

    case OtherEnglishBasedCreolesAndPidgins
        extends Language("cpe", "Creoles and Pidgins, English-based (Other)", discontinued = false)

    case OtherFrenchBasedCreolesAndPidgins
        extends Language("cpf", "Creoles and Pidgins, French-based (Other)", discontinued = false)

    case OtherPortugueseBasedCreolesAndPidgins
        extends Language("cpp", "Creoles and Pidgins, Portuguese-based (Other)", discontinued = false)

    case CrimeanTatar extends Language("crh", "Crimean Tatar", discontinued = false)

    case Croatian extends Language("hrv", "Croatian", discontinued = false)

    @deprecated("Use Croatian instead", "1.0.0") case Croatian2 extends Language("scr", "Croatian", discontinued = true)

    case OtherCushitic extends Language("cus", "Cushitic (Other)", discontinued = false)

    case Czech extends Language("cze", "Czech", discontinued = false)

    case Dakota extends Language("dak", "Dakota", discontinued = false)

    case Danish extends Language("dan", "Danish", discontinued = false)

    case Dargwa extends Language("dar", "Dargwa", discontinued = false)

    case Dayak extends Language("day", "Dayak", discontinued = false)

    case Delaware extends Language("del", "Delaware", discontinued = false)

    case Dinka extends Language("din", "Dinka", discontinued = false)

    case Divehi extends Language("div", "Divehi", discontinued = false)

    case Dogri extends Language("doi", "Dogri", discontinued = false)

    case OtherDravidian extends Language("dra", "Dravidian (Other)", discontinued = false)

    case Duala extends Language("dua", "Duala", discontinued = false)

    case Dutch extends Language("dut", "Dutch", discontinued = false)

    case MiddleDutch extends Language("dum", "Dutch, Middle (ca. 1050-1350)", discontinued = false)

    case Dyula extends Language("dyu", "Dyula", discontinued = false)

    case Dzongkha extends Language("dzo", "Dzongkha", discontinued = false)

    case EastFrisian extends Language("frs", "East Frisian", discontinued = false)

    case Edo extends Language("bin", "Edo", discontinued = false)

    case Efik extends Language("efi", "Efik", discontinued = false)

    case Egyptian extends Language("egy", "Egyptian", discontinued = false)

    case Ekajuk extends Language("eka", "Ekajuk", discontinued = false)

    case Elamite extends Language("elx", "Elamite", discontinued = false)

    case English extends Language("eng", "English", discontinued = false)

    case MiddleEnglish extends Language("enm", "English, Middle (1100-1500)", discontinued = false)

    case OldEnglish extends Language("ang", "English, Old (ca. 450-1100)", discontinued = false)

    case Erzya extends Language("myv", "Erzya", discontinued = false)

    @deprecated("Use Aleut instead", "1.0.0") case EskimoLanguages
        extends Language("esk", "Eskimo languages", discontinued = true)

    case Esperanto extends Language("epo", "Esperanto", discontinued = false)

    case Esperanto2 extends Language("esp", "Esperanto", discontinued = true)

    case Estonian extends Language("est", "Estonian", discontinued = false)

    @deprecated("Use Ethiopic instead", "1.0.0") case Ethiopic2 extends Language("eth", "Ethiopic", discontinued = true)

    case Ethiopic extends Language("gez", "Ethiopic", discontinued = false)

    case Ewe extends Language("ewe", "Ewe", discontinued = false)

    case Ewondo extends Language("ewo", "Ewondo", discontinued = false)

    case Fang extends Language("fan", "Fang", discontinued = false)

    case Fanti extends Language("fat", "Fanti", discontinued = false)

    case Faroese extends Language("fao", "Faroese", discontinued = false)

    @deprecated("Use Faroese instead", "1.0.0") case Faroese2 extends Language("far", "Faroese", discontinued = true)

    case Fijian extends Language("fij", "Fijian", discontinued = false)

    case Filipino extends Language("fil", "Filipino", discontinued = false)

    case Finnish extends Language("fin", "Finnish", discontinued = false)

    case OtherFinnoUgrian extends Language("fiu", "Finno-Ugrian (Other)", discontinued = false)

    case Fon extends Language("fon", "Fon", discontinued = false)

    case French extends Language("fre", "French", discontinued = false)

    case MiddleFrench extends Language("frm", "French, Middle (ca. 1300-1600)", discontinued = false)

    case OldFrench extends Language("fro", "French, Old (ca. 842-1300)", discontinued = false)

    case Frisian extends Language("fry", "Frisian", discontinued = false)

    @deprecated("Use Frisian instead", "1.0.0") case Frisian2 extends Language("fri", "Frisian", discontinued = true)

    case Friulian extends Language("fur", "Friulian", discontinued = false)

    case Fula extends Language("ful", "Fula", discontinued = false)

    case Galician extends Language("glg", "Galician", discontinued = false)

    @deprecated("Use Galician instead", "1.0.0") case Galician2 extends Language("gag", "Galician", discontinued = true)

    case Ganda extends Language("lug", "Ganda", discontinued = false)

    case Gayo extends Language("gay", "Gayo", discontinued = false)

    case Gbaya extends Language("gba", "Gbaya", discontinued = false)

    case Georgian extends Language("geo", "Georgian", discontinued = false)

    case German extends Language("ger", "German", discontinued = false)

    case MiddleHighGerman extends Language("gmh", "German, Middle High (ca. 1050-1500)", discontinued = false)

    case OldHighGerman extends Language("goh", "German, Old High (ca. 750-1050)", discontinued = false)

    case OtherGermanic extends Language("gem", "Germanic (Other)", discontinued = false)

    case Gilbertese extends Language("gil", "Gilbertese", discontinued = false)

    case Gondi extends Language("gon", "Gondi", discontinued = false)

    case Gorontalo extends Language("gor", "Gorontalo", discontinued = false)

    case Gothic extends Language("got", "Gothic", discontinued = false)

    case Grebo extends Language("grb", "Grebo", discontinued = false)

    case AncientGreek extends Language("grc", "Greek, Ancient (to 1453)", discontinued = false)

    case ModernGreek extends Language("gre", "Greek, Modern (1453-)", discontinued = false)

    case Guarani extends Language("grn", "Guarani", discontinued = false)

    @deprecated("Use Guarani instead", "1.0.0") case Guarani2 extends Language("gua", "Guarani", discontinued = true)

    case Gujarati extends Language("guj", "Gujarati", discontinued = false)

    case Gwichin extends Language("gwi", "Gwich'in", discontinued = false)

    case Ga extends Language("gaa", "Gã", discontinued = false)

    case Haida extends Language("hai", "Haida", discontinued = false)

    case HaitianFrenchCreole extends Language("hat", "Haitian French Creole", discontinued = false)

    case Hausa extends Language("hau", "Hausa", discontinued = false)

    case Hawaiian extends Language("haw", "Hawaiian", discontinued = false)

    case Hebrew extends Language("heb", "Hebrew", discontinued = false)

    case Herero extends Language("her", "Herero", discontinued = false)

    case Hiligaynon extends Language("hil", "Hiligaynon", discontinued = false)

    case Hindi extends Language("hin", "Hindi", discontinued = false)

    case HiriMotu extends Language("hmo", "Hiri Motu", discontinued = false)

    case Hittite extends Language("hit", "Hittite", discontinued = false)

    case Hmong extends Language("hmn", "Hmong", discontinued = false)

    case Hungarian extends Language("hun", "Hungarian", discontinued = false)

    case Hupa extends Language("hup", "Hupa", discontinued = false)

    case Iban extends Language("iba", "Iban", discontinued = false)

    case Icelandic extends Language("ice", "Icelandic", discontinued = false)

    case Ido extends Language("ido", "Ido", discontinued = false)

    case Igbo extends Language("ibo", "Igbo", discontinued = false)

    case Ijo extends Language("ijo", "Ijo", discontinued = false)

    case Iloko extends Language("ilo", "Iloko", discontinued = false)

    case InariSami extends Language("smn", "Inari Sami", discontinued = false)

    case OtherIndic extends Language("inc", "Indic (Other)", discontinued = false)

    case OtherIndoEuropean extends Language("ine", "Indo-European (Other)", discontinued = false)

    case Indonesian extends Language("ind", "Indonesian", discontinued = false)

    case Ingush extends Language("inh", "Ingush", discontinued = false)

    case Interlingua
        extends Language("ina", "Interlingua (International Auxiliary Language Association)", discontinued = false)

    @deprecated("Use Interlingua instead", "1.0.0") case Interlingua2
        extends Language("int", "Interlingua (International Auxiliary Language Association)", discontinued = true)

    case Interlingue extends Language("ile", "Interlingue", discontinued = false)

    case Inuktitut extends Language("iku", "Inuktitut", discontinued = false)

    case Inupiaq extends Language("ipk", "Inupiaq", discontinued = false)

    case OtherIranian extends Language("ira", "Iranian (Other)", discontinued = false)

    case Irish extends Language("gle", "Irish", discontinued = false)

    @deprecated("Use Irish instead", "1.0.0") case Irish2 extends Language("iri", "Irish", discontinued = true)

    case MiddleIrish extends Language("mga", "Irish, Middle (ca. 1100-1550)", discontinued = false)

    case OldIrish extends Language("sga", "Irish, Old (to 1100)", discontinued = false)

    case OtherIroquoian extends Language("iro", "Iroquoian (Other)", discontinued = false)

    case Italian extends Language("ita", "Italian", discontinued = false)

    case Japanese extends Language("jpn", "Japanese", discontinued = false)

    case Javanese extends Language("jav", "Javanese", discontinued = false)

    case JudeoArabic extends Language("jrb", "Judeo-Arabic", discontinued = false)

    case JudeoPersian extends Language("jpr", "Judeo-Persian", discontinued = false)

    case Kabardian extends Language("kbd", "Kabardian", discontinued = false)

    case Kabyle extends Language("kab", "Kabyle", discontinued = false)

    case Kachin extends Language("kac", "Kachin", discontinued = false)

    case Kalatdlisut extends Language("kal", "Kalâtdlisut", discontinued = false)

    case Kamba extends Language("kam", "Kamba", discontinued = false)

    case Kannada extends Language("kan", "Kannada", discontinued = false)

    case Kanuri extends Language("kau", "Kanuri", discontinued = false)

    case KaraKalpak extends Language("kaa", "Kara-Kalpak", discontinued = false)

    case KarachayBalkar extends Language("krc", "Karachay-Balkar", discontinued = false)

    case Karelian extends Language("krl", "Karelian", discontinued = false)

    case KarenLanguages extends Language("kar", "Karen languages", discontinued = false)

    case Kashmiri extends Language("kas", "Kashmiri", discontinued = false)

    case Kashubian extends Language("csb", "Kashubian", discontinued = false)

    case Kawi extends Language("kaw", "Kawi", discontinued = false)

    case Kazakh extends Language("kaz", "Kazakh", discontinued = false)

    case Khasi extends Language("kha", "Khasi", discontinued = false)

    case Khmer extends Language("khm", "Khmer", discontinued = false)

    @deprecated("Use Khmer instead", "1.0.0") case Khmer2 extends Language("cam", "Khmer", discontinued = true)

    case OtherKhoisan extends Language("khi", "Khoisan (Other)", discontinued = false)

    case Khotanese extends Language("kho", "Khotanese", discontinued = false)

    case Kikuyu extends Language("kik", "Kikuyu", discontinued = false)

    case Kimbundu extends Language("kmb", "Kimbundu", discontinued = false)

    case Kinyarwanda extends Language("kin", "Kinyarwanda", discontinued = false)

    case Klingon extends Language("tlh", "Klingon (Artificial language)", discontinued = false)

    case Komi extends Language("kom", "Komi", discontinued = false)

    case Kongo extends Language("kon", "Kongo", discontinued = false)

    case Konkani extends Language("kok", "Konkani", discontinued = false)

    case Kootenai extends Language("kut", "Kootenai", discontinued = false)

    case Korean extends Language("kor", "Korean", discontinued = false)

    case Kosraean extends Language("kos", "Kosraean", discontinued = false)

    case Kpelle extends Language("kpe", "Kpelle", discontinued = false)

    case OtherKru extends Language("kro", "Kru (Other)", discontinued = false)

    case Kuanyama extends Language("kua", "Kuanyama", discontinued = false)

    case Kumyk extends Language("kum", "Kumyk", discontinued = false)

    case Kurdish extends Language("kur", "Kurdish", discontinued = false)

    case Kurukh extends Language("kru", "Kurukh", discontinued = false)

    case Kusaie extends Language("kus", "Kusaie", discontinued = true)

    case Kyrgyz extends Language("kir", "Kyrgyz", discontinued = false)

    case Ladino extends Language("lad", "Ladino", discontinued = false)

    case Lahnda extends Language("lah", "Lahndā", discontinued = false)

    case Lamba extends Language("lam", "Lamba (Zambia and Congo)", discontinued = false)

    case Lao extends Language("lao", "Lao", discontinued = false)

    case Latin extends Language("lat", "Latin", discontinued = false)

    case Latvian extends Language("lav", "Latvian", discontinued = false)

    case Lezgian extends Language("lez", "Lezgian", discontinued = false)

    case Limburgish extends Language("lim", "Limburgish", discontinued = false)

    case Lingala extends Language("lin", "Lingala", discontinued = false)

    case Lithuanian extends Language("lit", "Lithuanian", discontinued = false)

    case Lojban extends Language("jbo", "Lojban (Artificial language)", discontinued = false)

    case LowGerman extends Language("nds", "Low German", discontinued = false)

    case LowerSorbian extends Language("dsb", "Lower Sorbian", discontinued = false)

    case Lozi extends Language("loz", "Lozi", discontinued = false)

    case LubaKatanga extends Language("lub", "Luba-Katanga", discontinued = false)

    case LubaLulua extends Language("lua", "Luba-Lulua", discontinued = false)

    case Luiseno extends Language("lui", "Luiseño", discontinued = false)

    case LuleSami extends Language("smj", "Lule Sami", discontinued = false)

    case Lunda extends Language("lun", "Lunda", discontinued = false)

    case Luo extends Language("luo", "Luo (Kenya and Tanzania)", discontinued = false)

    case Lushai extends Language("lus", "Lushai", discontinued = false)

    case Luxembourgish extends Language("ltz", "Luxembourgish", discontinued = false)

    case Maasai extends Language("mas", "Maasai", discontinued = false)

    case Macedonian extends Language("mac", "Macedonian", discontinued = false)

    case Madurese extends Language("mad", "Madurese", discontinued = false)

    case Magahi extends Language("mag", "Magahi", discontinued = false)

    case Maithili extends Language("mai", "Maithili", discontinued = false)

    case Makasar extends Language("mak", "Makasar", discontinued = false)

    case Malagasy extends Language("mlg", "Malagasy", discontinued = false)

    @deprecated("Use Malagasy instead", "1.0.0") case Malagasy2 extends Language("mla", "Malagasy", discontinued = true)

    case Malay extends Language("may", "Malay", discontinued = false)

    case Malayalam extends Language("mal", "Malayalam", discontinued = false)

    case Maltese extends Language("mlt", "Maltese", discontinued = false)

    case Manchu extends Language("mnc", "Manchu", discontinued = false)

    case Mandar extends Language("mdr", "Mandar", discontinued = false)

    case Mandingo extends Language("man", "Mandingo", discontinued = false)

    case Manipuri extends Language("mni", "Manipuri", discontinued = false)

    case ManoboLanguages extends Language("mno", "Manobo languages", discontinued = false)

    case Manx extends Language("glv", "Manx", discontinued = false)

    @deprecated("Use Manx instead", "1.0.0") case Manx2 extends Language("max", "Manx", discontinued = true)

    case Maori extends Language("mao", "Maori", discontinued = false)

    case Mapuche extends Language("arn", "Mapuche", discontinued = false)

    case Marathi extends Language("mar", "Marathi", discontinued = false)

    case Mari extends Language("chm", "Mari", discontinued = false)

    case Marshallese extends Language("mah", "Marshallese", discontinued = false)

    case Marwari extends Language("mwr", "Marwari", discontinued = false)

    case MayanLanguages extends Language("myn", "Mayan languages", discontinued = false)

    case Mende extends Language("men", "Mende", discontinued = false)

    case Micmac extends Language("mic", "Micmac", discontinued = false)

    case Minangkabau extends Language("min", "Minangkabau", discontinued = false)

    case Mirandese extends Language("mwl", "Mirandese", discontinued = false)

    case MiscellaneousLanguages extends Language("mis", "Miscellaneous languages", discontinued = false)

    case Mohawk extends Language("moh", "Mohawk", discontinued = false)

    case Moksha extends Language("mdf", "Moksha", discontinued = false)

    case Moldavian extends Language("mol", "Moldavian", discontinued = true)

    case OtherMonKhmer extends Language("mkh", "Mon-Khmer (Other)", discontinued = false)

    case MongoNkundu extends Language("lol", "Mongo-Nkundu", discontinued = false)

    case Mongolian extends Language("mon", "Mongolian", discontinued = false)

    case Montenegrin extends Language("cnr", "Montenegrin", discontinued = false)

    case Moore extends Language("mos", "Mooré", discontinued = false)

    case MultipleLanguages extends Language("mul", "Multiple languages", discontinued = false)

    case OtherMunda extends Language("mun", "Munda (Other)", discontinued = false)

    case NKo extends Language("nqo", "N'Ko", discontinued = false)

    case Nahuatl extends Language("nah", "Nahuatl", discontinued = false)

    case Nauru extends Language("nau", "Nauru", discontinued = false)

    case Navajo extends Language("nav", "Navajo", discontinued = false)

    case NdebeleSouthAfrica extends Language("nbl", "Ndebele (South Africa)", discontinued = false)

    case NdebeleZimbabwe extends Language("nde", "Ndebele (Zimbabwe)", discontinued = false)

    case Ndonga extends Language("ndo", "Ndonga", discontinued = false)

    case NeapolitanItalian extends Language("nap", "Neapolitan Italian", discontinued = false)

    case Nepali extends Language("nep", "Nepali", discontinued = false)

    case Newari extends Language("new", "Newari", discontinued = false)

    case OldNewari extends Language("nwc", "Newari, Old", discontinued = false)

    case Nias extends Language("nia", "Nias", discontinued = false)

    case OtherNigerKordofanian extends Language("nic", "Niger-Kordofanian (Other)", discontinued = false)

    case OtherNiloSaharan extends Language("ssa", "Nilo-Saharan (Other)", discontinued = false)

    case Niuean extends Language("niu", "Niuean", discontinued = false)

    case NoLinguisticContent extends Language("zxx", "No linguistic content", discontinued = false)

    case Nogai extends Language("nog", "Nogai", discontinued = false)

    case OtherNorthAmericanIndian extends Language("nai", "North American Indian (Other)", discontinued = false)

    case NorthFrisian extends Language("frr", "North Frisian", discontinued = false)

    case NorthernSami extends Language("sme", "Northern Sami", discontinued = false)

    case NorthernSotho extends Language("nso", "Northern Sotho", discontinued = false)

    case Bokmal extends Language("nob", "Norwegian (Bokmål)", discontinued = false)

    case Nynorsk extends Language("nno", "Norwegian (Nynorsk)", discontinued = false)

    case Norwegian extends Language("nor", "Norwegian", discontinued = false)

    case NubianLanguages extends Language("nub", "Nubian languages", discontinued = false)

    case Nyamwezi extends Language("nym", "Nyamwezi", discontinued = false)

    case Nyanja extends Language("nya", "Nyanja", discontinued = false)

    case Nyankole extends Language("nyn", "Nyankole", discontinued = false)

    case Nyoro extends Language("nyo", "Nyoro", discontinued = false)

    case Nzima extends Language("nzi", "Nzima", discontinued = false)

    case Occitan extends Language("oci", "Occitan (post-1500)", discontinued = false)

    @deprecated("Use Occitan instead", "1.0.0") case Occitan2
        extends Language("lan", "Occitan (post 1500)", discontinued = true)

    case Oirat extends Language("xal", "Oirat", discontinued = false)

    case Ojibwa extends Language("oji", "Ojibwa", discontinued = false)

    case OldNorse extends Language("non", "Old Norse", discontinued = false)

    case OldPersian extends Language("peo", "Old Persian (ca. 600-400 B.C.)", discontinued = false)

    case Oriya extends Language("ori", "Oriya", discontinued = false)

    case Oromo extends Language("orm", "Oromo", discontinued = false)

    @deprecated("Use Oromo instead", "1.0.0") case Oromo2 extends Language("gal", "Oromo", discontinued = true)

    case Osage extends Language("osa", "Osage", discontinued = false)

    case Ossetic extends Language("oss", "Ossetic", discontinued = false)

    case OtomianLanguages extends Language("oto", "Otomian languages", discontinued = false)

    case Pahlavi extends Language("pal", "Pahlavi", discontinued = false)

    case Palauan extends Language("pau", "Palauan", discontinued = false)

    case Pali extends Language("pli", "Pali", discontinued = false)

    case Pampanga extends Language("pam", "Pampanga", discontinued = false)

    case Pangasinan extends Language("pag", "Pangasinan", discontinued = false)

    case Panjabi extends Language("pan", "Panjabi", discontinued = false)

    case Papiamento extends Language("pap", "Papiamento", discontinued = false)

    case OtherPapuan extends Language("paa", "Papuan (Other)", discontinued = false)

    case Persian extends Language("per", "Persian", discontinued = false)

    case OtherPhilippine extends Language("phi", "Philippine (Other)", discontinued = false)

    case Phoenician extends Language("phn", "Phoenician", discontinued = false)

    case Pohnpeian extends Language("pon", "Pohnpeian", discontinued = false)

    case Polish extends Language("pol", "Polish", discontinued = false)

    case Portuguese extends Language("por", "Portuguese", discontinued = false)

    case PrakritLanguages extends Language("pra", "Prakrit languages", discontinued = false)

    case Provencal extends Language("pro", "Provençal (to 1500)", discontinued = false)

    case Pushto extends Language("pus", "Pushto", discontinued = false)

    case Quechua extends Language("que", "Quechua", discontinued = false)

    case RaetoRomance extends Language("roh", "Raeto-Romance", discontinued = false)

    case Rajasthani extends Language("raj", "Rajasthani", discontinued = false)

    case Rapanui extends Language("rap", "Rapanui", discontinued = false)

    case Rarotongan extends Language("rar", "Rarotongan", discontinued = false)

    case OtherRomance extends Language("roa", "Romance (Other)", discontinued = false)

    case Romani extends Language("rom", "Romani", discontinued = false)

    case Romanian extends Language("rum", "Romanian", discontinued = false)

    case Rundi extends Language("run", "Rundi", discontinued = false)

    case Russian extends Language("rus", "Russian", discontinued = false)

    case SalishanLanguages extends Language("sal", "Salishan languages", discontinued = false)

    case SamaritanAramaic extends Language("sam", "Samaritan Aramaic", discontinued = false)

    case Sami extends Language("smi", "Sami", discontinued = false)

    @deprecated("Use Sami instead", "1.0.0") case Sami2 extends Language("lap", "Sami", discontinued = true)

    case Samoan extends Language("smo", "Samoan", discontinued = false)

    @deprecated("Use Samoan instead", "1.0.0") case Samoan2 extends Language("sao", "Samoan", discontinued = true)

    case Sandawe extends Language("sad", "Sandawe", discontinued = false)

    case Sango extends Language("sag", "Sango (Ubangi Creole)", discontinued = false)

    case Sanskrit extends Language("san", "Sanskrit", discontinued = false)

    case Santali extends Language("sat", "Santali", discontinued = false)

    case Sardinian extends Language("srd", "Sardinian", discontinued = false)

    case Sasak extends Language("sas", "Sasak", discontinued = false)

    case Scots extends Language("sco", "Scots", discontinued = false)

    case ScottishGaelic extends Language("gla", "Scottish Gaelic", discontinued = false)

    @deprecated("Use ScottishGaelic instead", "1.0.0") case ScottishGaelix
        extends Language("gae", "Scottish Gaelix", discontinued = true)

    case Selkup extends Language("sel", "Selkup", discontinued = false)

    case OtherSemitic extends Language("sem", "Semitic (Other)", discontinued = false)

    case Serbian extends Language("srp", "Serbian", discontinued = false)

    @deprecated("Use Serbian instead", "1.0.0") case Serbian2 extends Language("scc", "Serbian", discontinued = true)

    case Serer extends Language("srr", "Serer", discontinued = false)

    case Shan extends Language("shn", "Shan", discontinued = false)

    case Shona extends Language("sna", "Shona", discontinued = false)

    @deprecated("Use Shona instead", "1.0.0") case Shona2 extends Language("sho", "Shona", discontinued = true)

    case SichuanYi extends Language("iii", "Sichuan Yi", discontinued = false)

    case SicilianItalian extends Language("scn", "Sicilian Italian", discontinued = false)

    case Sidamo extends Language("sid", "Sidamo", discontinued = false)

    case SignLanguages extends Language("sgn", "Sign languages", discontinued = false)

    case Siksika extends Language("bla", "Siksika", discontinued = false)

    case Sindhi extends Language("snd", "Sindhi", discontinued = false)

    case Sinhalese extends Language("sin", "Sinhalese", discontinued = false)

    @deprecated("Use Sinhalese instead", "1.0.0") case Sinhalese2
        extends Language("snh", "Sinhalese", discontinued = true)

    case OtherSinoTibetan extends Language("sit", "Sino-Tibetan (Other)", discontinued = false)

    case OtherSiouan extends Language("sio", "Siouan (Other)", discontinued = false)

    case SkoltSami extends Language("sms", "Skolt Sami", discontinued = false)

    case Slavey extends Language("den", "Slavey", discontinued = false)

    case OtherSlavic extends Language("sla", "Slavic (Other)", discontinued = false)

    case Slovak extends Language("slo", "Slovak", discontinued = false)

    case Slovenian extends Language("slv", "Slovenian", discontinued = false)

    case Sogdian extends Language("sog", "Sogdian", discontinued = false)

    case Somali extends Language("som", "Somali", discontinued = false)

    case Songhai extends Language("son", "Songhai", discontinued = false)

    case Soninke extends Language("snk", "Soninke", discontinued = false)

    case OtherSorbian extends Language("wen", "Sorbian (Other)", discontinued = false)

    case Sotho extends Language("sot", "Sotho", discontinued = false)

    @deprecated("Use Sotho instead", "1.0.0") case Sotho2 extends Language("sso", "Sotho", discontinued = true)

    case OtherSouthAmericanIndian extends Language("sai", "South American Indian (Other)", discontinued = false)

    case SouthernSami extends Language("sma", "Southern Sami", discontinued = false)

    case Spanish extends Language("spa", "Spanish", discontinued = false)

    case Sranan extends Language("srn", "Sranan", discontinued = false)

    case Sukuma extends Language("suk", "Sukuma", discontinued = false)

    case Sumerian extends Language("sux", "Sumerian", discontinued = false)

    case Sundanese extends Language("sun", "Sundanese", discontinued = false)

    case Susu extends Language("sus", "Susu", discontinued = false)

    case Swahili extends Language("swa", "Swahili", discontinued = false)

    case Swazi extends Language("ssw", "Swazi", discontinued = false)

    @deprecated("Use Swazi instead", "1.0.0") case Swazi2 extends Language("swz", "Swazi", discontinued = true)

    case Swedish extends Language("swe", "Swedish", discontinued = false)

    case SwissGerman extends Language("gsw", "Swiss German", discontinued = false)

    case Syriac extends Language("syc", "Syriac", discontinued = false)

    case ModernSyriac extends Language("syr", "Syriac, Modern", discontinued = false)

    case Tagalog extends Language("tgl", "Tagalog", discontinued = false)

    @deprecated("Use Tagalog instead", "1.0.0") case Tagalog2 extends Language("tag", "Tagalog", discontinued = true)

    case Tahitian extends Language("tah", "Tahitian", discontinued = false)

    case OtherTai extends Language("tai", "Tai (Other)", discontinued = false)

    case Tajik extends Language("tgk", "Tajik", discontinued = false)

    @deprecated("Use Tajik instead", "1.0.0") case Tajik2 extends Language("taj", "Tajik", discontinued = true)

    case Tamashek extends Language("tmh", "Tamashek", discontinued = false)

    case Tamil extends Language("tam", "Tamil", discontinued = false)

    case Tatar extends Language("tat", "Tatar", discontinued = false)

    @deprecated("Use Tatar instead", "1.0.0") case Tatar2 extends Language("tar", "Tatar", discontinued = true)

    case Telugu extends Language("tel", "Telugu", discontinued = false)

    case Temne extends Language("tem", "Temne", discontinued = false)

    case Terena extends Language("ter", "Terena", discontinued = false)

    case Tetum extends Language("tet", "Tetum", discontinued = false)

    case Thai extends Language("tha", "Thai", discontinued = false)

    case Tibetan extends Language("tib", "Tibetan", discontinued = false)

    case Tigrinya extends Language("tir", "Tigrinya", discontinued = false)

    case Tigre extends Language("tig", "Tigré", discontinued = false)

    case Tiv extends Language("tiv", "Tiv", discontinued = false)

    case Tlicho extends Language("dgr", "Tlicho", discontinued = false)

    case Tlingit extends Language("tli", "Tlingit", discontinued = false)

    case TokPisin extends Language("tpi", "Tok Pisin", discontinued = false)

    case Tokelauan extends Language("tkl", "Tokelauan", discontinued = false)

    case Tonga extends Language("tog", "Tonga (Nyasa)", discontinued = false)

    case Tongan extends Language("ton", "Tongan", discontinued = false)

    case Truk extends Language("tru", "Truk", discontinued = true)

    case Tsimshian extends Language("tsi", "Tsimshian", discontinued = false)

    case Tsonga extends Language("tso", "Tsonga", discontinued = false)

    case Tswana extends Language("tsn", "Tswana", discontinued = false)

    @deprecated("Use Tswana instead", "1.0.0") case Tswana2 extends Language("tsw", "Tswana", discontinued = true)

    case Tumbuka extends Language("tum", "Tumbuka", discontinued = false)

    case TupiLanguages extends Language("tup", "Tupi languages", discontinued = false)

    case Turkish extends Language("tur", "Turkish", discontinued = false)

    case OttomanTurkish extends Language("ota", "Turkish, Ottoman", discontinued = false)

    case Turkmen extends Language("tuk", "Turkmen", discontinued = false)

    case Tuvaluan extends Language("tvl", "Tuvaluan", discontinued = false)

    case Tuvinian extends Language("tyv", "Tuvinian", discontinued = false)

    case Twi extends Language("twi", "Twi", discontinued = false)

    case Udmurt extends Language("udm", "Udmurt", discontinued = false)

    case Ugaritic extends Language("uga", "Ugaritic", discontinued = false)

    case Uighur extends Language("uig", "Uighur", discontinued = false)

    case Ukrainian extends Language("ukr", "Ukrainian", discontinued = false)

    case Umbundu extends Language("umb", "Umbundu", discontinued = false)

    case Undetermined extends Language("und", "Undetermined", discontinued = false)

    case UpperSorbian extends Language("hsb", "Upper Sorbian", discontinued = false)

    case Urdu extends Language("urd", "Urdu", discontinued = false)

    case Uzbek extends Language("uzb", "Uzbek", discontinued = false)

    case Vai extends Language("vai", "Vai", discontinued = false)

    case Venda extends Language("ven", "Venda", discontinued = false)

    case Vietnamese extends Language("vie", "Vietnamese", discontinued = false)

    case Volapuk extends Language("vol", "Volapük", discontinued = false)

    case Votic extends Language("vot", "Votic", discontinued = false)

    case WakashanLanguages extends Language("wak", "Wakashan languages", discontinued = false)

    case Walloon extends Language("wln", "Walloon", discontinued = false)

    case Waray extends Language("war", "Waray", discontinued = false)

    case Washoe extends Language("was", "Washoe", discontinued = false)

    case Welsh extends Language("wel", "Welsh", discontinued = false)

    case WesternPahariLanguages extends Language("him", "Western Pahari languages", discontinued = false)

    case Wolayta extends Language("wal", "Wolayta", discontinued = false)

    case Wolof extends Language("wol", "Wolof", discontinued = false)

    case Xhosa extends Language("xho", "Xhosa", discontinued = false)

    case Yakut extends Language("sah", "Yakut", discontinued = false)

    case Yao extends Language("yao", "Yao (Africa)", discontinued = false)

    case Yapese extends Language("yap", "Yapese", discontinued = false)

    case Yiddish extends Language("yid", "Yiddish", discontinued = false)

    case Yoruba extends Language("yor", "Yoruba", discontinued = false)

    case YupikLanguages extends Language("ypk", "Yupik languages", discontinued = false)

    case ZandeLanguages extends Language("znd", "Zande languages", discontinued = false)

    case Zapotec extends Language("zap", "Zapotec", discontinued = false)

    case Zaza extends Language("zza", "Zaza", discontinued = false)

    case Zenaga extends Language("zen", "Zenaga", discontinued = false)

    case Zhuang extends Language("zha", "Zhuang", discontinued = false)

    case Zulu extends Language("zul", "Zulu", discontinued = false)

    case Zuni extends Language("zun", "Zuni", discontinued = false)
end Language

object Language:
    def fromCode(code: String): Maybe[Language] =
        Language.values.find(_.code.toLowerCase == code.toLowerCase.trim).maybe
