import java.util.Scanner;

public class BMIcalculator{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
System.out.print("Enter weight: ");

double weightInKilograms = scan.nextInt();

System.out.print("Enter height: ");
double heightInMeters = scan.nextInt();

heightInMeters *= heightInMeters;

double BMI = weightInKilograms / heightInMeters;

System.out.println(BMI);

}
}

