package org.nexwerk.moola;

import java.util.Map;
import java.util.HashMap;

/**
 * @author Enrique Comba Riepenhausen
*/
public enum Currency { GBP, USD, EUR;

    private static final Map<Currency, String> symbols = 
            new HashMap<Currency, String>(){{
        put(Currency.GBP, "£");
        put(Currency.USD, "$");
        put(Currency.EUR, "Û");
    }};

    public String getSymbol() {
        return symbols.get(this);
    }
}
