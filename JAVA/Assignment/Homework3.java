import java.util.Scanner;

public class Homework3{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter first integer: ");
int firstInt = scanner.nextInt();

System.out.print("Enter Second integer: ");
int secondInt = scanner.nextInt();

firstInt *= firstInt;
secondInt *= secondInt;

int sum = firstInt + secondInt;
int differ = firstInt - secondInt;

System.out.printf("First square is %d and second square is %d\n", firstInt, secondInt);
System.out.println("The sum is " + sum);
System.out.println("The difference is " + differ);


}
}
