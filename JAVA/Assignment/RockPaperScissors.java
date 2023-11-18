import java.util.Scanner;
public class RockPaperScissors{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.print("Enter player one name: ");
String playerOneName = scan.nextLine();
System.out.print("Enter player two name: ");
String playerTwoName = scan.nextLine();

System.out.printf("%s enter a number 0, 1 or 2: ", playerOneName);
int playerOneNumber = scan.nextInt();
System.out.println(playerOneNumber);

System.out.printf("%s enter a number 0, 1 or 2: ", playerTwoName);
int playerTwoNumber = scan.nextInt();
System.out.println(playerTwoNumber);

if (playerOneNumber == 0 && playerTwoNumber == 0)
System.out.print("Tie");
if (playerOneNumber == 0 && playerTwoNumber == 1)
System.out.printf("%s won %s", playerTwoName, playerOneName);
if (playerOneNumber == 0 && playerTwoNumber == 2)
System.out.printf("%s won %s", playerOneName, playerTwoName);

if (playerOneNumber == 1 && playerTwoNumber == 0)
System.out.printf("%s won %s", playerOneName, playerTwoName);
if (playerOneNumber == 1 && playerTwoNumber == 1)
System.out.print("Tie");
if (playerOneNumber == 1 && playerTwoNumber == 2)
System.out.printf("%s won %s", playerTwoName, playerOneName);


if (playerOneNumber == 2 && playerTwoNumber == 0)
System.out.printf("%s won %s", playerTwoName, playerOneName);
if (playerOneNumber == 2 && playerTwoNumber == 1)
System.out.printf("%s won %s", playerOneName, playerTwoName);
if (playerOneNumber == 2 && playerTwoNumber == 2)
System.out.print("Tie");


}
}