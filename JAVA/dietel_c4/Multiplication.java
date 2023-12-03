import java.util.Scanner;
public class Multiplication{
public static void main(String[] Toheeb){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number from 1 - 10: ");
int number = scanner.nextInt();
int count = 1;
while (count < 13){
	// System.out.println(number + " x " + count + " = " + number * count);
	if (number < 1) {
		System.out.print("Number should be between 1 - 12: ");
		number = scanner.nextInt();
		count--;
	} else
		System.out.printf("%d x %d = %d%n", number, count, number * count);
	count++;
}

}
}
