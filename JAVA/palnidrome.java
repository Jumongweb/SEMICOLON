import java.util.Scanner;

public class Palnidrome{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter three integers: ");
int integers = scanner.nextInt();

int first = integers / 100;
int second = (integers / 10) % 10;
int third = integers % 10;

if (first == third){
System.out.printf("%d%d%d is a Palnidrome", first, second, third);
}
if (first != third){
System.out.printf("%d%d%d is not Palnidrome", first, second, third);
}

}
}