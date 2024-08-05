package Loops;

import java.util.*;

public class Table {
    public static void main(String[] args) {
//write a progarm to print the table of a number input by the user

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(n*i);
        }
    }
}
