import java.util.Scanner;

public class SplitDigit{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int digit = scanner.nextInt();

System.out.println(digit % 1000);
System.out.println(digit / 1000);

}
}