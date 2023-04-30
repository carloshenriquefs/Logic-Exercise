package Exerc024;

import java.util.Locale;
import java.util.Scanner;

public class Exerc024 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        Integer quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int addProducts = sc.nextInt();
        product.addQuantity(addProducts);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        int removeProducts = sc.nextInt();
        product.removeQuantity(removeProducts);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
