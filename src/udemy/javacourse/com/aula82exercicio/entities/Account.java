package udemy.javacourse.com.aula82exercicio.entities;

public class Account {
    private int accNumber;
    private String holder;
    private double balance;

    public Account(int accNumber, String holder, double initialDeposit) {
        this.accNumber = accNumber;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(int accNumber, String holder) {
        this.accNumber = accNumber;
        this.holder = holder;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Data\nAccount: " 
            + accNumber 
            + ", Holder: " 
            + holder 
            + ", Balance: $" 
            + String.format("%.2f", balance);
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
