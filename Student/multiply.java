package Student;

import java.util.Scanner;

public class multiply {

    // Make a function to multiply 2 numbers and return the product

    public static int calculateProduct(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of two integer is " + calculateProduct(a, b));

    }
}
