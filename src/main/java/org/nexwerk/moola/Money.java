package org.nexwerk.moola;

import java.math.BigInteger;

/**
 * @author Enrique Comba Riepenhausen
 */
public class Money {
    private final BigInteger amount;

    public Money(final double amount) {
        this.amount = BigInteger.valueOf(Math.round(amount * 100));
    }

    public Money(final long amountInPennies) {
        this.amount = BigInteger.valueOf(amountInPennies);
    }

    public Money(final BigInteger amount) {
        this.amount = amount;
    }

    public double amount() {
        return amount.doubleValue() / 100;
    }

    public Money add(final Money addedMoney) {
        return new Money(amount.add(addedMoney.amount));
    }
}
