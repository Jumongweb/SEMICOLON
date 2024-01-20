import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = scanner.nextInt();
	
	if (primeNumber(number) == 1){
		System.out.println("It is a prime number");	
	}
	else {
		System.out.println("It is not a prime number");
	}
		
    }

    public static int primeNumber(int number){
	int counter = 0;
	for (int count = 1; count < number; count++){
		if (number % count == 0){
			counter++;
		}
	}
	return counter;
    }

}