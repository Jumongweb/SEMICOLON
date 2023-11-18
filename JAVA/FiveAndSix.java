import java.util.Scanner;

public class FiveAndSix{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter a number: ");
int number = scan.nextInt();

if (number % 5 == 0 && number % 6 != 0) {
	System.out.printf("is %d divisible by 5 and 6, false%n", number);
	System.out.printf("is %d divisible by 5 or 6, true%n", number);
	System.out.printf("is %d divisible by 5 or 6, but not both? true%n", number);
}

if  (number % 6 == 0 && number % 5 != 0){
	System.out.printf("is %d divisible by 5 and 6, false%n", number);
	System.out.printf("is %d divisible by 5 or 6, true%n", number);
	System.out.printf("is %d divisible by 5 or 6, but not both? true%n", number);
}

if (number % 5 == 0 && number % 6 == 0) {
	System.out.printf("is %d divisible by 5 and 6, true%n", number);
	System.out.printf("is %d divisible by 5 or 6, true%n", number);
	System.out.printf("is %d divisible by 5 or 6, but not both? false%n", number);
}

}
}
