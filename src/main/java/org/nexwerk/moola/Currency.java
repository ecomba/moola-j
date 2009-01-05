package org.nexwerk.moola;

/**
 * This enumeration represents the available currencies in moola.
 * The list was taken from the ISO 4217 Currency Code List (http://www.xe.com/iso4217.php).
 *
 * @author Enrique Comba Riepenhausen
 * @author Nuno Marques
*/
public enum Currency {
    GENERIC("\u00a4"),          //  Generic Currency symbol
    AED("\u0631.\u0625"),       //  United Arab Emirates, Dirhams
    AFN("\u060b"),              //  Afghanistan, Afghanis
    ALL("Lek"),                 //  Albania, Leke
    AMD("\u0564\u0580."),       //  Armenia, Drams
    ANG("\u0192"),              //  Netherlands Antilles, Guilders (also called Florins)
    AOA("Kz"),                  //  Angola, Kwanza
    ARS("\u0024"),              //  Argentina, Pesos
    AUD("A\u0024"),             //  Australia, Dollars
    AWG("\u0192"),              //  Aruba, Guilders (also called Florins)
    AZN("MaH"),                 //  Azerbaijan, New Manats
    BAM("KM"),                  //  Bosnia and Herzegovina, Convertible Marka
    BBD("Bds\u0024"),           //  Barbados, Dollars
    BDT("\u09f3"),              //  Bangladesh, Taka
    BGN("\u043b\u0432"),        //  Bulgaria, Leva
    BHD("\u0628.\u0631"),       //  Bahrain, Dinars
    BIF("FBu"),                 //  Burundi, Francs
    BMD("Bs\u0024"),            //  Bermuda, Dollars
    BND("B\u0024"),             //  Brunei Darussalam, Dollars
    BOB("Bs"),                  //  Bolivia, Bolivianos
    BRL("R\u0024"),             //  Brazil, Brazil Real
    BSD("B\u0024"),             //  Bahamas, Dollars
    BTN("Nu."),                 //  Bhutan, Ngultrum
    BWP("P"),                   //  Botswana, Pulas
    BYR("p."),                  //  Belarus, Rubles
    BZD("BZ\u0024"),            //  Belize, Dollars
    CAD("Can\u0024"),           //  Canada, Dollars
    CDF("F"),                   //  Congo/Kinshasa, Congolese Francs
    CHF("CHF"),                 //  Switzerland, Francs
    CLP("Ch\u0024"),            //  Chile, Pesos
    CNY("\u5143"),              //  China, Yuan Renminbi
    COP("\u20b1"),              //  Colombia, Pesos
    CRC("\u20a1"),              //  Costa Rica, Colones
    CUP("\u0024MN"),            //  Cuba, Pesos
    CVE("\u0024"),              //  Cape Verde, Escudos
    CYP("\u00a3C"),             //  Cyprus, Pounds (expires 2008-Jan-31)
    CZK("K\u010d"),             //  Czech Republic, Koruny
    DJF("Fdj"),                 //  Djibouti, Francs
    DKK("kr"),                  //  Denmark, Kroner
    DOP("RD\u0024"),            //  Dominican Republic, Pesos
    DZD("\u0631\u062c"),        //  Algeria, Algeria Dinars
    EEK("kr"),                  //  Estonia, Krooni
    EGP("\u062c.\u0645"),       //  Egypt, Pounds
    ERN("Nfk"),                 //  Eritrea, Nakfa
    ETB("Br"),                  //  Ethiopia, Birr
    EUR("\u20ac"),              //  Euro Member Countries, Euro
    FJD("F\u0024"),             //  Fiji, Dollars
    FKP("\u00a3"),              //  Falkland Islands (Malvinas), Pounds
    GBP("\u00a3"),              //  United Kingdom, Pounds
    GEL("\u10e6"),              //  Georgia, Lari
    GGP("\u00a3"),              //  Guernsey, Pounds
    GHS("\u20b5"),              //  Ghana, Cedis
    GIP("\u00a3G"),             //  Gibraltar, Pounds
    GMD("D"),                   //  Gambia, Dalasi
    GNF("FG"),                  //  Guinea, Francs
    GTQ("Q"),                   //  Guatemala, Quetzales
    GYD("G\u0024"),             //  Guyana, Dollars
    HKD("HK\u0024"),            //  Hong Kong, Dollars
    HNL("L"),                   //  Honduras, Lempiras
    HRK("kn"),                  //  Croatia, Kuna
    HTG("G"),                   //  Haiti, Gourdes
    HUF("Ft"),                  //  Hungary, Forint
    IDR("Rp"),                  //  Indonesia, Rupiahs
    ILS("\u20aa"),              //  Israel, New Shekels
    IMP("\u00a3"),              //  Isle of Man, Pounds
    INR("\u20a8"),              //  India, Rupees
    IQD("\u0639.\u0631"),       //  Iraq, Dinars
    IRR("\ufdfc"),              //  Iran, Rials
    ISK("kr"),                  //  Iceland, Kronur
    JEP("\u00a3"),              //  Jersey, Pounds
    JMD("J\u0024"),             //  Jamaica, Dollars
    JOD("\u0631.\u0627"),       //  Jordan, Dinars
    JPY("\u00a5"),              //  Japan, Yen
    KES("KSh"),                 //  Kenya, Shillings
    KGS("\u043b\u0432"),        //  Kyrgyzstan, Soms
    KHR("\u17db"),              //  Cambodia, Riels
    KMF("CF"),                  //  Comoros, Francs
    KPW("\u20a9"),              //  Korea (North), Won
    KRW("\u20a9"),              //  Korea (South), Won
    KWD("\u0631.\u0643"),       //  Kuwait, Dinars
    KYD("CI\u0024"),            //  Cayman Islands, Dollars
    KZT("\u3012"),              //  Kazakhstan, Tenge
    LAK("\u20ad"),              //  Laos, Kips
    LBP("\u0644.\u0644"),       //  Lebanon, Pounds
    LKR("\u20a8"),              //  Sri Lanka, Rupees
    LRD("L\u0024"),             //  Liberia, Dollars
    LSL("L"),                   //  Lesotho, Maloti
    LTL("Lt"),                  //  Lithuania, Litai
    LVL("Ls"),                  //  Latvia, Lati
    LYD("\u0644.\u0631"),       //  Libya, Dinars
    MAD(".\u0631.\u0645"),      //  Morocco, Dirhams
    MDL("L"),                   //  Moldova, Lei
    MGA("MGA"),                 //  Madagascar, Ariary
    MKD("\u0434\u0435\u043d"),  //  Macedonia, Denars
    MMK("K"),                   //  Myanmar (Burma), Kyats
    MNT("\u20ae"),              //  Mongolia, Tugriks
    MOP("P"),                   //  Macau, Patacas
    MRO("UM"),                  //  Mauritania, Ouguiyas
    MTL("Lm"),                  //  Malta, Liri (expires 2008-Jan-31)
    MUR("\u20a8"),              //  Mauritius, Rupees
    MVR("\u0783."),             //  Maldives (Maldive Islands), Rufiyaa
    MWK("MK"),                  //  Malawi, Kwachas
    MXN("Mex\u0024"),           //  Mexico, Pesos
    MYR("RM"),                  //  Malaysia, Ringgits
    MZN("MTn"),                 //  Mozambique, Meticais
    NAD("N\u0024"),             //  Namibia, Dollars
    NGN("\u20a6"),              //  Nigeria, Nairas
    NIO("C\u0024"),             //  Nicaragua, Cordobas
    NOK("kr"),                  //  Norway, Krone
    NPR("\u20a8"),              //  Nepal, Nepal Rupees
    NZD("NZ\u0024"),            //  New Zealand, Dollars
    OMR(".\u0631.\u0639"),      //  Oman, Rials
    PAB("B/."),                 //  Panama, Balboa
    PEN("S/."),                 //  Peru, Nuevos Soles
    PGK("K"),                   //  Papua New Guinea, Kina
    PHP("Php"),                 //  Philippines, Pesos
    PKR("\u20a8"),              //  Pakistan, Rupees
    PLN("z\u0142"),             //  Poland, Zlotych
    PYG("\u20b2"),              //  Paraguay, Guarani
    QAR("\u0631.\u0642"),       //  Qatar, Rials
    RON("Lei"),                 //  Romania, New Lei
    RSD("PC\u0414"),            //  Serbia, Dinars
    RUB("\u0440\u0443\u0431"),  //  Russia, Rubles
    RWF("RF"),                  //  Rwanda, Rwanda Francs
    SAR("\u0631.\u0633"),       //  Saudi Arabia, Riyals
    SBD("Sl\u0024"),            //  Solomon Islands, Dollars
    SCR("\u20a8"),              //  Seychelles, Rupees
    SDG("\u00a3"),              //  Sudan, Pounds
    SEK("kr"),                  //  Sweden, Kronor
    SGD("S\u0024"),             //  Singapore, Dollars
    SHP("\u00a3"),              //  Saint Helena, Pounds
    SKK("Sk"),                  //  Slovakia, Koruny
    SLL("Le"),                  //  Sierra Leone, Leones
    SOS("So. Sh."),             //  Somalia, Shillings
    SPL(GENERIC.symbol),        //  Seborga, Luigini
    SRD("\u0024Sur"),           //  Suriname, Dollars
    STD("Db"),                  //  Sao Tome and Principe, Dobras
    SVC("\u20a1"),              //  El Salvador, Colones
    SYP("\u0644.\u0633"),       //  Syria, Pounds
    SZL("L"),                   //  Swaziland, Emalangeni
    THB("\u0e3f"),              //  Thailand, Baht
    TJS("SM"),                  //  Tajikistan, Somoni
    TMM("m"),                   //  Turkmenistan, Manats
    TND("\u062f.\u062a"),       //  Tunisia, Dinars
    TOP("T\u0024"),             //  Tonga, Pa'anga
    TRY("TL"),                  //  Turkey, New Lira
    TTD("TT\u0024"),            //  Trinidad and Tobago, Dollars
    TVD("TV\u0024"),            //  Tuvalu, Tuvalu Dollars
    TWD("NT\u0024"),            //  Taiwan, New Dollars
    TZS("TSh"),                 //  Tanzania, Shillings -- this currency used the symbol in the middle like 10/5, 10/= or -/5
    UAH("\u20b4"),              //  Ukraine, Hryvnia
    UGX("USh"),                 //  Uganda, Shillings
    USD("US\u0024"),            //  United States of America, Dollars
    UYU("\u0024U"),             //  Uruguay, Pesos
    UZS("sum"),                 //  Uzbekistan, Sums
    VEB("Bs."),                 //  Venezuela, Bolivares (expires 2008-Jun-30)
    VEF("Bs. F"),               //  Venezuela, Bolivares Fuertes
    VND("\u20ab"),              //  Viet Nam, Dong
    VUV("Vt"),                  //  Vanuatu, Vatu
    WST("WS\u0024"),            //  Samoa, Tala
    XAF("CFAF"),                //  Communaut Financiare Africaine BEAC, Francs
    XAG("Ag Oz"),               //  Silver, Ounces
    XAU("Au Oz"),               //  Gold, Ounces
    XCD("EC\u0024"),            //  East Caribbean Dollars
    XDR(GENERIC.symbol),        //  International Monetary Fund (IMF) Special Drawing Rights
    XOF("CFA"),                 //  Communaute Financiare Africaine BCEAO, Francs
    XPD("Pd Oz"),               //  Palladium Ounces
    XPF("CFPF"),                //  Comptoirs Francais du Pacifique Francs
    XPT("Pt Oz"),               //  Platinum, Ounces
    YER("\ufdfc"),              //  Yemen, Rials
    ZAR("R"),                   //  South Africa, Rand
    ZMK("ZK"),                  //  Zambia, Kwacha
    ZWD("Z\u0024");             //  Zimbabwe, Zimbabwe Dollars

    private final String symbol;

    Currency(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
