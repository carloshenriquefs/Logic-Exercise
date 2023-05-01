package Exerc035;

import java.util.Scanner;

public class Exerc035 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
