package Patterns;

import java.util.Scanner;

public class HollowRect {
    public static void main(String[] args) {

        // Print the Hollow rectangle Star Pattern

        // int n = 4;
        // int m = 5;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Outer Loop

        for (int i = 1; i <= n; i++) {

            // inner Loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i, j)

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
