import java.util.Scanner;

public class Checker{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter two integer: ");
int first = scanner.nextInt();

System.out.print("");
int second = scanner.nextInt();

boolean isMultiply = (first * 3) % (second * 3) == 0;

System.out.println("The first number is a multiple of the second? " + isMultiply);

}
}