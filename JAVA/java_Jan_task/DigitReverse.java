import java.util.Scanner;

public class DigitReverse{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a five digit number and get it back in reverse: ");
		int number = scanner.nextInt();	
		String numberToString = Integer.toString(number);
		
		for (int index = numberToString.length() - 1; index >= 0; index--){
			System.out.print(Character.getNumericValue(numberToString.charAt(index)));
		} 
			
	}

}