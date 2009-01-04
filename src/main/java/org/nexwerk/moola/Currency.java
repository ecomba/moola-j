package org.nexwerk.moola;

import java.util.Map;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;

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
    STD,        //  São Tome and Principe, Dobras
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
    XAF,        //  Communauté Financière Africaine BEAC, Francs
    XAG,        //  Silver, Ounces
    XAU,        //  Gold, Ounces
    XCD,        //  East Caribbean Dollars
    XDR,        //  International Monetary Fund (IMF) Special Drawing Rights
    XOF,        //  Communauté Financière Africaine BCEAO, Francs
    XPD,        //  Palladium Ounces
    XPF,        //  Comptoirs Français du Pacifique Francs
    XPT,        //  Platinum, Ounces
    YER,        //  Yemen, Rials
    ZAR,        //  South Africa, Rand
    ZMK,        //  Zambia, Kwacha
    ZWD;        //  Zimbabwe, Zimbabwe Dollars


    private static final Map<Currency, String> symbols;
    private static final String dollarSymbol = "\u0024";
    private static final String poundSymbol = "\u00A3";

    static {
        symbols = new HashMap<Currency, String>() {{
            put(Currency.GENERIC, "\u00A4");
            put(Currency.AED, "");
//            put(Currency.AFN, "");
            put(Currency.ALL, "Lek");
//            put(Currency.AMD, "");
//            put(Currency.ANG, "");
            put(Currency.AOA, "");
            put(Currency.ARS, dollarSymbol);
            put(Currency.AUD, dollarSymbol);
//            put(Currency.AWG, "");
            put(Currency.AZN, "MaH");
            put(Currency.BAM, "KM");
            put(Currency.BBD, dollarSymbol);
//            put(Currency.BDT, "");
//            put(Currency.BGN, "");
//            put(Currency.BHD, "");
//            put(Currency.BIF, "");
            put(Currency.BMD, dollarSymbol);
            put(Currency.BND, dollarSymbol);
            put(Currency.BOB, dollarSymbol + "b");
            put(Currency.BRL, "R" + dollarSymbol);
            put(Currency.BSD, dollarSymbol);
//            put(Currency.BTN, "");
            put(Currency.BWP, "P");
            put(Currency.BYR, "p.");
            put(Currency.BZD, "BZ" + dollarSymbol);
            put(Currency.CAD, dollarSymbol);
//            put(Currency.CDF, "");
            put(Currency.CHF, Currency.CHF.toString());
            put(Currency.CLP, dollarSymbol);
//            put(Currency.CNY, "");
            put(Currency.COP, dollarSymbol);
//            put(Currency.CRC, "");
//            put(Currency.CUP, "");
//            put(Currency.CVE, "");
//            put(Currency.CYP, "");
//            put(Currency.CZK, "");
//            put(Currency.DJF, "");
            put(Currency.DKK, "kr");
            put(Currency.DOP, "RD" + dollarSymbol);
//            put(Currency.DZD, "");
            put(Currency.EEK, "kr");
            put(Currency.EGP, poundSymbol);
//            put(Currency.ERN, "");
//            put(Currency.ETB, "");
            put(Currency.EUR, "\u0080");
            put(Currency.FJD, dollarSymbol);
            put(Currency.FKP, poundSymbol);
            put(Currency.GBP, poundSymbol);
//            put(Currency.GEL, "");
            put(Currency.GGP, poundSymbol);
//            put(Currency.GHS, "");
            put(Currency.GIP, poundSymbol);
//            put(Currency.GMD, "");
//            put(Currency.GNF, "");
            put(Currency.GTQ, "Q");
            put(Currency.GYD, dollarSymbol);
            put(Currency.HKD, "HK" + dollarSymbol);
            put(Currency.HNL, "L");
            put(Currency.HRK, "kn");
//            put(Currency.HTG, "");
            put(Currency.HUF, "Ft");
            put(Currency.IDR, "Rp");
//            put(Currency.ILS, "");
            put(Currency.IMP, poundSymbol);
//            put(Currency.INR, "");
//            put(Currency.IQD, "");
//            put(Currency.IRR, "");
            put(Currency.ISK, "kr");
            put(Currency.JEP, dollarSymbol);
            put(Currency.JMD, "J" + dollarSymbol);
//            put(Currency.JOD, "");
            put(Currency.JPY, "\u00A5");
//            put(Currency.KES, "");
//            put(Currency.KGS, "");
//            put(Currency.KHR, "");
//            put(Currency.KMF, "");
//            put(Currency.KPW, "");
//            put(Currency.KRW, "");
//            put(Currency.KWD, "");
            put(Currency.KYD, dollarSymbol);
//            put(Currency.KZT, "");
//            put(Currency.LAK, "");
            put(Currency.LBP, poundSymbol);
//            put(Currency.LKR, "");
            put(Currency.LRD, dollarSymbol);
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
            put(Currency.MXN, dollarSymbol);
            put(Currency.MYR, "RM");
            put(Currency.MZN, "MT");
            put(Currency.NAD, dollarSymbol);
//            put(Currency.NGN, "");
            put(Currency.NIO, "C" + dollarSymbol);
            put(Currency.NOK, "kr");
//            put(Currency.NPR, "");
            put(Currency.NZD, dollarSymbol);
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
            put(Currency.SBD, dollarSymbol);
//            put(Currency.SCR, "");
//            put(Currency.SDG, "");
            put(Currency.SEK, "kr");
            put(Currency.SGD, dollarSymbol);
            put(Currency.SHP, poundSymbol);
//            put(Currency.SKK, "");
//            put(Currency.SLL, "");
            put(Currency.SOS, "S");
//            put(Currency.SPL, "");
            put(Currency.SRD, dollarSymbol);
//            put(Currency.STD, "");
            put(Currency.SVC, dollarSymbol);
            put(Currency.SYP, poundSymbol);
//            put(Currency.SZL, "");
//            put(Currency.THB, "");
//            put(Currency.TJS, "");
//            put(Currency.TMM, "");
//            put(Currency.TND, "");
//            put(Currency.TOP, "");
            put(Currency.TRY, "YTL");
            put(Currency.TTD, "TT" + dollarSymbol);
            put(Currency.TVD, dollarSymbol);
//            put(Currency.TWD, "");
//            put(Currency.TZS, "");
//            put(Currency.UAH, "");
//            put(Currency.UGX, "");
            put(Currency.USD, dollarSymbol);
            put(Currency.UYU, dollarSymbol + "U");
//            put(Currency.UZS, "");
//            put(Currency.VEB, "");
            put(Currency.VEF, "Bs");
//            put(Currency.VND, "");
//            put(Currency.VUV, "");
//            put(Currency.WST, "");
//            put(Currency.XAF, "");
//            put(Currency.XAG, "");
//            put(Currency.XAU, "");
            put(Currency.XCD, dollarSymbol);
//            put(Currency.XDR, "");
//            put(Currency.XOF, "");
//            put(Currency.XPD, "");
//            put(Currency.XPF, "");
//            put(Currency.XPT, "");
//            put(Currency.YER, "");
            put(Currency.ZAR, "R");
//            put(Currency.ZMK, "");
            put(Currency.ZWD, "Z" + dollarSymbol);
        }};
    }

    public String getSymbol() {
        if(symbols.containsKey(this)) {
            try {
                return new String(symbols.get(this).getBytes("UTF-8")).substring(1);
            } catch (UnsupportedEncodingException e) {
                return this.toString();
            }
        } else {
            return this.toString();
        }
    }
}
