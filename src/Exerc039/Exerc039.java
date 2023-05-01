package Exerc040;

import java.util.Scanner;

public class Exerc040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var numberOne = sc.nextInt();
        var numberSecond = sc.nextInt();

        if (numberOne % numberSecond == 0 || numberSecond % numberOne == 0) {
            System.out.println("São Multiplos");
        } else {
            System.out.println("Não são Multiplos");
        }

        sc.close();
    }
}
