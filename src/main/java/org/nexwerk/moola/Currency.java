package org.nexwerk.moola;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Enrique Comba Riepenhausen
*/
public enum Currency {
    AUD,        // Australian dollar
    AWG,        // Aruban florin
    BYR,        // Belarusian ruble
    BRL,        // Brazilian real
    BWP,        // Botswana pula
    DKK,        // Danish krone
    EUR,        // Euro
    CHF,        // Swiss franc
    CNY,        // Renminbi
    CRC,        // Col—n Costarica
    CZK,        // Czech koruna
    GBP,        // Pound sterling
    GENERIC,    // Generic currency symbol
    GHS,        // Ghanaian cedi
    GTQ,        // Guatemalan quetzal
    HKD,        // Hong Kong dollar
    HUF,        // Hungarian forint
    IDR,        // Indonesian rupiah
    ILS,        // Israeli new sheqel
    INR,        // Indian rupee
    IRR,        // Iranian rial
    ISK,        // Icelandic kr—na
    JPY,        // Japanese yen
    KHR,        // Cambodian riel
    KPW,        // North Korean won
    KRW,        // South Korean won
    KZT,        // Kazakhstani tenge
    LAK,        // Lao kip
    MNT,        // Mongolian tšgršg
    NGN,        // Nigerian naira
    NOK,        // Norwegian krone
    NZD,        // New Zealand dollar
    PHP,        // Philippine peso
    PKR,        // Pakistani rupee
    PLN,        // Polish z?oty
    PYG,        // Paraguayan guaran’
    RON,        // Romanian leu
    RSD,        // Serbian dinar
    RUB,        // Russian ruble
    SEK,        // Swedish krona
    SVC,        // Col—n El Salvador
    THB,        // Thai baht
    UAH,        // Ukrainian hryvnia
    USD,        // United States Dollar
    VEB,        // Venezuelan Bolivar
    VND,        // Vietnamese ??ng
    ZAR;        // South African rand


    private static final Map<Currency, String> symbols;

    static {
        symbols = new HashMap<Currency, String>() {{
            put(Currency.GENERIC, "?");
            put(Currency.GBP, "£");
            put(Currency.USD, "$");
            put(Currency.EUR, "Û");
            put(Currency.THB, "?");
            put(Currency.VEB, "Bs.");
            put(Currency.BYR, "Br");
            put(Currency.GHS, "?");
            put(Currency.CRC, "?");
            put(Currency.SVC, "?");
            put(Currency.VND, "?");
            put(Currency.AWG, "Afl.");
            put(Currency.HUF, "Ft");
            put(Currency.PKR, "?");
            put(Currency.INR, "Rs");
            put(Currency.PYG, "?");
            put(Currency.LAK, "?");
            put(Currency.DKK, "kr");
            put(Currency.NOK, "kr");
            put(Currency.SEK, "kr");
            put(Currency.ISK, "kr");
            put(Currency.NGN, "?");
            put(Currency.PHP, "?");
            put(Currency.BWP, "P");
            put(Currency.GTQ, "Q");
            put(Currency.ZAR, "R");
            put(Currency.IDR, "Rp");
            put(Currency.RON, "lei");
            put(Currency.BRL, "R$");
            put(Currency.AUD, "$");
            put(Currency.NZD, "$");
            put(Currency.HKD, "$");
            put(Currency.KZT, "T");
            put(Currency.MNT, "?");
            put(Currency.KRW, "?");
            put(Currency.KPW, "?");
            put(Currency.CNY, "´");
            put(Currency.JPY, "´");
            put(Currency.PLN, "z?");
            put(Currency.UAH, "?");
            put(Currency.ILS, "?");
            put(Currency.KHR, "?");
            put(Currency.IRR, "?");
            put(Currency.RUB, "???");
            put(Currency.CZK, "K?");
            put(Currency.CHF, "Fr.");
            put(Currency.RSD, "???");
        }};
    }

    public String getSymbol() {
        return symbols.get(this);
    }
}
