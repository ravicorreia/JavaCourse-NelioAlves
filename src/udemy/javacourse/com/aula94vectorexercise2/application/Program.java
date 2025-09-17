package udemy.javacourse.com.aula94vectorexercise2.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula94vectorexercise2.entities.Rent;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rent[] vect = new Rent[10];

    System.out.println("How many rooms will be rented?");
    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
      System.out.println("Rent #" + i + ":");
      System.out.print("Enter student Name:");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Email: ");
      String email = sc.nextLine();
      System.out.print("Room: ");
      int roomNumber = sc.nextInt();
      vect[roomNumber] = new Rent(name, email);

    }

    sc.close();
  }
}
