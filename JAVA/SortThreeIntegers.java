import java.util.Scanner;
public class SortThreeIntegers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first number: ");
int firstNumber = scanner.nextInt();

System.out.print("Enter the second number: ");
int secondNumber = scanner.nextInt();

System.out.print("Enter the third number: ");         
int thirdNumber = scanner.nextInt();

int smallest = firstNumber;
int largest = thirdNumber;

if (secondNumber < smallest)
        smallest = secondNumber;
if (thirdNumber < smallest)                              
	smallest = thirdNumber;

if (firstNumber > largest)
        largest = firstNumber;
if (secondNumber > largest)
        largest = secondNumber;

if (firstNumber > smallest && firstNumber < largest){
System.out.println(smallest);
System.out.println(firstNumber);
System.out.println(largest);

} else if (secondNumber > smallest && secondNumber < largest){
System.out.println(smallest);
System.out.println(secondNumber);
System.out.println(largest);

} else if (thirdNumber > smallest && thirdNumber < largest){
System.out.println(smallest);
System.out.println(thirdNumber);                      System.out.println(largest);
}

}
}