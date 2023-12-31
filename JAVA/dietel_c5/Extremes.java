import java.util.Scanner;

public class Extremes{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many value do you want to input: ");
		int values = scanner.nextInt();
		
		int count = 0;
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		int first = 0;
		int last = 0;

		while (!(count == values)) {
			System.out.printf("Enter number %d: ", count + 1);
			int number = scanner.nextInt();
			if (count == 0)
				first = number;
			if (count == (values - 1))
				last = number;
			
			if (minimum > number){
				minimum = number;
			}
			if (maximum < number){
				maximum = number;
			}
			count++;		
		}
		int extremeSum = first + last;
		
		System.out.println("Minimum is " + minimum);
		System.out.println("Maximum is " + maximum);
		System.out.println("Extremes sum is " + extremeSum);
		
	}
}