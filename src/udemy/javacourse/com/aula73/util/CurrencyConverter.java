package udemy.javacourse.com.aula73.util;

public class CurrencyConverter {

    public static final double IOF = 0.06; // 6% IOF tax

    public static double convertToReais(double dollarPrice, double dollarAmount)  {
        double totalPrice = dollarPrice * dollarAmount;
        double totalWithTax = totalPrice + (totalPrice * IOF);
        return totalWithTax;
    }
  

}
