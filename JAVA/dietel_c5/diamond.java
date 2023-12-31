import java.util.Scanner;

public class diamond{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter number of row: ");
	int row = scanner.nextInt();

	for (int i = 1; i <= row; i++){
		for(int j = i; j <= row; j++){
			System.out.print(" ");
		}
		for(int j = 1; j <= i; j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for (int i = row - 1; i >= 1; i--){
		for(int j = i; j <= row; j++){
			System.out.print(" ");
		}
		for(int j = 1; j <= i; j++){
			System.out.print("* ");
		}
		System.out.println();
	}
	
	}
}