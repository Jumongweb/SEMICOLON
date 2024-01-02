import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("How many students do you have? ");
	int noOfStudent = scanner.nextInt();
	System.out.print("How many subject do they offer? ");
	int noOfSubject = scanner.nextInt();
	
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");
	System.out.println();
	
	int[][] students = new int[noOfStudent][noOfSubject];
	int[] totals = new int[noOfStudent];
	double[] average = new double[noOfStudent];

	int count = 0;
	while (count < students.length){
		System.out.printf("Entering score for student %d%n", count + 1);
		int subject = 0;
		while ( subject < noOfSubject){
			System.out.printf("Enter score for subject %d: %n", subject + 1);
			students[count][subject] = scanner.nextInt();
			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully");
			System.out.println();
			subject++;
		}
		count++;	
	}
	
System.out.println("==================================================================");
	System.out.print("STUDENT\t\t");
	for (int index = 0; index < noOfSubject; index++){
		System.out.printf("SUB%d\t", index + 1); 
	}
	
	System.out.printf("%5s %5s %5s%n", "TOT", "AVE", "POS");

	System.out.println();
System.out.println("==================================================================");
	
	int[] highestScore = new int[noOfSubject];
	int[] lowestScore = new int[noOfSubject];

	for (int index = 0; index < noOfStudent; index++){
		System.out.printf("Student%d \t", index + 1);	
		for (int index2 = 0; index2 < noOfSubject; index2++){
			totals[index] += students[index][index2];
			average[index] = totals[index] / (double)noOfSubject;
			System.out.printf("%d\t", students[index][index2]);
		}

		System.out.print(totals[index] + "\t");
		System.out.printf("%.2f\t", average[index]);
		System.out.println();

		for (int alpha = 0; alpha < noOfSubject; alpha++) {
			int highest = highestScore[0];
			int lowest = lowestScore[0];
			
			if (highest > students[alpha][index]) {
				highest = students[alpha][index];
				highestScore[alpha] = highest;
			}
			if (lowest < students[alpha][index]){
				lowest = students[alpha][index];
				lowestScore[alpha] = lowest;
			}
		}
		
	for (int index2 = 0; index2 < noOfSubject; index2++) {
                totals[index] += students[index][index2];
                averages[index] = totals[index] / (double) noOfSubject;
                System.out.printf("%d\t", students[index][index2]);

                // Calculate highest and lowest scores
                if (highest < students[index][index2]) {
                    highest = students[index][index2];
                    highestScore[index2] = highest;
                }
                if (lowest > students[index][index2]) {
                    lowest = students[index][index2];
                    lowestScore[index2] = lowest;
                }
            }
//	fdgdf
	
	

	}

	System.out.println("==================================================================");
	System.out.println("==================================================================");
	
	System.out.println("SUBJECT SUMMARY");
/*	for (int index = 0; index < noOfSubject; index++) {
		System.out.printf("Subject %d%n", index + 1);
		System.out.printf("Highest scoring student is: Student %d scoring %d", dewf);
	}	*/
	
	System.out.println(Arrays.toString(highestScore));
	System.out.println(Arrays.toString(lowestScore));
		
	}
}