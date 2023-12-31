public class AutoPolicyTest{
	public static void main(String[] args){
	AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NY");
	AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
	
	System.out.println("The auto policy: ");
	System.out.println("Account #: " + policy1.getAccountNumber());
	System.out.println("Car: " + policy1.getMakeAndModel());
	System.out.printf("State %s %s a noFault state", policy1.getState(), (policy1.isNoFaultState() ? " is" : "is not"));

	System.out.println("The auto policy: ");
	System.out.println("Account #: " + policy2.getAccountNumber());
	System.out.println("Car: " + policy2.getMakeAndModel());
	System.out.printf("State %s %s a noFault state", policy1.getState(), (policy2.isNoFaultState() ? " is" : "is not"));
	}
}