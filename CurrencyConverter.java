import java.util.Scanner;
public class CurrencyConverter {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base currency: ");
        String baseCurrency = sc.nextLine().toUpperCase();
        System.out.print("Enter the target currency: ");
        String targetCurrency = sc.nextLine().toUpperCase();
        double exchangeRate = fetchExchangeRate(baseCurrency, targetCurrency);
if (exchangeRate == -1) {
            System.out.println("Failed to fetch exchange rate. Please try again later.");
            return;
}
System.out.print("Enter the amount to convert: ");
double amount = sc.nextDouble();
double convertedAmount = amount * exchangeRate;
System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
sc.close();
}
private static double fetchExchangeRate(String baseCurrency, String targetCurrency) {
return 1.20;
}
}