package Patterns;

import java.util.Scanner;

public class HalfPyr {
    public static void main(String[] args) {
        
        //Print the Half Pyramid Star Pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         
        for (int i = 1 ; i <= n; i ++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
