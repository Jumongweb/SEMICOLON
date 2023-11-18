import java.util.Scanner;
public class AgeConverter{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.print("Enter your age: ");
int inputYear = scan.nextInt();
int days = 365 * inputYear;

if (inputYear == 0){
	System.out.print(0);
}
if (inputYear != 0)
	System.out.println(days);


}
}


