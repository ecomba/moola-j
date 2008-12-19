package org.nexwerk.moola;

import java.math.BigInteger;

/**
 * @author Enrique Comba Riepenhausen
 */
public class Money {
    private final BigInteger amount;
    private final Currency currency;

    public enum Currency { GBP, USD, EUR }

    public Money(final double amount, final Currency currency) {
        this.amount = BigInteger.valueOf(Math.round(amount * 100));
        this.currency = currency;
    }

    public Money(final long amount, final Currency currency) {
        this.amount = BigInteger.valueOf(amount * 100);
        this.currency = currency;
    }

    private Money(final BigInteger amount, final Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double amount() {
        return amount.doubleValue() / 100;
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

        return result;
    }

    void assertSameCurrencyAs(Money money) {
		if (!currency.equals(money.currency))
            throw new AssertionError("Currency mismatch");
	}

    @Override public boolean equals(final Object object) {
        return object instanceof Money && amount.equals(((Money) object).amount);
    }

    @Override public int hashCode() {
        return amount.hashCode();
    }
}
