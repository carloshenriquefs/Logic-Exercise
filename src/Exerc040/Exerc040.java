package Exerc041;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc041 {

    public static int compareEmployee(Employee emp1, Employee emp2) {
        return emp1.getEmail().compareTo(emp2.getEmail());
    }

    //list.sort((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmpl = new ArrayList<Employee>();

        var n = sc.nextInt();

        for (int i = 0; i < n; n++) {
            System.out.println("Nome: ");
            var nome = sc.next();
            System.out.println("Email: ");
            var email = sc.next();
            System.out.println("Salario: ");
            var salario = sc.nextDouble();

            Employee emp = new Employee(nome, email, salario);

            listEmpl.add(emp);
        }

        sc.close();
    }
}
