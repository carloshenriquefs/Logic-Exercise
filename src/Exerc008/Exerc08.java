package Exerc008;

import java.util.Locale;
import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double vector[] = new double[n];

        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vector[i];
        }

        double media = soma / n;

        System.out.printf("AVERAGE HEIGHT = %.2f", media);

        sc.close();
    }
}
