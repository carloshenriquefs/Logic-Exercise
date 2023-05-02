package Exerc060;

import java.util.Scanner;

public class Exerc060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split("[^a-zA-Z]+");

        System.out.println(words.length);
        for (String a : words) {
            System.out.println(a);
        }

        sc.close();
    }
}
