import java.util.Scanner;
public class AccountTest{
public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter account name: ");
  String inputName = scanner.nextLine();
  Account account = new Account();
	System.out.printf("Initial account name is %s%n", account.getName());
  account.setName(inputName);
 String account_name = account.getName(); 
System.out.printf("Account name is %s", account_name);
}
}