 package org.nexwerk.moola;

import java.math.BigInteger;

/**
 * The money class represents the arithmetic that can be done when dealing with
 * money.
 *
 * The money object is immutable.
 *
 * TODO: Division is still a bit slow and it's possible that we need to change 
 * the way currencies get printed due to the way they are used in the world.
 * Some symbols appear on the right hand side while other on the left,
 * and some others even appear in the middle.
 *
 * The factor associated with the currencies also changes some don't have a
 * decimal part while others have it in the 1000s, others 100s, and others 10s. 
 * 
 * @author Enrique Comba Riepenhausen
 * @author Nuno Marques
 */
public class Money {
    private final BigInteger amount;
    private final Currency currency;
    private final int FACTOR = 100;

    public Money(final double amount, final Currency currency) {
        this.amount = BigInteger.valueOf(Math.round(amount * FACTOR));
        this.currency = currency;
    }

    public Money(final long amount, final Currency currency) {
        this.amount = BigInteger.valueOf(amount * FACTOR);
        this.currency = currency;
    }

    private Money(final BigInteger amount, final Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double amount() {
        return amount.doubleValue() / FACTOR;
    }

    public Money add(final Money addedMoney) {
        assertSameCurrencyAs(addedMoney);
        return new Money(amount.add(addedMoney.amount), currency);
    }

    public Money substract(final Money money) {
        assertSameCurrencyAs(money);
        return new Money(amount.subtract(money.amount), currency);
    }

    public Money multiply(final double denominator) {
        return new Money(amount() * denominator, currency);
    }

    public Money[] divide(final int denominator) {
        BigInteger bigDenominator = BigInteger.valueOf(denominator);
        Money[] result = new Money[denominator];

        BigInteger simpleResult = amount.divide(bigDenominator);

        for (int i = 0; i < denominator; i++) {
            result[i] = new Money(simpleResult, currency);
        }

        int remainder = amount.subtract(simpleResult.multiply(bigDenominator)).intValue();
		for (int i = 0; i < remainder; i++) {
			result[i] = result[i].add(new Money(BigInteger.valueOf(1), currency));
		}

        return result;
    }

    private void assertSameCurrencyAs(final Money money) {
		if (!currency.equals(money.currency)) {
            throw new IllegalArgumentException("Currency mismatch");
        }
	}

    @Override public String toString() {
        return currency.getSymbol() + amount();
    }

    @Override public boolean equals(final Object object) {
        return object instanceof Money && amount.equals(((Money) object).amount);
    }

    @Override public int hashCode() {
        return amount.hashCode();
    }
}
