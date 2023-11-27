public class BankAccount{
  private String name;
  private double balance;

public BankAccount(String name, double balance){
  this.name = name;
  if (balance > 0.0){
  this.balance = balance;
}
}

public void deposit(double depositAmount){
  if (depositAmount > 0.0){
  balance = depositAmount + balance;
}
}

public void withdraw(double withdrawAmount){
  if (withdrawAmount <= balance){
   balance = balance - withdrawAmount ;
  } else{
	System.out.println("Insufficient fund");
}
}


public void setName(String name){
  this.name = name;
}

public String getName(){
  return name;
}

public double getBalance(){
  return balance;
}

}