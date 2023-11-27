import java.util.Scanner;
public class PetrolPurchaseTest{
public static void main(String[] args){

PetrolPurchase petrolPurchase1 = new PetrolPurchase("Sabo Yaba", "Fuel", 0, 595.50, 10);
PetrolPurchase petrolPurchase2 = new PetrolPurchase("World oil", "Diesel", 0, 950.50, 5);

System.out.printf("Location is %s%n", petrolPurchase1.getLocation());
System.out.printf("Type: %s%n", petrolPurchase1.getType());
System.out.printf("Fuel per litre is %.2f%n", petrolPurchase1.getPerLitre());
System.out.printf("Discount on fuel: %.2f%n%n", petrolPurchase1.getPercentage());

System.out.printf("Location is %s%n", petrolPurchase2.getLocation());
System.out.printf("Type: %s%n", petrolPurchase2.getType());
System.out.printf("Diesel per litre is %.2f%n", petrolPurchase2.getPerLitre());
System.out.printf("Discount on Diesel: %.2f%n%n", petrolPurchase2.getPercentage());

Scanner scanner = new Scanner(System.in);
System.out.print("Enter fuel purchase for purchase1: ");
double purchase1 = scanner.nextInt();
petrolPurchase1.setQuantity(purchase1);
System.out.printf("Quantity is %.2f%n", petrolPurchase1.getQuantity());
System.out.printf("Your net purchase is %.2f%n", petrolPurchase1.getNetPurchase());

System.out.print("Enter fuel purchase for purchase2: ");
double purchase2 = scanner.nextDouble();
petrolPurchase2.setQuantity(purchase2);
System.out.printf("Quantity is %.2f%n", petrolPurchase2.getQuantity());

System.out.printf("Your net purchase is %.2f%n", petrolPurchase2.getNetPurchase());

}
}