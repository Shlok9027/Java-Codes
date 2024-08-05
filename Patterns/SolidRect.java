package Patterns;

import java.util.Scanner;

public class SolidRect {
    public static void main(String[] args) {

        // Print the Solid Rectangle Star pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int n = 5;
        // int m = 5;

        // inner Loop
        for (int i = 1; i <= n; i++) {

            // Outer Loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

}
