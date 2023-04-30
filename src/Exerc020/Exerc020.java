package Exerc021;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exerc021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered ? ");
        Integer n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Long id = sc.nextLong();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idIncrease = sc.nextInt();
        Integer pos = position(list, idIncrease);


        if (pos == null) {
            System.out.print("This id does not exist!!!");
        } else {
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
