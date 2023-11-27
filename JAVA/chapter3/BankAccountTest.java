import java.util.Scanner;

public class BankAccountTest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
BankAccount bankAccount1 = new BankAccount("Lawal", 5500.0);
BankAccount bankAccount2 = new BankAccount("Jumong", -50.5);

//System.out.print("Enter your balance: ");
//double balance = scanner.nextDouble();

// bankAccount.setName(account_name);
// System.out.printf("Welcome %s %n",bankAccount1.getName());
// System.out.printf("Welcome %s %n", bankAccount2.getName());

System.out.printf("%s Initial balance is %.2f%n", bankAccount1.getName(), bankAccount1.getBalance());
System.out.printf("%s Initial balance is %.2f%n", bankAccount2.getName(), bankAccount2.getBalance());

System.out.print("Enter deposit amount for account1: ");
double deposit1 = scanner.nextDouble();

System.out.printf("adding %.2f to account1 balance%n", deposit1);
//double balance1 = bankAccount1.getBalance();
bankAccount1.deposit(deposit1);

System.out.printf("%s balance: $%.2f%n", bankAccount1.getName(), bankAccount1.getBalance());
System.out.printf("%s balance: $%.2f%n", bankAccount2.getName(), bankAccount2.getBalance());

System.out.print("Enter deposit amount for account2: ");
double deposit2 = scanner.nextDouble();
System.out.printf("adding %.2f to account2 balance%n", deposit2);
bankAccount2.deposit(deposit2);

System.out.printf("%s balance is $%.2f %n", bankAccount1.getName(), bankAccount1.getBalance());
System.out.printf("%s balance is $%.2f %n", bankAccount2.getName(), bankAccount2.getBalance());

System.out.printf("%s would you like to withdraw. yes or no: ", bankAccount1.getName());
String withdraw = scanner.next();
if (withdraw.equals("yes")){
	System.out.printf("How much would you like to withdraw: ");
	double withdrawAmount1 = scanner.nextInt();
	bankAccount1.withdraw(withdrawAmount1);
  }
  else if (withdraw.equals("no"))
	System.out.printf("Thanks for banking with us%n");

System.out.printf("%s balance is $%.2f %n", bankAccount1.getName(), bankAccount1.getBalance());
System.out.printf("%s balance is $%.2f %n", bankAccount2.getName(), bankAccount2.getBalance());

System.out.printf("%s would you like to withdraw. yes or no: ", bankAccount2.getName());
String withdraw2 = scanner.next();
if (withdraw2.equals("yes")){
	System.out.printf("How much would you like to withdraw: ");
	double withdrawAmount2 = scanner.nextInt();
	bankAccount2.withdraw(withdrawAmount2);
  }
  else if (withdraw2.equals("no"))
	System.out.printf("Thanks for banking with us%n");

System.out.printf("%s balance is $%.2f %n", bankAccount1.getName(), bankAccount1.getBalance());

System.out.printf("%s balance is $%.2f %n", bankAccount2.getName(), bankAccount2.getBalance());

}
}
