package newpro; 
import java.util.Scanner;

public class currency {

    public static void main(String[] args) {

        double exchangeRate;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter exchange rate: ");
        exchangeRate = input.nextDouble();

        System.out.print("Enter amount to convert: ");
        double amountToConvert = input.nextDouble();

        System.out.print("Enter currency to convert from (e.g. USD): ");
        String fromCurrency = input.next().toUpperCase();

        System.out.print("Enter currency to convert to (e.g. EUR): ");
        String toCurrency = input.next().toUpperCase();

        double convertedAmount;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            convertedAmount = amountToConvert * exchangeRate;
            System.out.printf("Converted amount: %.2f EUR", convertedAmount);
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            convertedAmount = amountToConvert / exchangeRate;
            System.out.printf("Converted amount: %.2f USD", convertedAmount);
        } else {
            System.out.println("Invalid currency conversion");
        }
    }
}