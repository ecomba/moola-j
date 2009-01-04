package org.nexwerk.moola;

import java.util.Map;
import java.util.HashMap;

/**
 * This enumeration represents the available currencies in moola.
 * The list was taken from the ISO 4217 Currency Code List (http://www.xe.com/iso4217.php).
 * For a full support of these currencies we still need to have the symbols
 * of these converted to UTF-8 so that they can be displayed nicely when
 * printing (either to the console or when generating documents, etc). For a
 * complete list of this symbols refer to http://www.xe.com/symbols.php
 *
 * @author Enrique Comba Riepenhausen
*/
public enum Currency {
    GENERIC,    //  Generic Currency symbol
    AED,        //  United Arab Emirates, Dirhams
    AFN,        //  Afghanistan, Afghanis
    ALL,        //  Albania, Leke
    AMD,        //  Armenia, Drams
    ANG,        //  Netherlands Antilles, Guilders (also called Florins)
    AOA,        //  Angola, Kwanza
    ARS,        //  Argentina, Pesos
    AUD,        //  Australia, Dollars
    AWG,        //  Aruba, Guilders (also called Florins)
    AZN,        //  Azerbaijan, New Manats
    BAM,        //  Bosnia and Herzegovina, Convertible Marka
    BBD,        //  Barbados, Dollars
    BDT,        //  Bangladesh, Taka
    BGN,        //  Bulgaria, Leva
    BHD,        //  Bahrain, Dinars
    BIF,        //  Burundi, Francs
    BMD,        //  Bermuda, Dollars
    BND,        //  Brunei Darussalam, Dollars
    BOB,        //  Bolivia, Bolivianos
    BRL,        //  Brazil, Brazil Real
    BSD,        //  Bahamas, Dollars
    BTN,        //  Bhutan, Ngultrum
    BWP,        //  Botswana, Pulas
    BYR,        //  Belarus, Rubles
    BZD,        //  Belize, Dollars
    CAD,        //  Canada, Dollars
    CDF,        //  Congo/Kinshasa, Congolese Francs
    CHF,        //  Switzerland, Francs
    CLP,        //  Chile, Pesos
    CNY,        //  China, Yuan Renminbi
    COP,        //  Colombia, Pesos
    CRC,        //  Costa Rica, Colones
    CUP,        //  Cuba, Pesos
    CVE,        //  Cape Verde, Escudos
    CYP,        //  Cyprus, Pounds (expires 2008-Jan-31)
    CZK,        //  Czech Republic, Koruny
    DJF,        //  Djibouti, Francs
    DKK,        //  Denmark, Kroner
    DOP,        //  Dominican Republic, Pesos
    DZD,        //  Algeria, Algeria Dinars
    EEK,        //  Estonia, Krooni
    EGP,        //  Egypt, Pounds
    ERN,        //  Eritrea, Nakfa
    ETB,        //  Ethiopia, Birr
    EUR,        //  Euro Member Countries, Euro
    FJD,        //  Fiji, Dollars
    FKP,        //  Falkland Islands (Malvinas), Pounds
    GBP,        //  United Kingdom, Pounds
    GEL,        //  Georgia, Lari
    GGP,        //  Guernsey, Pounds
    GHS,        //  Ghana, Cedis
    GIP,        //  Gibraltar, Pounds
    GMD,        //  Gambia, Dalasi
    GNF,        //  Guinea, Francs
    GTQ,        //  Guatemala, Quetzales
    GYD,        //  Guyana, Dollars
    HKD,        //  Hong Kong, Dollars
    HNL,        //  Honduras, Lempiras
    HRK,        //  Croatia, Kuna
    HTG,        //  Haiti, Gourdes
    HUF,        //  Hungary, Forint
    IDR,        //  Indonesia, Rupiahs
    ILS,        //  Israel, New Shekels
    IMP,        //  Isle of Man, Pounds
    INR,        //  India, Rupees
    IQD,        //  Iraq, Dinars
    IRR,        //  Iran, Rials
    ISK,        //  Iceland, Kronur
    JEP,        //  Jersey, Pounds
    JMD,        //  Jamaica, Dollars
    JOD,        //  Jordan, Dinars
    JPY,        //  Japan, Yen
    KES,        //  Kenya, Shillings
    KGS,        //  Kyrgyzstan, Soms
    KHR,        //  Cambodia, Riels
    KMF,        //  Comoros, Francs
    KPW,        //  Korea (North), Won
    KRW,        //  Korea (South), Won
    KWD,        //  Kuwait, Dinars
    KYD,        //  Cayman Islands, Dollars
    KZT,        //  Kazakhstan, Tenge
    LAK,        //  Laos, Kips
    LBP,        //  Lebanon, Pounds
    LKR,        //  Sri Lanka, Rupees
    LRD,        //  Liberia, Dollars
    LSL,        //  Lesotho, Maloti
    LTL,        //  Lithuania, Litai
    LVL,        //  Latvia, Lati
    LYD,        //  Libya, Dinars
    MAD,        //  Morocco, Dirhams
    MDL,        //  Moldova, Lei
    MGA,        //  Madagascar, Ariary
    MKD,        //  Macedonia, Denars
    MMK,        //  Myanmar (Burma), Kyats
    MNT,        //  Mongolia, Tugriks
    MOP,        //  Macau, Patacas
    MRO,        //  Mauritania, Ouguiyas
    MTL,        //  Malta, Liri (expires 2008-Jan-31)
    MUR,        //  Mauritius, Rupees
    MVR,        //  Maldives (Maldive Islands), Rufiyaa
    MWK,        //  Malawi, Kwachas
    MXN,        //  Mexico, Pesos
    MYR,        //  Malaysia, Ringgits
    MZN,        //  Mozambique, Meticais
    NAD,        //  Namibia, Dollars
    NGN,        //  Nigeria, Nairas
    NIO,        //  Nicaragua, Cordobas
    NOK,        //  Norway, Krone
    NPR,        //  Nepal, Nepal Rupees
    NZD,        //  New Zealand, Dollars
    OMR,        //  Oman, Rials
    PAB,        //  Panama, Balboa
    PEN,        //  Peru, Nuevos Soles
    PGK,        //  Papua New Guinea, Kina
    PHP,        //  Philippines, Pesos
    PKR,        //  Pakistan, Rupees
    PLN,        //  Poland, Zlotych
    PYG,        //  Paraguay, Guarani
    QAR,        //  Qatar, Rials
    RON,        //  Romania, New Lei
    RSD,        //  Serbia, Dinars
    RUB,        //  Russia, Rubles
    RWF,        //  Rwanda, Rwanda Francs
    SAR,        //  Saudi Arabia, Riyals
    SBD,        //  Solomon Islands, Dollars
    SCR,        //  Seychelles, Rupees
    SDG,        //  Sudan, Pounds
    SEK,        //  Sweden, Kronor
    SGD,        //  Singapore, Dollars
    SHP,        //  Saint Helena, Pounds
    SKK,        //  Slovakia, Koruny
    SLL,        //  Sierra Leone, Leones
    SOS,        //  Somalia, Shillings
    SPL,        //  Seborga, Luigini
    SRD,        //  Suriname, Dollars
    STD,        //  Sao Tome and Principe, Dobras
    SVC,        //  El Salvador, Colones
    SYP,        //  Syria, Pounds
    SZL,        //  Swaziland, Emalangeni
    THB,        //  Thailand, Baht
    TJS,        //  Tajikistan, Somoni
    TMM,        //  Turkmenistan, Manats
    TND,        //  Tunisia, Dinars
    TOP,        //  Tonga, Pa'anga
    TRY,        //  Turkey, New Lira
    TTD,        //  Trinidad and Tobago, Dollars
    TVD,        //  Tuvalu, Tuvalu Dollars
    TWD,        //  Taiwan, New Dollars
    TZS,        //  Tanzania, Shillings
    UAH,        //  Ukraine, Hryvnia
    UGX,        //  Uganda, Shillings
    USD,        //  United States of America, Dollars
    UYU,        //  Uruguay, Pesos
    UZS,        //  Uzbekistan, Sums
    VEB,        //  Venezuela, Bolivares (expires 2008-Jun-30)
    VEF,        //  Venezuela, Bolivares Fuertes
    VND,        //  Viet Nam, Dong
    VUV,        //  Vanuatu, Vatu
    WST,        //  Samoa, Tala
    XAF,        //  Communaut Financiare Africaine BEAC, Francs
    XAG,        //  Silver, Ounces
    XAU,        //  Gold, Ounces
    XCD,        //  East Caribbean Dollars
    XDR,        //  International Monetary Fund (IMF) Special Drawing Rights
    XOF,        //  Communaute Financiare Africaine BCEAO, Francs
    XPD,        //  Palladium Ounces
    XPF,        //  Comptoirs Francais du Pacifique Francs
    XPT,        //  Platinum, Ounces
    YER,        //  Yemen, Rials
    ZAR,        //  South Africa, Rand
    ZMK,        //  Zambia, Kwacha
    ZWD;        //  Zimbabwe, Zimbabwe Dollars


