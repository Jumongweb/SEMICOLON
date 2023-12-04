import java.util.Scanner;
public class RaisedToPower{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number: ");
int number1 = scanner.nextInt();
System.out.print("Enter first number: ");
int number2 = scanner.nextInt();
int power = 1;
int count = 0;

while (count != number2) {
	power *= number1;
	count++;
}

System.out.printf("%d raised to power %d is %d", number1, number2, power);
}
}