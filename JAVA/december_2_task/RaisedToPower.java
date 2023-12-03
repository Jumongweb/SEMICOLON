import java.util.Scanner;
public class RaisedToPower{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number: ");
int number1 = scanner.nextInt();
System.out.print("Enter first number: ");
int number2 = scanner.nextInt();
int power = 0;
int count = 0;

for (int i = 0; i < number2; i++){
	power = number1 * number2;
	count++;
}
int pow = power * count;

System.out.println(power);
System.out.println(count);
System.out.println(pow);

}
}