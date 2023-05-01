package Exerc048;

import java.util.Scanner;

public class Exerc048 {

    public static class ExitException extends SecurityException {
        private static final Long serialVersionUID = 1L;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            var number = sc.nextInt();
            String input = Integer.toString(number);

            if (number == Integer.parseInt(input)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer");
            }
        } catch (ExitException e) {
            System.out.println("Unsuccessful Terminal");
        }

        sc.close();
    }
}
