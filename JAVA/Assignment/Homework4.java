import java.util.Scanner;

public class Homework4 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = scanner.nextInt();

int oneSquared = number * number;

if (oneSquared > 100){
	System.out.printf("%d is greater than 100%n", oneSquared);
}

if (oneSquared == 100){
	System.out.printf("%d == 100%n", oneSquared);
}

if (oneSquared != 100){
	System.out.printf("%d not equal to 100%n", oneSquared);
}

if (oneSquared < 100){
	System.out.printf("%d is less than 100%n", oneSquared);
}
}
}