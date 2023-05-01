package Exerc050;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exerc050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var amount = sc.nextDouble();

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(amount);

        NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(amount);

        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(amount);

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(amount);

        System.out.println("EUA: " + us);
        System.out.println("Índia: " + india);
        System.out.println("China: " + china);
        System.out.println("França: " + france);

        sc.close();
    }
}
