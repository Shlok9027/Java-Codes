package Student;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // if (button == 1) {
        //     System.out.println("Hello");
        // } else if (button == 2) {
        //     System.out.println("Namaste");
        // } else if (button == 3) {
        //     System.out.println("Namaskar");
        // } else {
        //     System.out.println("Invalid Button");
        // }
        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Namaskar");
            break;
            default :System.out.println("Invalid Button");
        }
    }
}
