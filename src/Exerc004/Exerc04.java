package Exerc004;

import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer numberInt = sc.nextInt();
        Double numberDouble = sc.nextDouble();
        sc.nextLine();
        String phraseString = sc.nextLine();

        System.out.println("String: " + phraseString);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInt);

        sc.close();
    }
}
