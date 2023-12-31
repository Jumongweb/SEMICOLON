import java.util.Scanner;

public class BarChartWithArray{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int[] values = new int[5];
	
	System.out.print("Enter five integers between 1 - 30: ");
	
	int count = 0;
	while (count < 5){
		int number = scanner.nextInt();
		if (number < 1 || number > 30){
			System.out.print("Number should be between 1 - 30: ");
			count--;
		} 
		else {
			values[count] = number;		
		}
	count++;
	}

	for (int i = 0; i < 5; i++){
		for (int j = 1; j <= values[i]; j++) {
			System.out.print("*");
		}
		System.out.println();
	} 

    }
}