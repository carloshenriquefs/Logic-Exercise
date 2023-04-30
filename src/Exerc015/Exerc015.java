package Exerc016;

import java.util.Scanner;

public class Exerc016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer n, maiorIdade = 0, posicaoMaior = 0;

        System.out.print("Quantas pessoas você vai digitar ? ");
        n = sc.nextInt();

        Person vector[] = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa: ");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            Integer age = sc.nextInt();
            vector[i] = new Person(name, age);
        }

        maiorIdade = vector[0].getAge();

        for (int i = 0; i < n; i++) {
            if (vector[i].getAge() > maiorIdade) {
                maiorIdade = vector[i].getAge();
                posicaoMaior = i;
            }
        }

        System.out.println();
        System.out.println("PESSOA MAIS VELHA: " + vector[posicaoMaior].getName());

        sc.close();
    }
}
