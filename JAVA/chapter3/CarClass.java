public class CarClass{
   private String model;
   private String year;
   private double price;

public CarClass(String model, String year, int price){
   this.model = model;
   this.year = year;
   this.price = price;
}

public void setModel(String model){
   this.model = model;
}
public String getModel(){
   return model;
}

public void setYear(String year){
   this.year = year;
}
public String getYear(){
	return year;
}

public void setPrice(double price){
   if (price > 0.0){
   this.model = model;
}
}
public double getPrice(){
   	return price;
}


}