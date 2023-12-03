import java.util.Scanner;

public class PyramidOfGiza{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Estimated number of stone used: ");
int numberOfStone = scanner.nextInt();

System.out.print("Average weight of each stone ");
double weightPerStone = scanner.nextDouble();

System.out.print("Number of years ");
int yearToComplete = scanner.nextInt();

double allStoneWeight = numberOfStone * weightPerStone;
double eachYear = allStoneWeight / yearToComplete;
double eachHour = eachYear / (yearToComplete * 365 * 24);
double eachMinute = eachHour / 60;

System.out.printf("Each year: %.2f%n", eachYear);
System.out.printf("Each hour: %.2f%n", eachHour);
System.out.printf("Each minute: %.2f%n", eachMinute);



}
}