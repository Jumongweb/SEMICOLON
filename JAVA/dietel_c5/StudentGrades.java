import java.util.Scanner;

public class StudentGrades{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	int count = 0;
	int gradeA = 0;
	int gradeB = 0;
	int gradeC = 0;
	int gradeD = 0;
	int gradeF = 0;
	
	while (count < 5){
		System.out.printf("Enter name %d: ", count + 1);
		String name = scanner.nextLine();
		System.out.printf("Enter grade %d: ", count + 1);
		char score = scanner.next().charAt(0);
		scanner.nextLine();
		
/*		while (score < 1 || score > 100) {
			System.out.print("Score should be between 1 - 100, ");
		//	count--;
			System.out.printf("Enter grade %d:", count + 1);
			score = scanner.nextInt();
			scanner.nextLine();
		}
		*/

		switch (score) {
			case 'A':
				gradeA++;
				break;
			case 'B':
				gradeB++;
				break;
			case 'C':
				gradeC++;
				break;
			case 'D':
				gradeD++;
				break;
			default:
				gradeF++;
			
		}
		count ++;
	}
	System.out.printf("%d student scored A%n", gradeA);
	System.out.printf("%d student scored B%n", gradeB);
	System.out.printf("%d student scored C%n", gradeC);
	System.out.printf("%d student scored D%n", gradeD);
	System.out.printf("%d student scored F%n", gradeF);

    }
}