package Exerc037;

import java.util.Locale;
import java.util.Scanner;

public class Exerc037 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var numberDecimal = sc.nextDouble();

        if (numberDecimal < 0 || numberDecimal > 100) {
            System.out.println("Fora do intervalo");
        } else if (numberDecimal >= 0 && numberDecimal <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numberDecimal <= 50) {
            System.out.println("Intervalo (25, 50]");
        } else if (numberDecimal <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}
