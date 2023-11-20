public class SchoolTest{
public static void main(String[] args){

	School school = new School();
	school.setSchoolName("Semicolon");
	String name = school.getSchoolName();
	
	school.setNumberOfStudent(40);	
	int numberOfStudent = school.getNumberOfStudent();

	System.out.println(name);
	System.out.println(numberOfStudent);
	
	
}

}