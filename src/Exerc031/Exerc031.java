package Exerc031;

import java.util.Scanner;

public class Exerc031 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            Integer primeiraLinha = i;
            Integer segundaLinha = i * i;
            Integer terceiraLinha = i * i * i;

            System.out.printf("%d %d %d%n", primeiraLinha, segundaLinha, terceiraLinha);
        }

        sc.close();
    }
}
