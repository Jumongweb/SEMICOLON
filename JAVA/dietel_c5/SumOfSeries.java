public class SumOfSeries {
    public static void main(String[] args) {
        System.out.printf("%s%10s%n", "n", "Sum");
	
	int sum = 0;
	for(int n = 1; n <= 100; n++){
		sum += n;
		System.out.printf("%-5d%-20d%n", n, sum);
	}
    }
}
