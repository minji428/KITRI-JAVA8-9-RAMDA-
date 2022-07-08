package kr.re.kitri.stream.transaction;

import java.util.Arrays;
import java.util.List;

public class Transaction {
    private Currency currency;
    private double value;

    public Transaction() {}

    public Transaction(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "currency=" + currency +
                ", value=" + value +
                '}';
    }

    public static List<Transaction> getTransaction() {
        return Arrays.asList(
                new Transaction(Currency.EUR, 1500.0),
                new Transaction(Currency.USD, 2300.0),
                new Transaction(Currency.GBP, 9900.0),
                new Transaction(Currency.EUR, 1100.0),
                new Transaction(Currency.JPY, 7800.0),
                new Transaction(Currency.CHF, 6700.0),
                new Transaction(Currency.EUR, 5600.0),
                new Transaction(Currency.USD, 4500.0),
                new Transaction(Currency.CHF, 3400.0),
                new Transaction(Currency.GBP, 3200.0),
                new Transaction(Currency.USD, 4600.0),
                new Transaction(Currency.JPY, 5700.0),
                new Transaction(Currency.EUR, 6800.0)
        );
    }
}

enum Currency {
    EUR, USD, GBP, JPY, CHF
}
