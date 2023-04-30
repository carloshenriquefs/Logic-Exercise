package Exerc018;

import java.util.Locale;
import java.util.Scanner;

public class Exerc018 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer maiorAltura = 0;
        Integer menorAltura = 0;

        System.out.print("Quantas pessoas serão digitadas ? ");
        Integer n = sc.nextInt();

        Double altura[] = new Double[n];
        String genero[] = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "º pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "º pessoa: ");
            genero[i] = sc.next();
        }

        Double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += altura[i];
        }


        for(int i = 0; i < n; i++) {
            Double media = soma / n;
            if(genero[i].toUpperCase().equals("M")) {

            }
        }

        System.out.println("Media das alturas das mulheres");

        for (int i = 0; i < n; i++) {
            if (genero[i].equals("M"))
                System.out.println("Numero de homens = " + genero[i]);
        }


        sc.close();
    }
}
