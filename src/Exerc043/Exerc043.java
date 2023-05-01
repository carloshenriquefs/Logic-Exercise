package Exerc044;

import java.util.Scanner;

public class Exerc044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            var a = sc.nextInt();
            var b = sc.nextInt();
            var n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + b;

                if (j > 0) {
                    System.out.print(" ");
                }

                System.out.print(a);

                b *= 2;
            }
            System.out.print("\n");
        }


        sc.close();
    }
}
