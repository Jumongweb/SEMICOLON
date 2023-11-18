import java.util.Scanner;

public class Convert{
public static void main(String[] args){
int inputValue, year, remainingDays;
int minutePerDay = 24 * 60;
int minutePerYear = minutePerDay * 365;
int oneDay = minutePerDay / 60;
int oneYear = 365;

Scanner input = new Scanner(System.in);
System.out.print("Enter the minute you want to convert value: ");
inputValue = input.nextInt();

year = inputValue / minutePerYear;
remainingDays = inputValue % minutePerYear;

System.out.printf("%d minute is approximately %d years and %d days", inputValue, year, remainingDays);
}
}