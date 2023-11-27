public class PetrolPurchase{
	private String location;
	private String type;
	private double quantity;
	private double perLitre;
	private double percentage;

public PetrolPurchase(String location, String type, int quantity, double perLitre, double percentage){
	this.location = location;
	this.type = type;
	this.quantity = quantity;
	this.perLitre = perLitre;
	this.percentage = percentage;
}
public void setLocation(String location){
	this.location = location;
}
public String getLocation(){
	return location;
}

public void setType(String type){
	this.type = type;
}
public String getType(){
	return type;
}

public void setQuantity(double quantity){
	this.quantity = quantity;
}
public double getQuantity(){
	return quantity;
}

public void setPerLitre(double perLitre){
	this.perLitre = perLitre;
}
public double getPerLitre(){
	return perLitre;
}

public void setPercentage(double percentage){
	this.percentage = percentage;
}
public double getPercentage(){
	return percentage;
}

public double getNetPurchase(){
	double purchase = quantity * perLitre;
	double litrePercentage = purchase * (percentage / 100);
	double netPurchaseAmount = purchase - litrePercentage;
	return netPurchaseAmount;
}

}
