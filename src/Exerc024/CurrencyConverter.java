package Exerc025;

public class CurrencyConverter {
    private static final Double IOF = 0.06;

    public static final Double totalDollarPaid(Double priceDollar, Double dollarBought) {
        return (priceDollar * dollarBought) + (priceDollar * (dollarBought * IOF));
    }
}
