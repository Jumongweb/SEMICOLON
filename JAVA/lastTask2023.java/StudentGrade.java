import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
    private static int noOfStudent;
    private static int noOfSubject;
    private static int highestScore = Integer.MIN_VALUE;
    private static int lowestScore = Integer.MAX_VALUE;
   	
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int overallHighestScore = Integer.MIN_VALUE;
	int overallHighestScoreSubject = 1;
	int overallHighestScoreStudent = 1;
	int overallLowestScore = Integer.MAX_VALUE;
	int overallLowestScoreSubject= 1;
	int overallLowestScoreStudent = 1;
	
	System.out.println("How many students do you have? ");
	noOfStudent = scanner.nextInt();
	System.out.println("How many subject do they offer? ");
	noOfSubject = scanner.nextInt();
	saveDisplay();
	int[][] subjectArray = new int[noOfStudent][noOfSubject];
	
	for (int index = 0; index < noOfStudent; index++){	
		for (int index2 = 0; index2 < noOfSubject; index2++){
			System.out.printf("Entering score for student %d%n", index + 1);
			System.out.printf("Enter score for subject %d%n", index2 + 1);
		
			subjectArray[index][index2] = scanner.nextInt();
			saveDisplay();
		}
		System.out.println();
	}
	
	line();
	System.out.print("STUDENT");
	for (int subject = 0; subject < noOfSubject; subject++){
		System.out.printf("%10s%d", "SUB", subject + 1);
	}
	System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");
	line();
	
	int[] subjectTotal = new int[noOfStudent];
		
	for (int student = 0; student < noOfStudent; student++){
		int sum = 0;
		double average = 0;
		
		System.out.printf("Student %d", student + 1);

		for(int subject = 0; subject < noOfSubject; subject++){
			System.out.printf("%10d", subjectArray[student][subject]);
			sum += subjectArray[student][subject];
			average = (double)sum / noOfSubject;

			if (overallHighestScore < subjectArray[student][subject]){
				overallHighestScore = subjectArray[student][subject];
				overallHighestScoreStudent = student + 1;
				overallHighestScoreSubject = subject + 1;
			}
			if (overallLowestScore > subjectArray[student][subject]){
				overallLowestScore = subjectArray[student][subject];
				overallLowestScoreStudent = student + 1;
				overallLowestScoreSubject = subject + 1;
			}
		}
		subjectTotal[student] = sum;
		System.out.printf("%10d %,10.2f", sum, average);
		
		System.out.println();
	}
	
	int highestTotalSum = subjectTotal[0];
	int lowestTotalSum = subjectTotal[0];
	int highestTotalSumIndex = 1;
	int lowestTotalSumIndex = 1;
	
	for (int i = 0; i < subjectTotal.length; i++){
		if (highestTotalSum < subjectTotal[i]) {
			highestTotalSum = subjectTotal[i];
			highestTotalSumIndex = i + 1;
		}
		if (lowestTotalSum > subjectTotal[i]) {
			lowestTotalSum = subjectTotal[i];
			lowestTotalSumIndex = i + 1;
		}
	}
	
	line();
	line();
	
	int[] highScoreArray = new int[noOfSubject];
	int[] lowScoreArray = new int[noOfSubject];
	int[] highScoreIndex = new int[noOfSubject];
	int[] lowScoreIndex = new int[noOfSubject];
	int[] subjectSum = new int[noOfSubject];
	double[] subjectAverage = new double[noOfSubject];
	int[] subjectPassed = new int[noOfSubject];
	int[] subjectFailed = new int[noOfSubject];
	int totalSum = 0;
	
	for (int index = 0; index < noOfSubject; index++) {
		int highScore = Integer.MIN_VALUE;
		int lowScore = Integer.MAX_VALUE;
		int indexHigh = 0;
		int indexLow = 0;
		int sum = 0;
		double average = 0;
		int passes = 0;
		int fails = 0;

		for (int index2 = 0; index2 < noOfStudent; index2++){ 
			sum += subjectArray[index2][index];
			average = (double)sum / noOfStudent;
		
			if (subjectArray[index2][index] > highScore){
				highScore = subjectArray[index2][index];
				indexHigh = index2;
			}
			if (subjectArray[index2][index] < lowScore){
				lowScore = subjectArray[index2][index];
				indexLow = index2;
			}
			if (subjectArray[index2][index] >= 50){
				passes++;
			}
			if (subjectArray[index2][index] < 50) {
				fails++;	
			}
		} 
		totalSum += sum;
		highScoreArray[index] = highScore;
		lowScoreArray[index] = lowScore;
		highScoreIndex[index] = indexHigh;
		lowScoreIndex[index] = indexLow;
		subjectSum[index] = sum;
		subjectAverage[index] = average;
		subjectPassed[index] = passes;
		subjectFailed[index] = fails;
	}
