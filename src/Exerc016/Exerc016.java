package Exerc017;

import java.util.Locale;
import java.util.Scanner;

public class Exerc017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados ? ");
        int n = sc.nextInt();

        Person vector[] = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno: ");
            sc.nextLine();
            String name = sc.nextLine();
            Double firstNote = sc.nextDouble();
            Double secondNote = sc.nextDouble();
            vector[i] = new Person(name, firstNote, secondNote);
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            Double media = (vector[i].getFirstNote() + vector[i].getSecondNote()) / 2;

            if (media >= 6) {
                System.out.printf("%s\n", vector[i].getName());
            }
        }

        sc.close();
    }
}
