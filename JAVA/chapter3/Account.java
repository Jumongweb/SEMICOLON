public class Account{
private String name;
private int balance;

public Account(String name, int balance){
this.name = name;
if (balance > 0.0){
	this.balance = balance;
}
}

public String getName(){
	return name;
}
public void setName(String name){
	this.name = name;
}
public double getBalance{
	return balance;
}

public void depositCash(double deposit){
	if (deposit > 0.0){
		this.balance = deposit + balance;
}
}

}