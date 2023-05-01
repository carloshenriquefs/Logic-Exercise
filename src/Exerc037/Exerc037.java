package Exerc038;

import java.util.Locale;
import java.util.Scanner;

public class Exerc038 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var numberFirst = sc.nextDouble();
        var numberSecond = sc.nextDouble();

        if (numberFirst > 0 && numberSecond < 0) {
            System.out.println("Q4");
        } else if (numberFirst > 0 && numberSecond > 0) {
            System.out.println("Q1");
        } else if (numberFirst < 0 && numberSecond > 0) {
            System.out.println("Q2");
        } else if (numberFirst < 0 && numberSecond < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Origem");
        }

        sc.close();
    }

}
