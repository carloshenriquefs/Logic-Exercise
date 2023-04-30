package Exerc011;

import java.util.Locale;
import java.util.Scanner;

public class Exerc11 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar ? ");
        int number = sc.nextInt();

        Double vector[] = new Double[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < number; i++) {
            System.out.print(vector[i] + "  ");
        }

        Double soma = 0.0;
        for (int i = 0; i < number; i++) {
            soma += vector[i];
        }

        Double media = soma / number;

        System.out.println();
        System.out.print("SOMA = " + soma);
        System.out.println();
        System.out.print("MEDIA = " + media);

        sc.close();
    }
}
