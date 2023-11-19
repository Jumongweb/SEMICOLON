import java.util.Scanner;

public class DayOfTheWeek{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter year: (e.g., 2012): ");
int year = scanner.nextInt();
int j = year / 100;
System.out.print("Enter month: 1 - 12: ");
int m = scanner.nextInt();
int k = year % 100;
System.out.print("Enter the day of the month: 1 - 31: ");
int q = scanner.nextInt();

if (m == 1 || m == 2){
	m = m + 12;
	k--;
}

int h = ((q + ((26 *(m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

if (h == 0)
	System.out.print("Day of the week is Saturday");
if (h == 1)
	System.out.print("Day of the week is Sunday");
if (h == 2)
	System.out.print("Day of the week is Monday");
if (h == 3)
	System.out.print("Day of the week is Tuesday");
if (h == 4)
	System.out.print("Day of the week is Wednesday");
if (h == 5)
	System.out.print("Day of the week is Thursday");
if (h == 6)
	System.out.print("Day of the week is Friday");

}
}
