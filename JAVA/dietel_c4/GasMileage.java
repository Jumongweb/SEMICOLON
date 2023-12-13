import java.util.Scanner;
public class GasMileage{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int miles = 0;
int gallon = 0;
int totalGallon = 0;
int totalMiles = 0;
int count = 1;
double combinedMiles = 0;
double combinedGallons = 0;

while (true){
if (miles == -1 || gallon == -1){
	break;
}

System.out.print("Enter miles: ");
miles = scanner.nextInt();
System.out.print("Enter gallon used: ");
gallon = scanner.nextInt();

combinedMiles += miles;
combinedGallons += gallon;

double milePerGallon = (double)miles / (double)gallon;
System.out.printf("Driver %d travel %d mile, used %d gallon, therefore the MilePerGallon is %.2f%n", count, miles, gallon, milePerGallon);
count++;
} 

System.out.println("The combined gallon is " + combinedMiles);
System.out.println("The combined mile is " +combinedGallons);

}
}