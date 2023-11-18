import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Calculate the number of years and days
        long minutesInYear = 60 * 24 * 365;
        long years = minutes / minutesInYear;
        long days = (minutes % minutesInYear) / (60 * 24);

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        // Close the scanner
        scanner.close();
    }
}
