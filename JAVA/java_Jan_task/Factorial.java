import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);	
	System.out.print("Enter a number and get its factorial: ");	int number = scanner.nextInt();
	int userInput = number; 

	while (number < 1 || number > 20){
		System.out.println("Number should be between 1 - 20");
		System.out.print("Enter a number and get its factorial: ");
		number = scanner.nextInt();
	}

	for (int count = number - 1; count > 0; count--){
		number *= count;	
	} 
	
	System.out.printf("The factorial of %d is %d", userInput, number);
    }

}