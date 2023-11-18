import java.util.Scanner;

public class ReverseNumber{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter three numbers: ");
int digit = scanner.nextInt();

int firstDigit = (digit / 100);
int secondDigit = (digit / 10) % 10;
int thirdDigit = digit % 10;

System.out.print(thirdDigit);
System.out.print(secondDigit);
System.out.print(firstDigit);

}
}