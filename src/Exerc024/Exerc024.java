package Exerc025;

import java.util.Locale;
import java.util.Scanner;

public class Exerc025 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price ? ");
        Double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought ? ");
        Double dollarBought = sc.nextDouble();

        var total = CurrencyConverter.totalDollarPaid(dollarPrice, dollarBought);
        System.out.println("Amount to be paid in reais = " + String.format("%.2f", total));

        sc.close();
    }
}
