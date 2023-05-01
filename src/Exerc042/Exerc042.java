package Exerc043;

import java.util.Scanner;

public class Exerc043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            var result = n * i;

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
