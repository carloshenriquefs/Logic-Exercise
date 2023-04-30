package Exerc022;

import java.util.Scanner;

public class Exerc022 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtdNumerosNegativos = 0;

        System.out.print("Quantos números você vai digitar = ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL = ");
        for (int i = 0; i < n; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    qtdNumerosNegativos++;
                }
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE NUMEROS NEGATIVOS = " + qtdNumerosNegativos);

        sc.close();
    }
}
