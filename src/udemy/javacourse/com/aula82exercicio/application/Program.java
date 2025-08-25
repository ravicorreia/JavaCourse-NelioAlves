package udemy.javacourse.com.aula82exercicio.application;

import java.util.Locale;
import java.util.Scanner;

import udemy.javacourse.com.aula82exercicio.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accNumber = sc.nextInt();
        
        System.out.println("Enter account holder: ");
        String holder = sc.next();
        sc.next();

        System.out.println("Is there an initial deposit? (yes/no)");
        char response = sc.next().charAt(0);

        Account account = null;
        
        if (response == 'y') {
            System.out.println();
            System.out.println("Enter initial deposit:");
            double initialDeposit = sc.nextDouble();
            account = new Account(accNumber, holder, initialDeposit);
            
        } else if (response == 'n') {
            System.out.println("No initial deposit...");
            account = new Account(accNumber, holder);
        }

        System.out.println();

        System.out.println(account.toString());

        System.out.println();

        System.out.print("Enter a deposit amount: ");
        double amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println();

        System.out.println("Updated account data");
        System.out.println(account.toString());

        System.out.println();

        System.out.print("Enter a withdraw amount: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println();

        System.out.println("Updated account data");
        System.out.println(account.toString());

        sc.close();
    }

}