/*
	int hardest = subjectFailed[0];	
	int hardestIndex = 1;
	int easiest = subjectPassed[1];	
	int easiestIndex = 1;

	for (int index = 0; index < subjectFailed.length; index++){
		if (hardest < subjectFailed[index]) {
			hardest = subjectFailed[index];
			hardestIndex = index + 1;	
		}
		if (easiest < subjectPassed[index]) {
			hardest = subjectPassed[index];
			easiestIndex = index + 1;	
		}
	} */
	
	System.out.println();
	System.out.println("SUBJECT SUMMARY");
	for (int summary = 0; summary < noOfSubject; summary++){
		System.out.printf("Subject %d%n", summary + 1);	
		System.out.printf("Highest scoring student is: Student %d scoring %d%n", highScoreIndex[summary] + 1, highScoreArray[summary]);
		System.out.printf("Lowest scoring student is: Student %d scoring %d%n", lowScoreIndex[summary] + 1, lowScoreArray[summary]);
		System.out.printf("Total Score is: %d%n", subjectSum[summary]);
		System.out.printf("Average Score is: %.2f%n", subjectAverage[summary]);
		System.out.printf("Number of passes: %d%n", subjectPassed[summary]);
		System.out.printf("Number of fails: %d%n", subjectFailed[summary]);
		System.out.println();	
	}
	
	System.out.println();
	
	int hardSubject = subjectFailed[0];
    	int easySubject = subjectPassed[0];
	int hardSubjectIndex = 1;
    	int easySubjectIndex = 1;

	for (int sub = 0; sub < noOfSubject; sub++){
		if (subjectFailed[sub] > hardSubject) {
			hardSubject = subjectFailed[sub];
			hardSubjectIndex = sub + 1;
		}
		if (subjectPassed[sub] > easySubject) {
			easySubject = subjectPassed[sub];
			easySubjectIndex = sub + 1;
		}
	}

	System.out.printf("The hardest subject is Subject %d with %d failures%n", hardSubjectIndex, hardSubject);
	System.out.printf("The easiest subject is Subject %d with %d passes%n", easySubjectIndex, easySubject);
	System.out.printf("The overall Highest score is score by student %d in subject %d scoring %d%n", overallHighestScoreStudent, overallHighestScoreSubject, overallHighestScore);
	System.out.printf("The overall lowest score is score by student %d in subject %d scoring %d%n", overallLowestScoreStudent, overallLowestScoreSubject, overallLowestScore);

	line();
	System.out.println();
	System.out.println("CLASS SUMMARY");
	line();
	System.out.printf("Best Graduating Student is: Student %d scoring %d%n", highestTotalSumIndex, highestTotalSum);
	line();
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", lowestTotalSumIndex, lowestTotalSum);
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	
	line();
	System.out.printf("Class total score is: %d%n", totalSum);
	System.out.printf("Class Average score is: %.2f%n", (double)totalSum / noOfStudent);
	line();
    }
	
//    private static int[]
    private static void saveDisplay() {
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");
    }
    private static void line() {
	System.out.println("===============================================================================");
    }

}