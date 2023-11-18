import java.util.Scanner;

public class AddThree{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
int digit = scan.nextInt();
int firstDigit = digit / 100;
int secondDigit = (digit / 10) % 10;
int thirdDigit = (digit % 10); 

int sum = firstDigit + secondDigit + thirdDigit;
System.out.print(sum);
}
}
