import java.util.Scanner;
public class PositiveAndNegative{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
double total = 0;
double average = 0;
int positive = 0;
int negative = 0;
int count = 0;

System.out.print("Enter an integer, the input ends if it is 0: ");
	int number = scanner.nextInt();
if (number != 0){
	while (number != 0){
	if (number >= 1)
		positive++;
	else if(number < 0)
		negative++;
	total += number;
	count++;
System.out.print("Enter an integer, the input ends if it is 0: ");
	number = scanner.nextInt();
}


average = (double)total / count;
System.out.printf("The number of positives is %d%n", positive);
System.out.printf("The number of positives is %d%n", negative);
System.out.printf("The total is %.2f%n", total);
System.out.printf("The average is %.2f%n", average);

} else {
 	System.out.println("No number was entered except 0");
	}


}
}