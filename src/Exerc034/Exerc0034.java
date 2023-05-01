package Exerc035;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc0035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> impar = new ArrayList<>();
        List<Integer> par = new ArrayList<>();
        List<Integer> valores = new ArrayList<>();

        var number = sc.nextInt();

        valores.add(number);

        valores.forEach((v) -> {
            if (v % 2 == 0) {
                par.add(v);
                System.out.println("O número: " + par + " é PAR!!!");
            } else {
                impar.add(v);
                System.out.println("O número: " + impar + " é IMPAR!!!");
            }
        });

        sc.close();
    }
}
