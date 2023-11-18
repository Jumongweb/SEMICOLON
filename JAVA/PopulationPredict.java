import java.util.Scanner;

public class PopulationPredict{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.print("Enter estimated year: ");
int year = scan.nextInt();
long currentYear = 8072582813L;
double annualGrowth = (0.9 / 100) * 8072582813L;
double predictedYear = 8072582813L + annualGrowth * year;

System.out.printf("In the next %d year the world population will be %.2f", year, predictedYear);

}
}
