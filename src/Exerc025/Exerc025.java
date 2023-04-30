package Exerc026;

import java.util.Scanner;

public class Exerc026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
