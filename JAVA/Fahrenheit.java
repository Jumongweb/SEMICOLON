import java.util.Scanner;

public class Fahrenheit{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.print("Enter Celcius: ");
double celcius = scan.nextDouble();


double fahrenheit = (9.0 / 5.0) * celcius + 32;

System.out.printf("%.2f Celsius is %.2f Fahrenheit", celcius, fahrenheit);

}
}