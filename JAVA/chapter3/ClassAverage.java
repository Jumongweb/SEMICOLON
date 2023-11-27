import java.util.Scanner;

public class ClassAverage{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int total = 0;
int counter = 0;
System.out.print("Enter grade or -1 to quit: ");
int grade = scanner.nextInt();

while (grade != -1){
	
	total += grade;
	counter++;
	System.out.print("Enter grade or -1 to quit: ");
	grade = scanner.nextInt();

}
if (counter != 0){
	double average = total / counter;
	System.out.printf("The total of the %d grades is %d%n", counter, total);
	
System.out.printf("Average is %.2f%n", average);
  } else {
	System.out.print("No score was entered");
}

}
}