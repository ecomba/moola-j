package org.nexwerk.moola;

import java.math.BigInteger;

/**
 * @author Enrique Comba Riepenhausen
 */
public class Money implements Comparable {
    private final BigInteger amount;

    public Money(final double amount) {
        this.amount = BigInteger.valueOf(Math.round(amount * 100));
    }

    public Money(final long amount) {
        this.amount = BigInteger.valueOf(amount * 100);
    }

    private Money(final BigInteger amount) {
        this.amount = amount;
    }

    public double amount() {
        return amount.doubleValue() / 100;
    }

    public Money add(final Money addedMoney) {
        return new Money(amount.add(addedMoney.amount));
    }

    public Money substract(final Money money) {
        return new Money(amount.subtract(money.amount));
    }

    public Money multiply(final double denominator) {
        return new Money(amount() * denominator);
    }

    public Money[] divide(final int denominator) {
        BigInteger bigDenominator = BigInteger.valueOf(denominator);
        Money[] result = new Money[denominator];

        BigInteger simpleResult = amount.divide(bigDenominator);

        for (int i = 0; i < denominator; i++) {
            result[i] = new Money(simpleResult);
        }

        return result;
    }

    public int compareTo(final Object comparedMoney) {
        Money money = (Money) comparedMoney;
        return amount.compareTo(money.amount);
    }

    @Override public boolean equals(final Object object) {
        return object instanceof Money && amount.equals(((Money) object).amount);
    }

    @Override public int hashCode() {
        return amount.hashCode();
    }
}
