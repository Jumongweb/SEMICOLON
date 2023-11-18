import java.util.Scanner;

public class DaysInAMonth{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

System.out.print("Enter month: ");
int month = scan.nextInt();

System.out.print("Enter year: ");
int year = scan.nextInt();

int jan = 31;
int feb = 28;
int mar = 31;
int apr = 30;
int may = 31;
int jun = 30;
int jul = 31;
int aug = 31;
int sep = 30;
int oct = 31;
int nov = 30;
int dec = 31;

if (month == 1)
	System.out.printf("January %d had %d days", year, jan);
if (month == 2 && year % 4 != 0)
	System.out.printf("February %d had %d days", year, feb);
else if (month == 2 && year % 4 == 0) {
	feb += 1;
	System.out.printf("February %d had %d days", year, feb);
}
if (month == 3)
	System.out.printf("March %d had %d days", year, mar);
if (month == 4)
	System.out.printf("April %d had %d days", year, apr);
if (month == 5)
	System.out.printf("May %d had %d days", year, may);
if (month == 6)
	System.out.printf("June %d had %d days", year, jun);
if (month == 7)
	System.out.printf("July %d had %d days", year, jul);
if (month == 8)
	System.out.printf("August %d had %d days", year, aug);
if (month == 9)
	System.out.printf("September %d had %d days", year, sep);
if (month == 10)
	System.out.printf("October %d had %d days", year, oct);
if (month == 11)
	System.out.printf("November %d had %d days", year, nov);
if (month == 12)
	System.out.printf("December %d had %d days", year, dec);

}
}
