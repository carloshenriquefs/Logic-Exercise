package Exerc013;

import java.util.Scanner;

public class Exerc013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor ? ");
        Integer n = sc.nextInt();

        Integer vectorA[] = new Integer[n];
        Integer vectorB[] = new Integer[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int a = 0; a < n; a++) {
            vectorA[a] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int b = 0; b < n; b++) {
            vectorB[b] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int c = 0; c < n; c++) {
            Integer somaVectores = vectorA[c] + vectorB[c];
            System.out.println(somaVectores);
        }

        sc.close();
    }
}
