package Exerc030;

import java.util.Scanner;

public class Exerc030 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fatorial = 1;

        Integer n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
    }
}
