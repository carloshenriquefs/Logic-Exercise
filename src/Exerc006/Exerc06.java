package Exerc006;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numberOne = 1;
        while(sc.hasNext()){
            System.out.println(numberOne + " " + sc.nextLine());
            numberOne++;
        }

        sc.close();
    }
}
