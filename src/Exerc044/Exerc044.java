package Exerc045;

import java.util.Scanner;

public class Exerc045 {

    static String recearchPrimitiveType(String numberType) {

        String answer = "";

        try {
            var num = Long.parseLong(numberType);
            answer = numberType + " can be fitted in:\n ";
            if ((num <= Byte.MAX_VALUE) && (num >= Byte.MIN_VALUE)) {
                answer = answer.concat("* byte\n * short\n * int\n * long");
            } else if ((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)) {
                answer = answer.concat("* short\n * long");
            } else if ((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)) {
                answer = answer.concat("* int\n * long");
            } else {
                answer = answer.concat("* long");
            }

        } catch (NumberFormatException e) {
            answer = numberType + " can't be fitted anywhere";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            var n = sc.nextLine();
            System.out.println(recearchPrimitiveType(n));
        }

        sc.close();
    }
}
