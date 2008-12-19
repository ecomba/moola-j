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

    public Money substract(Money money) {
        return new Money(amount.subtract(money.amount));
    }

    public int compareTo(Object comparedMoney) {
        Money money = (Money) comparedMoney;
        return amount.compareTo(money.amount);
    }

    @Override public boolean equals(Object object) {
		if (!(object instanceof Money)) return false;
		Money other = (Money) object;
		return amount.equals(other.amount);
	}

    @Override public int hashCode() {
        return amount.hashCode(); 
    }

    public Money multiply(double denominator) {
        return new Money(amount() * denominator);
    }
}
