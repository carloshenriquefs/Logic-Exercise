package Exerc042;

import java.util.Scanner;

public class Exerc042 {

    private static final String LINHATRACEJADA = "=============================";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(LINHATRACEJADA);
        for (int i = 0; i < 3; i++) {
            var linguagem = sc.next();
            var number = sc.nextInt();
            System.out.printf("%-15s%03d\n", linguagem, number);
        }

        System.out.println(LINHATRACEJADA);

        sc.close();
    }
}
