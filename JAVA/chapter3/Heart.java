public class Heart{
	private String firstName;
	private String lastName;
	private int year;
	private int month;
	private int day;
public Heart(String firstName, String lastName, int year, int month, int day){
	this.firstName = firstName;
	this.lastName = lastName;
	this.year = year;
	this.month = month;
	this.day = day;
}

public void setFirstName(String firstName){
	this.firstName = firstName;
}
public void setLastName(String lastName){
	this.lastName = lastName;
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

public String getFirstName(){
	return firstName;
}
public String getLastName(){
	return lastName;
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
public int getAge(){
	int currentYear = 2023;
	int age = currentYear - getYear();
	
	
	return age;
}

public double getMaximumHeartRate(){
	double maxHeartRate = (220 - getAge()) *(85.0 / 100);	
	return maxHeartRate;
}
public double getTargetHeartRate(){
	double minHeartRate = (220-getAge()) * (50.0 / 100);	
	return minHeartRate;
}



}