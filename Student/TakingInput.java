package Student;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String name =  sc.nextLine();
        System.out.println("Hello I am  " +  name );

        int a = sc.nextInt();
        System.out.println("i am " + a + " year old");
    }
 }