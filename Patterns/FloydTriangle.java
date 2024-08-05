package Patterns;

public class FloydTriangle {
    public static void main(String[] args) {
        //print the Floyd's Triangle Pattern
        int n = 5;
        int num = 1;

        // outer Loop
        for (int i = 1; i <= n; i++) {
            // inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
