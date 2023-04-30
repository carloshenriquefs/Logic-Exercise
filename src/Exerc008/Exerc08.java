package Exerc009;

import java.util.Locale;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto vector[] = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.next();
            Double preco = sc.nextDouble();
            vector[i] = new Produto(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vector[i].getPreco();
        }

        double media = soma / n;

        System.out.println();
        System.out.printf("AVERAGE PRICE = %.2f", media);

        sc.close();
    }
}
