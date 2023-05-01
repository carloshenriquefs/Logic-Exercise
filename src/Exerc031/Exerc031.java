package Exerc032;

import java.util.Scanner;

public class Exerc032 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
