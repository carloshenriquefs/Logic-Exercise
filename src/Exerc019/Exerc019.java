package Exerc020;

import java.util.Locale;
import java.util.Scanner;

public class Exerc020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer posicaoMaior = 0;
        Double maior;

        System.out.print("Quantos números você vai digitar ? ");
        Integer n = sc.nextInt();

        Double vetor[] = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        maior = vetor[0];

        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        sc.close();
    }
}
