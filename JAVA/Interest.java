import java.util.Scanner;

public class Interest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter Balance: ");
int balance = int.nextInt();

System.out.print("Enter annual interest: ");
int annualInterest = int.nextInt();

interest = balance * (annualInterest / 1200);

System.out.println(interest);

}
}
