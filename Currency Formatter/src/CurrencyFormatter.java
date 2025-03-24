import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormatter {
static double amount;
    public  static  void  Currency ( String CountryName   ,String  Currency) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter payment for CountryName   :");
        amount = scan.nextDouble();
        Locale locale = new Locale(CountryName, Currency);
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        System.out.println("this Amount is " + format.format(amount));
    }





}
