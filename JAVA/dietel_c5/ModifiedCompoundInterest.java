import java.util.Scanner;

public class ModifiedCompoundInterest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		int noOfYear = scanner.nextInt();
		
		System.out.print("Enter rate: ");
		double principal = 1000.0;
		double rate = scanner.nextDouble() / 100;
		
		System.out.println("Year\t Amount on deposit");
		
		for (int year = 1; year <= noOfYear; year++){
			double amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%5d%,20.2f%n", year, amount);
		}
		
	}
}