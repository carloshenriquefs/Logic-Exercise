package Exerc027;

import java.util.Scanner;

public class Exerc027 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numberIn = 0;
        Integer numberOut = 0;

        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer numberInteger = sc.nextInt();

            if (numberInteger >= 10 && numberInteger <= 20) {
                numberIn++;
            } else {
                numberOut++;
            }
        }

        System.out.println();
        System.out.println(numberIn + " in");
        System.out.println(numberOut + " out");

        sc.close();
    }
}
