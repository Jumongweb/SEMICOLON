import java.util.Scanner;

public class Homework5{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int one = scanner.nextInt();

System.out.print("");
int two = scanner.nextInt();

System.out.print("");
int three = scanner.nextInt();

int sum = one + two + three;
int average = sum / 3;
int product = one * two * three;


System.out.printf("The sum of %d, %d and %d is %d%n", one, two, three, sum);
System.out.printf("The average of %d, %d and %d is %d%n", one, two, three, average);
System.out.printf("The product of %d, %d and %d is %d%n", one, two, three, product);

if (one > two && one > three) {
System.out.printf("%d is greater than %d and %d%n", one, two, three);
} else if (two > one && two > three){
	System.out.printf("%d is greater than %d and %d%n", two, one, three);
} else{
System.out.printf("%d is greater than %d and %d%n", three, one, two);
}

if (one < two && one < three) {
System.out.printf("%d is less than %d and %d%n", one, two, three);
} else if (two < one && two < three){
	System.out.printf("%d is greater than %d and %d%n", two, one, three);
} else{
System.out.printf("%d is less than %d and %d%n", three, one, two);
}

}
}