import java.util.Scanner;

public class Times{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number you want to multiply: ");
int number = scanner.nextInt();
int first = number * 1;
int second = number * 2;
int third = number * 3;
int fourth = number * 4;
int fifth = number * 5;
System.out.printf("%d * 1 = %d%n", number, first);
System.out.printf("%d * 2 = %d%n", number, second);
System.out.printf("%d * 3 = %d%n", number, third);
System.out.printf("%d * 4 = %d%n", number, fourth);
System.out.printf("%d * 5 = %d%n", number, fifth);

}
}