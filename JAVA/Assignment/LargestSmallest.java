import java.util.Scanner;

public class LargestSmallest{
public static void main(String[] args){
int num1, num2, num3, num4, num5;

Scanner scanner = new Scanner(System.in);
System.out.println("Enter five integer: ");
System.out.print("1. Enter an integer: ");
num1 = scanner.nextInt();
num2 = scanner.nextInt();
num3 = scanner.nextInt();
num4 = scanner.nextInt();
num5 = scanner.nextInt(); 

int largest = num1;
int smallest = num1;

if (num2 > largest){
	largest = num2;
} else if (num2 < smallest) {
	smallest = num2;
}

if (num3 > largest){
	largest = num3;	
} else if (num3 < smallest) {
	smallest = num3;
}

if (num4 > largest){
	largest = num4;
} else if (num4 < smallest) {
	smallest = num4;
}

if (num5 > largest){
	largest = num5;
} else if (num5 < smallest) {
	smallest = num5;
}

System.out.println("Largest is: " + largest);
System.out.println("Smallest integer is: " + smallest);

}
}