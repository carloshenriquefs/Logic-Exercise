package Exerc019;

import java.util.Scanner;

public class Exerc019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer qtdPares = 0;

        System.out.print("Quantos números você vai digitar ? ");
        Integer n = sc.nextInt();

        Integer vector[] = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                System.out.print(" " + vector[i]);
                qtdPares++;
            }

        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
}
