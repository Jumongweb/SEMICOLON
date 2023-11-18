import java.util.Scanner;
public class CurrencyConverter{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the exchange rate from dollars to RMB: ");
double rate = scanner.nextDouble();

System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
double convertTo = scanner.nextDouble();

if (convertTo == 0){
System.out.print("Enter the dollar amount: ");
double amount = scanner.nextDouble();
double dollarValue = rate * amount;
System.out.printf("$%.1f is %.2f yuan", amount, dollarValue);
} 

if (convertTo == 1){
System.out.print("Enter the RMB amount: ");
double amountRMB = scanner.nextDouble();
double dollarValue = amountRMB / rate;
System.out.printf("%.1f yuan is $%.2f", amountRMB, dollarValue);
} 

}
}