package Student;

import java.util.Scanner;

public class Larger {
    public static int findGreather(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Greather of 2 Number is " +(findGreather(a, b)) );

    }
}
