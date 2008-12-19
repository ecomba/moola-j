package org.nexwerk.moola;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Enrique Comba Riepenhausen
 */
public class MoneyTest {
    private static final double DELTA = 1e-8;
    private static final double TWO = 2.0;
    private static final int TWOHUNDRED = 200;

    @Test public void amount() {
        assertEquals("The amount should equal 2.0",
                TWO, new Money(TWO, Money.Currency.GBP).amount(), DELTA);
    }

    @Test public void amountAsLong() {
        assertEquals("The amount should equal 200",
                TWOHUNDRED, new Money(TWOHUNDRED, Money.Currency.GBP).amount(), DELTA);
    }

    @Test public void add() {
        assertEquals("The amount should equal 9.0",
                new Money(603.0, Money.Currency.GBP),
                new Money(3.0, Money.Currency.GBP).add(new Money(600, Money.Currency.GBP)));
        assertEquals("The amount should equal 9.0",
                new Money(306.0, Money.Currency.GBP),
                new Money(300, Money.Currency.GBP).add(new Money(6.00, Money.Currency.GBP)));
    }

    @Test(expected = AssertionError.class) public void addDifferentCurrencies() {
        assertEquals("The amount should equal 9.0",
                new Money(306.0, Money.Currency.GBP),
                new Money(300, Money.Currency.GBP).add(new Money(6.00, Money.Currency.USD)));

    }

    @Test public void substract() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, Money.Currency.GBP),
                new Money(TWO, Money.Currency.GBP).substract(new Money(1.1, Money.Currency.GBP)));
    }

    @Test(expected = AssertionError.class) public void substractingDifferentCurrencies() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9, Money.Currency.GBP),
                new Money(TWO, Money.Currency.GBP).substract(new Money(1.1, Money.Currency.EUR)));
    }

    @Test public void multiply() {
        assertEquals("The amount should equal 4.0",
                new Money(4.0, Money.Currency.GBP),
                new Money(TWO, Money.Currency.GBP).multiply(TWO));
        assertEquals("The amount should equal 36",
                new Money(36, Money.Currency.GBP),
                new Money(4.5, Money.Currency.GBP).multiply(8));
    }

    @Test public void divide() {
        Money[] division = new Money(36, Money.Currency.GBP).divide(8);
        for (Money money : division) {
            assertEquals("The amount should equal 4.5", new Money(4.5, Money.Currency.GBP), money);
        }
    }

    @Test public void divideFurther() {
        Money[] division = new Money(1, Money.Currency.GBP).divide(3);
        
        assertEquals("The amount should equal 0.4", new Money(0.34, Money.Currency.GBP), division[0]);
        assertEquals("The amount should equal 0.4", new Money(0.33, Money.Currency.GBP), division[1]);
        assertEquals("The amount should equal 0.4", new Money(0.33, Money.Currency.GBP), division[2]);

    }
}
