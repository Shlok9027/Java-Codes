package Patterns;

public class SolidRhombus {
    public static void main(String[] args) {

        // print the solid rhombus pattern
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            // star
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
