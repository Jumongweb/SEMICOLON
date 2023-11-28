import java.util.Scanner;
public class HighestScore{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of student: ");
int noOfStudent = scanner.nextInt();

int score = 0;
int highestScore = 0;
String highScorer = "";
int count = 1;

while(count <= noOfStudent){
	System.out.printf("Enter name of student%d: ", count);
	String nameOfStudent = scanner.next();	
	System.out.printf("Enter score of student%d: ", count);
	score = scanner.nextInt();
		
	if (score > highestScore){
		highestScore = score;
		highScorer = nameOfStudent;

	}
	count++;

}

System.out.printf("The student with the highest score is %s with %d score", highScorer, highestScore);

}
}