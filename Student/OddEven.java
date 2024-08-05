package Student;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("it is Odd Number");
        }
    }
    
}
