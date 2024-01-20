public class TimeTable2 {
    public static void main(String[] args) {
        for (int row = 1; row <= 12; row++) {
            for (int column = 1; column <= 12; column++) {
                System.out.printf("%d x %d = %d\t", column, row, row * column);
            }
            System.out.println();
        }
    }
}
