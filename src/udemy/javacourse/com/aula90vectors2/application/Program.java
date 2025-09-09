package udemy.javacourse.com.aula90vectors2.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula90vectors2.entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("How many products will you enter? ");
        int n = sc.nextInt();
        System.out.println();
        
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter the name of the product: ");
            String name = sc.next();
            System.out.println("Enter the price of the product: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);

        }

        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.println("The average price of the products is: ");

        System.out.printf("Average price = %.2f%n", avg);



        sc.close();
    }
}
