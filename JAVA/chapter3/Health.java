public class Health{
	private String firstName;
	private String lastName;
	private String gender;
	private int year;
	private int month;
	private int day;
	private double height;
	private double weight;

public Health(String firstName, String lastName, String gender, int year, int month, int day, double height, double weight){
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.year = year;
	this.month = month;
	this.day = day;
	this.height = height;
	this.weight = weight;	
}

public void setFirstName(String firstName){
	this.firstName = firstName;
}
public void setLastName(String lastName){
	this.lastName = lastName;
}
public void setGender(String gender){
	this.gender = gender;
}
public void setYear(int year){
	this.year = year;
}
public void setMonth(int month){
	this.month = month;
}
public void setDay(int day){
	this.day = day;
}
public void setHeight(double height){
	this.height = height;
}
public void setWeight(double weight){
	this.weight = weight;
}

public String getFirstName(){
	return firstName;
}
public String getLastName(){
	return lastName;
}
public String getGender(){
	return gender;
}
public int getYear(){
	return year;
}
public int getMonth(){
	return month;
}
public int getDay(){
	return day;
}
public double getHeight(){
	return height * 12;
}
public double getWeight(){
	return weight;
}
public int getAge(){
	int currentYear = 2023;
	int age = currentYear - getYear();
	return age;
}
public double MaximumHeartRate(){
	double maxHeartRate = (220 - getAge()) * (85.0 / 100);
	return maxHeartRate;
}
public double targetHeartRate(){
	double targetRate = (220 - getAge()) * (50.0 / 100);
	return targetRate;
}
public double BMI(){
	double bodyMass = (getWeight() / (getHeight() * getHeight()));
	return bodyMass;
}

	
}