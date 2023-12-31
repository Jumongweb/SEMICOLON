public class IntegerDivisibleBy3{
	public static void main(String[] args){
		int sum = 0;
		for (int i = 1; i < 30; i++){
			if (i % 3 == 0){
				sum += i;
			}
		}
		System.out.println("Sum of integers divisible by 3 is: " + sum); 
	}
}