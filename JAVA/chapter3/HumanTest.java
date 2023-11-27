public class HumanTest{
public static void main(String[] args){

Human human = new Human();

human.setName("General");
human.setAge(21);

String name = human.getName();
int age = human.getAge();

System.out.println(name);
System.out.println(age);

}
}