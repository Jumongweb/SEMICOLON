import java.util.Scanner;

public class Result{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int count= 1;
int passes = 0;
int fails = 0;

while (count <= 10){
	System.out.printf("person%d 1 for pass and 2 for fail: ", count);
	int result = scanner.nextInt();
	if (result == 1)
		passes++;
	else if(result == 2)
		fails++;
	else if (result > 2){
		System.out.println("Invalid");
		count--;
	}
	count++;
}  		

if (passes >= 8)
	System.out.println("Bonus to instructor");
System.out.printf("Number of passes is %d%n", passes);
System.out.printf("Number of failure is %d%n", fails);

													
}	
}