    private static final Map<Currency, String> SYMBOLS;
    private static final String DOLLAR_SYMBOL = "\u0024";
    private static final String POUND_SYMBOL = "\u00a3";

    static {
        SYMBOLS = new HashMap<Currency, String>() {{
            put(Currency.GENERIC, "\u00a4");
            put(Currency.AED, "\u062f.\u0625");
            put(Currency.AFN, "\u060b");
            put(Currency.ALL, "Lek");
            put(Currency.AMD, "\u0564\u0580.");
            put(Currency.ANG, "\u0192");
            put(Currency.AOA, "Kz");
            put(Currency.ARS, DOLLAR_SYMBOL);
            put(Currency.AUD, DOLLAR_SYMBOL);
            put(Currency.AWG, "\u0192");
            put(Currency.AZN, "MaH");
            put(Currency.BAM, "KM");
            put(Currency.BBD, DOLLAR_SYMBOL);
            put(Currency.BDT, "\u09f3");
            put(Currency.BGN, "\u043b\u0432");
            put(Currency.BHD, "\u0628.\u062f");
            put(Currency.BIF, "FBu");
            put(Currency.BMD, DOLLAR_SYMBOL);
            put(Currency.BND, DOLLAR_SYMBOL);
            put(Currency.BOB, DOLLAR_SYMBOL + "b");
            put(Currency.BRL, "R" + DOLLAR_SYMBOL);
            put(Currency.BSD, DOLLAR_SYMBOL);
            put(Currency.BTN, "Nu.");
            put(Currency.BWP, "P");
            put(Currency.BYR, "p.");
            put(Currency.BZD, "BZ" + DOLLAR_SYMBOL);
            put(Currency.CAD, DOLLAR_SYMBOL);
            put(Currency.CDF, "F");
            put(Currency.CHF, "CHF");
            put(Currency.CLP, DOLLAR_SYMBOL);
            put(Currency.CNY, "\u5143");
            put(Currency.COP, DOLLAR_SYMBOL);
            put(Currency.CRC, "\u20a1");
            put(Currency.CUP, DOLLAR_SYMBOL);
            put(Currency.CVE, DOLLAR_SYMBOL);
            put(Currency.CYP, POUND_SYMBOL);
            put(Currency.CZK, "K\u010d");
            put(Currency.DJF, "Fdj");
            put(Currency.DKK, "kr");
            put(Currency.DOP, "RD" + DOLLAR_SYMBOL);
            put(Currency.DZD, "\u062f\u062c");
            put(Currency.EEK, "kr");
            put(Currency.EGP, POUND_SYMBOL);
            put(Currency.ERN, "Nfk");
            put(Currency.ETB, "Br");
            put(Currency.EUR, "\u20ac");
            put(Currency.FJD, DOLLAR_SYMBOL);
            put(Currency.FKP, POUND_SYMBOL);
            put(Currency.GBP, POUND_SYMBOL);
            put(Currency.GEL, "\u10e6");
            put(Currency.GGP, POUND_SYMBOL);
            put(Currency.GHS, "\u20b5");
            put(Currency.GIP, POUND_SYMBOL);
            put(Currency.GMD, "D");
            put(Currency.GNF, "FG");
            put(Currency.GTQ, "Q");
            put(Currency.GYD, DOLLAR_SYMBOL);
            put(Currency.HKD, "HK" + DOLLAR_SYMBOL);
            put(Currency.HNL, "L");
            put(Currency.HRK, "kn");
            put(Currency.HTG, "G");
            put(Currency.HUF, "Ft");
            put(Currency.IDR, "Rp");
            put(Currency.ILS, "\u20aa");
            put(Currency.IMP, POUND_SYMBOL);
            put(Currency.INR, "\u20a8");
            put(Currency.IQD, "\u0639.\u062f");
            put(Currency.IRR, "\ufdfc");
            put(Currency.ISK, "kr");
            put(Currency.JEP, DOLLAR_SYMBOL);
            put(Currency.JMD, "J" + DOLLAR_SYMBOL);
            put(Currency.JOD, "\u062f.\u0627");
            put(Currency.JPY, "\u00a5");
            put(Currency.KES, "KSh");
            put(Currency.KGS, "\u043b\u0432");
            put(Currency.KHR, "\u17db");
            put(Currency.KMF, "CF");
            put(Currency.KPW, "");
//            put(Currency.KRW, "");
//            put(Currency.KWD, "");
            put(Currency.KYD, DOLLAR_SYMBOL);
//            put(Currency.KZT, "");
//            put(Currency.LAK, "");
            put(Currency.LBP, POUND_SYMBOL);
//            put(Currency.LKR, "");
            put(Currency.LRD, DOLLAR_SYMBOL);
            put(Currency.LSL, "");
//            put(Currency.LTL, "Lt");
            put(Currency.LVL, "Ls");
//            put(Currency.LYD, "");
//            put(Currency.MAD, "");
//            put(Currency.MDL, "");
//            put(Currency.MGA, "");
//            put(Currency.MKD, "");
//            put(Currency.MMK, "");
//            put(Currency.MNT, "");
//            put(Currency.MOP, "");
//            put(Currency.MRO, "");
//            put(Currency.MTL, "");
//            put(Currency.MUR, "");
//            put(Currency.MVR, "");
//            put(Currency.MWK, "");
            put(Currency.MXN, DOLLAR_SYMBOL);
            put(Currency.MYR, "RM");
            put(Currency.MZN, "MT");
            put(Currency.NAD, DOLLAR_SYMBOL);
//            put(Currency.NGN, "");
            put(Currency.NIO, "C" + DOLLAR_SYMBOL);
            put(Currency.NOK, "kr");
//            put(Currency.NPR, "");
            put(Currency.NZD, DOLLAR_SYMBOL);
//            put(Currency.OMR, "");
            put(Currency.PAB, "B/.");
            put(Currency.PEN, "S/.");
//            put(Currency.PGK, "");
            put(Currency.PHP, "Php");
//            put(Currency.PKR, "");
//            put(Currency.PLN, "");
            put(Currency.PYG, "Gs");
//            put(Currency.QAR, "");
            put(Currency.RON, "lei");
//            put(Currency.RSD, "");
//            put(Currency.RUB, "");
//            put(Currency.RWF, "");
//            put(Currency.SAR, "");
            put(Currency.SBD, DOLLAR_SYMBOL);
//            put(Currency.SCR, "");
//            put(Currency.SDG, "");
            put(Currency.SEK, "kr");
            put(Currency.SGD, DOLLAR_SYMBOL);
            put(Currency.SHP, POUND_SYMBOL);
//            put(Currency.SKK, "");
//            put(Currency.SLL, "");
            put(Currency.SOS, "S");
//            put(Currency.SPL, "");
            put(Currency.SRD, DOLLAR_SYMBOL);
//            put(Currency.STD, "");
            put(Currency.SVC, DOLLAR_SYMBOL);
            put(Currency.SYP, POUND_SYMBOL);
//            put(Currency.SZL, "");
//            put(Currency.THB, "");
//            put(Currency.TJS, "");
//            put(Currency.TMM, "");
//            put(Currency.TND, "");
//            put(Currency.TOP, "");
            put(Currency.TRY, "YTL");
            put(Currency.TTD, "TT" + DOLLAR_SYMBOL);
            put(Currency.TVD, DOLLAR_SYMBOL);
//            put(Currency.TWD, "");
//            put(Currency.TZS, "");
//            put(Currency.UAH, "");
//            put(Currency.UGX, "");
            put(Currency.USD, DOLLAR_SYMBOL);
            put(Currency.UYU, DOLLAR_SYMBOL + "U");
//            put(Currency.UZS, "");
//            put(Currency.VEB, "");
            put(Currency.VEF, "Bs");
//            put(Currency.VND, "");
//            put(Currency.VUV, "");
//            put(Currency.WST, "");
//            put(Currency.XAF, "");
//            put(Currency.XAG, "");
//            put(Currency.XAU, "");
            put(Currency.XCD, DOLLAR_SYMBOL);
//            put(Currency.XDR, "");
//            put(Currency.XOF, "");
//            put(Currency.XPD, "");
//            put(Currency.XPF, "");
//            put(Currency.XPT, "");
//            put(Currency.YER, "");
            put(Currency.ZAR, "R");
//            put(Currency.ZMK, "");
            put(Currency.ZWD, "Z" + DOLLAR_SYMBOL);
        }};
    }

    public String getSymbol() {
        if(SYMBOLS.containsKey(this)) {
            return new String(SYMBOLS.get(this).getBytes());
        } else {
            return this.toString();
        }
    }
}
