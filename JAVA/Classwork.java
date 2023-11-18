import java.util.Scanner;
public class Classwork{
public static void main(String[] args){
int flip;
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
flip = scanner.nextInt();
if (flip == 1){
System.out.println(0);
}

if (flip == 0){
System.out.println(1);
}
}
}