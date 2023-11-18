import java.util.Scanner;

public class NegativePositive{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter five integers: ");

int firstInt = scanner.nextInt();
int secondInt = scanner.nextInt();
int thirdInt = scanner.nextInt();
int fourthInt = scanner.nextInt();
int fifthInt = scanner.nextInt();

int positiveNumber = 0;
int negativeNumber = 0;
int zero = 0;

if (firstInt > 0){
	positiveNumber += 1;
}
if (firstInt < 0){
	negativeNumber += 1;
}
if (firstInt == 0){
	zero += 1;
}

if (secondInt > 0){
	positiveNumber += 1;
}
if (secondInt < 0){
	negativeNumber += 1;
}
if (secondInt == 0){
	zero += 1;
}

if (thirdInt > 0){
	positiveNumber += 1;
}
if (thirdInt < 0){
	negativeNumber += 1;
}
if (thirdInt == 0){
	zero += 1;
}

if (fourthInt > 0){
	positiveNumber += 1;
}
if (fourthInt < 0){
	negativeNumber += 1;
}
if (fourthInt == 0){
	zero += 1;
}

if (fifthInt > 0){
	positiveNumber += 1;
}
if (fifthInt < 0){
	negativeNumber += 1;
}
if (fifthInt == 0){
	zero += 1;
}

System.out.println("The positive number here is " + positiveNumber);
System.out.println("The negative number here is " + negativeNumber);
System.out.println("The number of zero is " + zero);
}
}