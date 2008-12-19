package org.nexwerk.moola;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Enrique Comba Riepenhausen
 */
public class MoneyTest {
    private static final double DELTA = 1e-8;

    @Test public void amount() {
        assertEquals("The amount should equal 2.0",
                2.0, new Money(2.0).amount(), DELTA);
    }

    @Test public void amountAsLong() {
        assertEquals("The amount should equal 200",
                200, new Money(200).amount(), DELTA);
    }

    @Test public void add() {
        assertEquals("The amount should equal 9.0",
                new Money(603.0) ,new Money(3.0).add(new Money(600)));
        assertEquals("The amount should equal 9.0",
                new Money(306.0), new Money(300).add(new Money(6.00)));
    }

    @Test public void substract() {
        assertEquals("THe amount should equal 0.9",
                new Money(0.9), new Money(2.0).substract(new Money(1.1)));
    }

    @Test public void multiply() {
        assertEquals("The amount should equal 4.0",
                new Money(4.0), new Money(2.0).multiply(2.0));
        assertEquals("The amount should equal 36",
                new Money(36), new Money(4.5).multiply(8));
    }
}
