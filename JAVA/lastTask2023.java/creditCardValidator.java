import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator2{
   public static String cardType;
   public static String cardValidity;

   public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Hello, Kindly Enter Card details to verify ");
	long cardNumber = scanner.nextLong();
	String cardStringValue = Long.toString(cardNumber);
	char cardIndex2 = cardStringValue.charAt(1);
	int[] cardNumericValue = new int[cardStringValue.length()];
	int evenIndexSum = 0;
	int oddIndexSum = 0;
	
	for (int i = 0; i < cardStringValue.length(); i++){
		cardNumericValue[i] = Character.getNumericValue(cardStringValue.charAt(i));
	}
	for (int i = cardNumericValue.length - 1; i >= 0; i--){
		if (i % 2 == 1){
			oddIndexSum += cardNumericValue[i];		
		}
		if (i % 2 == 0){
			int doubledValue = cardNumericValue[i] * 2;
			evenIndexSum += (doubledValue < 10) ? doubledValue : (doubledValue / 10 + doubledValue % 10);
		}
	}
	
	int result = evenIndexSum + oddIndexSum;
	
	if (result % 10 == 0){
		cardValidity = "Valid";
	}
	else {
		cardValidity = "Invalid";
	}
	
	if (cardNumericValue[0] == 4) {
		cardType = "Visa card";
	} 
	else if (cardNumericValue[0] == 5) {
		cardType = "MasterCard";
	}
	else if (cardNumericValue[0] == 6) {
		cardType = "Discover cards";
	}
	else if (cardNumericValue[0] == 3 && cardNumericValue[1] == 7){
		cardType = "American express card";
	}
	else{
		cardType = "Invalid card";
	}
	
	System.out.println("*****************************************");
	System.out.printf("**Credit Card Type: %s%n", cardType);
	System.out.printf("**Credit card Number: %d%n", cardNumber);
	System.out.println("**Credit Card Digit Length: " + cardStringValue.length());
	System.out.println("**Credit Card Validity Status: " + cardValidity);
	System.out.println("*****************************************");
   }
}