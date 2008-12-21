package org.nexwerk.moola;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;

/**
 * @author Enrique Comba Riepenhausen
 */
public class MoneyTest {
    private static final double DELTA = 1e-8;
    private static final double TWO = 2.0;
    private static final int TWOHUNDRED = 200;

    @Test public void amount() {
        assertEquals("The amount should equal 2.0",
                TWO, new Money(TWO, Currency.GBP).amount(), DELTA);
    }

    @Test public void amountAsLong() {
        assertEquals("The amount should equal 200",
                TWOHUNDRED, new Money(TWOHUNDRED, Currency.GBP).amount(), DELTA);
    }

    @Test public void add() {
        assertEquals("The amount should equal 9.0",
                new Money(603.0, Currency.GBP),
                new Money(3.0, Currency.GBP).add(new Money(600, Currency.GBP)));
        assertEquals("The amount should equal 9.0",
                new Money(306.0, Currency.GBP),
                new Money(300, Currency.GBP).add(new Money(6.00, Currency.GBP)));
    }

    @Test(expected = AssertionError.class) public void addDifferentCurrencies() {
        assertEquals("The amount should equal 9.0",
                new Money(306.0, Currency.GBP),
                new Money(300, Currency.GBP).add(new Money(6.00, Currency.USD)));

    }

    @Test public void substract() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, Currency.GBP),
                new Money(TWO, Currency.GBP).substract(new Money(1.1, Currency.GBP)));
    }

    @Test(expected = AssertionError.class) public void substractingDifferentCurrencies() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, Currency.GBP),
                new Money(TWO, Currency.GBP).substract(new Money(1.1, Currency.EUR)));
    }

    @Test public void multiply() {
        assertEquals("The amount should equal 4.0",
                new Money(4.0, Currency.GBP),
                new Money(TWO, Currency.GBP).multiply(TWO));
        assertEquals("The amount should equal 36",
                new Money(36, Currency.GBP),
                new Money(4.5, Currency.GBP).multiply(8));
    }

    @Test public void divide() {
        Money[] division = new Money(36, Currency.GBP).divide(8);
        for (Money money : division) {
            assertEquals("The amount should equal 4.5", new Money(4.5, Currency.GBP), money);
        }
    }

    @Test public void divideFurther() {
        Money[] division = new Money(1, Currency.GBP).divide(3);
        
        assertEquals("The amount should equal 0.4", new Money(0.34, Currency.GBP), division[0]);
        assertEquals("The amount should equal 0.4", new Money(0.33, Currency.GBP), division[1]);
        assertEquals("The amount should equal 0.4", new Money(0.33, Currency.GBP), division[2]);

    }

    @Test public void equality() {
        assertEquals("The money objects should be equal",
                new Money(1, Currency.EUR), new Money(1, Currency.EUR));
        assertEquals("The hashcodes should be the same",
                new Money(1, Currency.EUR).hashCode(), new Money(1, Currency.EUR).hashCode());
        assertFalse("The two objects should not equal",
                new Money(1,Currency.EUR).equals(Currency.EUR));
    }

    @Test public void toStringImplementation() {
        assertEquals("The system should display £2.3", "£2.32",
                new Money(2.32, Currency.GBP).toString());
        assertEquals("The system should display Û10", "Û10.0",
                new Money(10.00, Currency.EUR).toString());
    }
}
