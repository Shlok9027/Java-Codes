package Patterns;

public class InvHalfPyr {
    public static void main(String[] args) {

        // Print the Inverted Half pyramid (rotated by 180 deg) star Pattern

        int n = 4;

        // inner Loop

        for (int i = 1; i <= n; i++) {
            // inner loop -> Space Print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print Star
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
