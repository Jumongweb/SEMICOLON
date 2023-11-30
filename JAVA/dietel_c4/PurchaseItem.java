import java.util.Scanner;
public class PurchaseItem{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter an item: ");
String item = scanner.nextLine();
System.out.print("Enter the price: ");
double price = scanner.nextDouble();

while(price < 1){
	System.out.print("Enter a valid price: ");
	price = scanner.nextDouble();
}


double discount = 0.1;
double discountOfPrice = price * discount;
double total = price - discountOfPrice;
System.out.print("\n=======================\n");
System.out.printf("Item: %s%n", item);
System.out.printf("Discount: %.2f%n", discount);
System.out.printf("Total: %.2f%n", total);
System.out.print("=======================\n");

}
}

