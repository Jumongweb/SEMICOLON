import java.util.Scanner;
public class HealthProfile{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter firstname: ");

String firstName = scanner.nextLine();
System.out.print("Enter lastname: ");
String lastName = scanner.nextLine();
System.out.print("Enter gender: ");
String gender = scanner.nextLine();
System.out.print("Enter year of birth: ");
int year = scanner.nextInt();
System.out.print("Enter month of birth: ");
int month = scanner.nextInt();
System.out.print("Enter day of birth: ");
int day = scanner.nextInt();
System.out.print("Enter height: ");
double height = scanner.nextDouble();
System.out.print("Enter weight: ");
double weight = scanner.nextDouble();

Health health = new Health("Kay", "Wash", "male", 2005, 10, 15, 5.6, 55.4);

health.setFirstName(firstName);
health.setLastName(lastName);
health.setGender(gender);
health.setYear(year);
health.setMonth(month);
health.setDay(day);
health.setHeight(height);
health.setWeight(weight); 

System.out.println("\nFirstname: " + health.getFirstName());
System.out.println("Lastname: " + health.getLastName());
System.out.println("Gender: " + health.getGender());
System.out.println("Year: " + health.getYear());
System.out.println("Month: " + health.getMonth());
System.out.println("Day: " + health.getDay());
System.out.printf("Height: %.2f%n", + health.getHeight());
System.out.println("Weight: " + health.getWeight());
System.out.println("Age is " + health.getAge());
System.out.printf("Maximum heart rate is %.2f%n", health.MaximumHeartRate());
System.out.println("Target heart rate is " + health.targetHeartRate());
System.out.printf("Body mass is %.2f%n",  health.BMI());
}
}
// body mass 120
// 1 pound is 0.453592 kilograms
