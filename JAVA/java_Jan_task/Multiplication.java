import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter two number and get its product: ");
	
	int one = scanner.nextInt();	
	int two = scanner.nextInt();
	
	System.out.println(multiply(one, two));
	
    }

    public static int multiply(int firstNumber, int secondNumber){
	int result = 0;
	
	for (int count = 0; count < secondNumber; count++){
		result += firstNumber;
	}
	return result;
    }

}