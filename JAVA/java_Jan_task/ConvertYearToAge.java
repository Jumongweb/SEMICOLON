import java.util.Scanner;
import java.util.InputMismatchException;

public class ConvertYearToAge{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter your year of birth: ");
			int input_year = scanner.nextInt();
			int currentYear = 2024;
			int age = currentYear - input_year;
			System.out.printf("You are %d year old", age);
		}
		catch(InputMismatchException e) {
			System.out.printf("Enter integer only");		}
	}
}