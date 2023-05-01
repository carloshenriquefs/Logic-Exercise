package Exerc053;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
}

public class Exerc053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCalculator my_calculator = new MyCalculator();

        System.out.println("I implemented: ");
        ImplementedInterfacesNames(my_calculator);
        int n = sc.nextInt();
        System.out.println(my_calculator.divisor_sum(n) + "\n");

        sc.close();
    }

    static void ImplementedInterfacesNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();

        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
