package udemy.javacourse.com.aula89vectors.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // read a number N and the height of N students. Store these heights in a vector.
        // Show the height of each student and the average height.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("How many students will you enter? ");
        int n = sc.nextInt();
        System.out.println();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter the height of student " + (i + 1) + ": ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }
        
        System.out.println();
        System.out.printf("The sum of the students height is: %.2f%n", sum);
        System.out.println();
        System.out.printf("The average height is: %.2f%n", (sum / n));
    


        sc.close();
    }
}
