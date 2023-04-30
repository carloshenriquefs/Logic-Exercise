package Exerc012;

import java.util.Locale;
import java.util.Scanner;

public class Exerc012 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double somaDasAlturas = 0.0;

        System.out.print("Quantas pessoas serão digitadas ? ");
        Integer numberPeople = sc.nextInt();
        Double menorDeIdade = 0.0;

        Person vector[] = new Person[numberPeople];

        for (int i = 0; i < numberPeople; i++) {
            System.out.println("Dados da " + i + "º pessoa: ");
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            Integer age = sc.nextInt();
            System.out.print("Altura: ");
            Double height = sc.nextDouble();
            vector[i] = new Person(name, age, height);
        }

        for (int i = 0; i < numberPeople; i++) {
            somaDasAlturas += vector[i].getHeight();
        }

        double media = somaDasAlturas / numberPeople;

        System.out.println();
        System.out.printf("Altura média: %.2f", media);
        System.out.println();

        for (int i = 0; i < numberPeople; i++) {
            menorDeIdade = ((double) vector[i].getAge() / numberPeople) * 100.0;
        }
        System.out.println("Pessoas com menos de 16 anos: " + menorDeIdade);

        for (int i = 0; i < numberPeople; i++) {
            if (vector[i].getAge() < 16) {
                System.out.println(vector[i].getName());

            }
        }

        sc.close();
    }
}
