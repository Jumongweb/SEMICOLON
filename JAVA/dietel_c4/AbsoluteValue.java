import java.util.Scanner;
public class AbsoluteValue{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

if (number > 0)
		System.out.printf("The absolute value of %d is %d", number, number);
if (number < 0){
	int number2 = (-1 * number);
	System.out.printf("The absolute value of %d is %d", number, number2);
}
}
}