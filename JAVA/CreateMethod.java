public class CreateMethod{
public static void main(String[] args){
name("Lawal", 10000);
String value = test("Jumong");
System.out.println(value);


Owner myOwn = new Owner();
myOwn.name = "Lawal Toheeb";
myOwn.age = 5;
System.out.println(myOwn.name);
}

private static void name(String name, int salary) {
	System.out.printf("Welcome Mr. %s your starting salary is $%d dollar%n", name, salary);
}

public static String test(String name){
	return name;
}
}
