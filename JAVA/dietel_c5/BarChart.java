import java.util.Scanner;

public class BarChart{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter five integers between 1 - 30: ");
	
	int count = 1;
	while (count <= 5){
		int number = scanner.nextInt();
		if (number < 1 || number > 30){
			System.out.print("Number should be between 1 - 30: ");
			count--;
		} 
		else {
			for (int i = 1; i <= number; i++){
				System.out.print("*");
			}
			System.out.println();		
		}
	count++;

	}	

    }
}