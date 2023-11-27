public class CarClassTest{
public static void main(String[] args){

CarClass carClass1 = new CarClass("Lexus", "2023", 8000);
CarClass carClass2 = new CarClass("Brabuz", "2024", 12000);

System.out.printf("Model: %s%n", carClass1.getModel());
System.out.printf("Year: %s%n", carClass1.getYear());
System.out.printf("Initial Price: %.2f%n%n", carClass1.getPrice());

System.out.printf("Model: %s%n", carClass2.getModel());
System.out.printf("Year: %s%n", carClass2.getYear());
System.out.printf("Initial Price: %.2f%n%n", carClass2.getPrice());

double discount1 = carClass1.getPrice() * 0.05;
double discount2 = carClass2.getPrice() * 0.07;

double priceWithDiscount1 = carClass1.getPrice() - discount1;
double priceWithDiscount2 = carClass2.getPrice() - discount2;

System.out.printf("Price for %s minus discount is %.2f%n", carClass1.getModel(), priceWithDiscount1);
System.out.printf("price for %s minus discount is %.2f%n", carClass2.getModel(), priceWithDiscount2);

}
}