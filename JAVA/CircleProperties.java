public class CircleProperties {
    public static void main(String[] args) {
     
        double radius = 2.0;

       double pi = 3.14159;

	double diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);

        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
