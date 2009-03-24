package org.nexwerk.moola;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.nexwerk.moola.Currency.*;
import static junit.framework.Assert.assertFalse;

/**
 *
 * This test class is testing the currency enum as well, move them to a new place.
 *
 * @author Enrique Comba Riepenhausen
 * @author Nuno Marques
 */
public class MoneyTest {
    private static final double DELTA = 1e-8;
    private static final double TWO = 2.0;
    private static final int TWO_HUNDRED = 200;

    @Test public void amount() {
        assertEquals("The amount should equal 2.0", TWO, new Money(TWO, GBP).amount(), DELTA);
    }

    @Test public void amountAsLong() {
        assertEquals("The amount should equal 200", TWO_HUNDRED, new Money(TWO_HUNDRED, GBP).amount(), DELTA);
    }

    @Test public void
    shouldProvideTheCurrencyWhenQueried() {
        assertEquals("the currency should have been GBP", GBP, new Money(TWO, GBP).currency());
    }

    @Test public void add() {
        assertEquals("The amount should equal 9.0",
                new Money(603.0, GBP),
                new Money(3.0, GBP).add(new Money(600, GBP)));
        assertEquals("The amount should equal 9.0",
                new Money(306.0, GBP),
                new Money(300, GBP).add(new Money(6.00, GBP)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addDifferentCurrencies() {
        assertEquals("The amount should equal 9.0",
                new Money(306.0, GBP),
                new Money(300, GBP).add(new Money(6.00, USD)));

    }

    @Test public void substract() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, GBP),
                new Money(TWO, GBP).substract(new Money(1.1, GBP)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void substractingDifferentCurrencies() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, GBP),
                new Money(TWO, GBP).substract(new Money(1.1, EUR)));
    }

    @Test public void multiply() {
        assertEquals("The amount should equal 4.0",
                new Money(4.0, GBP),
                new Money(TWO, GBP).multiply(TWO));
        assertEquals("The amount should equal 36",
                new Money(36, GBP),
                new Money(4.5, GBP).multiply(8));
    }

    @Test public void divide() {
        Money[] division = new Money(36, GBP).divide(8);
        for (Money money : division) {
            assertEquals("The amount should equal 4.5", new Money(4.5, GBP), money);
        }
    }

    @Test public void divideFurther() {
        Money[] division = new Money(1, GBP).divide(3);

        assertEquals("The amount should equal 0.4", new Money(0.34, GBP), division[0]);
        assertEquals("The amount should equal 0.4", new Money(0.33, GBP), division[1]);
        assertEquals("The amount should equal 0.4", new Money(0.33, GBP), division[2]);

    }

    @Test public void equality() {
        assertEquals("The money objects should be equal", new Money(1, EUR), new Money(1, EUR));
        assertEquals("The hashcodes should be the same", new Money(1, EUR).hashCode(),
                new Money(1, EUR).hashCode());
        assertFalse("The two objects should not equal", new Money(1, EUR).equals(new Money(2, EUR)));
    }

    @Test public void toStringGeneric() {
        assertEquals("The system should display \u00a45.0", "\u00a45.0", new Money(5, GENERIC).toString());
    }

    @Test public void toStringUsdollar() {
        assertEquals("The system should display US\u00242.3", "US\u00242.32", new Money(2.32, USD).toString());
    }

    @Test public void toStringPound() {
        assertEquals("The system should display \u00a32.3", "\u00a32.32", new Money(2.32, GBP).toString());
    }

    @Test public void toStringEuro() {
        assertEquals("The system should display \u20ac10", "\u20ac10.0", new Money(10.00, EUR).toString());
    }

    @Test public void toStringYen() {
        assertEquals("The system should display \u00a512", "\u00a512.0", new Money(12, JPY).toString());
    }

    @Test public void getTheNameInstead() {
        assertEquals("The symbol should display NGN", "NGN", NGN.name());
    }

    @Test(timeout = 1000) public void testAddingFiveMillionNumbers() {
        Money oneDollar = new Money(1, USD);
        Money anotherDollar = new Money(1, USD);
        for (int i= 0 ; i< 5000000; i++) {
            oneDollar = oneDollar.add(anotherDollar);
        }
    }

    @Test(timeout = 4000) public void testDividingTenThousandNumbers() {
        Money oneDollar = new Money(1, USD);
        for (int i= 1 ; i< 10000; i++) {
            oneDollar.divide(i);
        }
    }
}
