import java.util.Scanner;

public class TrianglePerimeter{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("Enter first edge: ");
int edge1 = scanner.nextInt();

System.out.print("Enter second edge: ");
int edge2 = scanner.nextInt();

System.out.print("Enter third edge: ");
int edge3 = scanner.nextInt();
int perimeter = edge1 + edge2 + edge3;

int firstTwoEdge = edge1 + edge2;
int secondTwoEdge = edge2 + edge3;
int thirdTwoEdge = edge3 + edge1;

if (firstTwoEdge > edge3 && secondTwoEdge > edge1 && thirdTwoEdge > edge2){
	System.out.printf("The perimeter is %d", perimeter);		
}
else{
System.out.println("Invalid input");
}

}
}