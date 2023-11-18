import java.util.Scanner;
public class Comparison{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter first integer: ");
int number1 = scanner.nextInt();

System.out.print("Enter Second integer: ");
int number2 = scanner.nextInt();

if (number1 == number2) {
	System.out.printf("%d == %d%n", number1, number2);
}

if (number1 > number2) {
	System.out.printf("%d is > %d%n", number1, number2);
}

if (number1 != number2) {
	System.out.printf("%d is not equal to %d%n", number1, number2);
}f

if (number1 < number2) {
	System.out.printf("%d < %d%n", number1, number2);
}

if (number1 >= number2) {
	System.out.printf("%d is >= %d%n", number1, number2);
}
if (number1 <= number2) {
	System.out.printf("%d <= %d%n", number1, number2);
}


}
}