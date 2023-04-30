package Exerc015;

import java.util.Scanner;

public class Exerc015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer soma = 0, numerosPares = 0;
        Double mediaPares;

        System.out.print("Quantos elementos vai ter o vetor ? ");
        Integer n = sc.nextInt();

        Integer vector[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                soma += vector[i];
                numerosPares++;
            }
        }

        if (numerosPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = (double) soma / numerosPares;

            System.out.println("MEDIA DOS PARES = " + mediaPares);
        }

        sc.close();
    }
}
