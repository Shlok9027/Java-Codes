package Arrarys;

import java.util.Scanner;

public class MatrixAsInput {
    public static void main(String[] args) {

        // Take  a matrix as a input  rom the user . Search for a  given number x and  print the indices at which it occurs.

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();

        for ( int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){

                //commparing with x

                if(numbers[i][j] == x){
                    System.out.println("x found at location ("  +  i  + " , "  +  j + ")");
                }
            }
        }

    }
}
