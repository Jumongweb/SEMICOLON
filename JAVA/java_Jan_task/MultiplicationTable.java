import java.util.Scanner;

public class multiplicationTable{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a number an get its multiplication table: ");
	int number = scanner.nextInt();
	
	while (number < 1){
		System.out.println("Enter number from 1 upward: ");
		System.out.print("Enter a number an get its multiplication table: ");
		number = scanner.nextInt();
	}
	
	for (int count = 0; count <= 12; count++){
		System.out.printf("%d x %d = %d%n",number, count, number * count); 
	}
    }
}