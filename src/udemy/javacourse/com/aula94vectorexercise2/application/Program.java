package udemy.javacourse.com.aula94vectorexercise2.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula94vectorexercise2.entities.Student;

public class Program {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] rooms = new int[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        sc.next();
        for (int i = 0; i < students.length; i++) {
            System.out.printf("Rent #" + (i + 1));
            System.out.println();
            System.out.println("Enter student Name:");
            String studentName = sc.next();
            System.out.println("Enter student Name:");
            String studentEmail = sc.next();
            System.out.println("Wich room the student wants to rent?");
            int roomToBeRented = sc.nextInt();
        }


        sc.close();
    }
}
