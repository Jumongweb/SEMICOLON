import java.util.Scanner;

public class CompoundInterest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter year: ");
		// a = p (1 + r)n

		double principal = 1000.0;
		double rate = 0.05;
		int n = scanner.nextInt();
		System.out.println("Year\t Amount on deposit");
		
		for (int year = 1; year <= n; year++){
			double amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%5d%,20.2f%n", year, amount);
		}
		
	}
}