package udemy.javacourse.com.aula703.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula703.entities.Student;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Student student = new Student();

    System.out.println("Enter Student data: ");
    System.out.print("Name: ");
    student.name = sc.nextLine();
    System.out.print("Enter student's first grade: ");
    student.firstGrade = sc.nextDouble();
    System.out.print("Enter student's second grade: ");
    student.secondGrade = sc.nextDouble();
    System.out.print("Enter student's third grade: ");
    student.thirdGrade = sc.nextDouble();

    System.out.println();
    System.out.println(student.name + ", Final Grade: " + student.finalGrade());
    student.finalStatement();

    sc.close();
  }
}
