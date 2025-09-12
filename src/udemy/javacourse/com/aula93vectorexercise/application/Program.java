package udemy.javacourse.com.aula93vectorexercise.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula93vectorexercise.entities.Persons;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("How many people will be registered? ");
        int n = sc.nextInt();
        System.out.println();
        
        Persons[] vect = new Persons[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter the data of the " + (i + 1) + " person: ");
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Age: ");
            int age = sc.nextInt();
            System.out.println("Height: ");
            double height = sc.nextDouble();
            System.out.println();

            vect[i] = new Persons(name, age, height);

        }

        double sumHeight = 0.0;

        for (int i = 0; i < vect.length; i++) {
            sumHeight += vect[i].getHeight();
        }
        double avgHeight = sumHeight / vect.length;

        System.out.println("The average height of the people is: ");

        System.out.printf("Average price = %.2f%n", avgHeight);
        System.out.println();

        
        double lessThan16 = 0.0;
        
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                lessThan16++;
                
                System.out.println(vect[i].getName() + " - " + vect[i].getAge());
            }
        }
        double lessThan16AgePercent = lessThan16 * 100 / vect.length;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", lessThan16AgePercent);


        sc.close();
    }
}
