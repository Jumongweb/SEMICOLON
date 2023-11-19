import java.util.Scanner;
import java.util.Random;

public class HeadsOrTails{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Pick 0 for heads or 1 for tails: ");
int guess = scanner.nextInt();

Random rand = new Random();
int number = rand.nextInt(2);

if (guess == number)
	System.out.println("Correct");
else
	System.out.println("Incorrect");

}
}