public class TimeTable{
    public static void main(String[] args) {
	for (int row = 1; row <= 12; row++){
		for (int column = 1; column <= 12; column++){
			System.out.printf("%-2d x %-2d = %-2d\t", column, row, row * column);	
		}
		System.out.println();
	}
    }

}
