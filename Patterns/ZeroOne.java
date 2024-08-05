package Patterns;

public class ZeroOne {
    public static void main(String[] args) {

        // Print the 0 - 1 Pattern

        int n = 5;
        // Outer Loop

        for (int i = 1; i <= n; i++) {
            // inner Loop

            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { // even
                    System.out.print("1 ");

                } else { // Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
