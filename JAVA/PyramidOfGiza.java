import java.util.Scanner;

public class PyramidOfGiza{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Estimated number of stone used: ");
int numberOfStone = scanner.nextInt();

System.out.print("Average weight of each stone ");
double weightByTon = scanner.nextDouble();

System.out.print("Number of years ");
int yearToComplete = scanner.nextInt();

double minute = 60 / 2.5;
double hour = (60 * 24) * 2.5;
double day = (hour * 24) * 2.5;
double year = 365 * yearToComplete;

double weight = 2.5;
double allStoneWeight = numberOfStone * weight;

System.out.println("Weight " + year);

}
}