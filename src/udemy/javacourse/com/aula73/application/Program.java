package udemy.javacourse.com.aula73.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula73.util.CurrencyConverter;

public class Program {
   public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the price of one dollar: ");
    double dollarPrice = sc.nextDouble();

    System.out.println("Enter the amount of dollars to be bought: ");
    double dollarAmount = sc.nextDouble();

    double toBePaid = CurrencyConverter.convertToReais(dollarPrice, dollarAmount);
    System.out.printf("Amount to be paid in reais = %.2f%n", toBePaid);


    sc.close();
   } 
}
