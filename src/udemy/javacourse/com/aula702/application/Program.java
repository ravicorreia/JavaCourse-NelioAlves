package udemy.javacourse.com.aula702.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula702.entities.Employee;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee emp = new Employee();

    System.out.println("Enter employee data:");
    System.out.print("Name: ");
    emp.name = sc.nextLine();
    System.out.print("Gross salary: ");
    emp.grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    emp.tax = sc.nextDouble();

    System.out.println();
    System.out.println("Employee: " + emp.name + ", $ " + String.format("%.2f", emp.netSalary()));

    System.out.println();
    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    emp.increaseSalary(percentage);

    System.out.println();
    System.out.println("Updated data: " + emp.name + ", $ " + String.format("%.2f", emp.netSalary()));


    sc.close();
  }
}