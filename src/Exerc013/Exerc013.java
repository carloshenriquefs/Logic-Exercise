package Exerc014;

import java.util.Locale;
import java.util.Scanner;

public class Exerc014 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double media, soma;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        Double vector[] = new Double[n];

        System.out.print("Digite um número: ");
        for (int i = 0; i < n; i++) {
            vector[i] = sc.nextDouble();
        }

        soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vector[i];
        }

        media = soma / n;

        System.out.printf("MEDIA DO VETOR =  %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++) {
            if (media > vector[i]) {
                System.out.println(vector[i]);
            }
        }

        sc.close();
    }
}
