package Exerc029;

import java.util.Scanner;

public class Exerc029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        System.out.println();

        Double vectorA[] = new Double[n];
        Double vectorB[] = new Double[n];

        for (int i = 0; i < n; i++) {
            vectorA[i] = sc.nextDouble();
            vectorB[i] = sc.nextDouble();

            if (vectorB[i] == 0) {
                System.out.println("divisão impossivel");
            } else {
                Double divisao = vectorA[i] / vectorB[i];
                System.out.println(String.format("%.2f", divisao));
            }
        }

        sc.close();
    }
}
