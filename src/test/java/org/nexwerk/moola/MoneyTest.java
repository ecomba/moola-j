package org.nexwerk.moola;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Enrique Comba Riepenhausen
 */
public class MoneyTest {
    private static final double DELTA = 1e-8;

    @Test public void amount() {
        assertEquals("The amount should equal 2.0", 2.0, new Money(2.0).amount(), DELTA);
    }

    @Test public void amountInPennies() {
        assertEquals("The amount should equal 2.0", 2.0, new Money(200).amount(), DELTA);
    }

    @Test public void add() {
        assertEquals("The amount should equal 9.0", 9.0,
                new Money(3.0).add(new Money(600)).amount(), DELTA);
        assertEquals("The amount should equal 9.0", 9.0,
                new Money(300).add(new Money(6.00)).amount(), DELTA);
    }
}
