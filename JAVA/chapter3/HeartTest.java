import java.util.Scanner;
public class HeartTest{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter first name: ");
String firstName = scanner.nextLine();
System.out.print("Enter last name: ");
String lastName = scanner.nextLine();

System.out.print("Enter year of birth: ");
int yearOfBirth = scanner.nextInt();
System.out.print("Enter month of birth: ");
int monthOfBirth = scanner.nextInt();
System.out.print("Enter day of birth: ");
int dayOfBirth = scanner.nextInt();

Heart heart = new Heart("Lawal", "Toheeb", 2005, 8, 23);
heart.setFirstName(firstName);
heart.setLastName(lastName);
heart.setYear(yearOfBirth);
heart.setMonth(monthOfBirth);
heart.setDay(dayOfBirth);

System.out.println(heart.getFirstName());
System.out.println(heart.getLastName());
System.out.printf("%d-%d-%d%n",heart.getDay(), heart.getMonth(), heart.getYear());
System.out.printf("Age is %d%n", heart.getAge());
System.out.printf("Maximum heart rate is %.2f%n", heart.getMaximumHeartRate());
System.out.printf("Target heart rate is %.2f%n", heart.getTargetHeartRate());

}
}
