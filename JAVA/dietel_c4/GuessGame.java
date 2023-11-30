import java.security.SecureRandom;
import java.util.Scanner;

public class GuessGame{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

SecureRandom random = new SecureRandom();
int computerNumber = random.nextInt(1,11);
System.out.print("Enter number between 1 - 10: ");
	int guess = scanner.nextInt();

while (guess < 1 || guess > 10){
	System.out.print("Enter number between 1 - 10: ");
	guess = scanner.nextInt();
}
	if (guess == computerNumber)
System.out.printf("Correct: Computer number is %d%n your guess is %d", computerNumber, guess);
	else if (guess > computerNumber)
	System.out.printf("Too High Computer number is %d%n and your guess is %d", computerNumber, guess);
	else
	System.out.printf("Too low Computer number is %d%n your guess is %d", computerNumber, guess);


}
}