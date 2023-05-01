package Exerc034;

import java.util.Scanner;

public class Exerc034 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        if (number >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
