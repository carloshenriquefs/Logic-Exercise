package Exerc047;

import java.util.Scanner;

public class Exerc047 {

    private static Integer B;
    private static Integer H;
    private static Boolean value = true;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0) {
            value = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        sc.close();
    }

    public static void main(String[] args) {

        if (value) {
            var area = B * H;
            System.out.println(area);
        }
    }
}
