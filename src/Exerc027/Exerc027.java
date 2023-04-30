package Exerc028;

import java.util.Locale;
import java.util.Scanner;

public class Exerc028 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Double numberFirst = sc.nextDouble();
            Double numberSecond = sc.nextDouble();
            Double numberThird = sc.nextDouble();

            Double average = (numberFirst * 2.0 + numberSecond * 3.0 + numberThird * 5.0) / 10;

            System.out.print(String.format("%.1f", average));
        }


        sc.close();
    }
}
