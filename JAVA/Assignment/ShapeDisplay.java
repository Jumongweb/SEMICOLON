public class ShapeDisplay {
    public static void main(String[] args) {
        displayBox();
        System.out.println(); // Add a newline for separation
        displayOval();
        System.out.println(); // Add a newline for separation
        displayArrow();
        System.out.println(); // Add a newline for separation
        displayDiamond();
    }

    // Method to display a box
    private static void displayBox() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to display an oval
    private static void displayOval() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((j == 1 || j == 10) && (i != 1 && i != 5)) {
                    System.out.print(" *");
                } else if ((i == 1 || i == 5) && (j > 1 && j < 10)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method to display an arrow
    private static void displayArrow() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to display a diamond
    private static void displayDiamond() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
