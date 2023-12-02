import java.util.Scanner;
public class PositiveNegativeZero{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int positive = 0;
int negative = 0;
int zero = 0;

System.out.print("Enter numbers or end with -1: ");
int number = scanner.nextInt();

while (number != -1){
	if (number >= 1)
		positive++;
	else if(number < 0)
		negative++;
	else
		zero++;
System.out.print("Enter numbers or end with -1: ");
number = scanner.nextInt();
}

System.out.println("Positive is " + positive);
System.out.println("Negative is " + negative);
System.out.println("Zero is " + zero);

}
}
