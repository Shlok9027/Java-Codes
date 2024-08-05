package Arrarys;

import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for ( int i = 0; i < n; i++){
            for (int j = 0; j < m; m++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(" The Spiral of matrix is ");
        int rowsStart = 0;
        int rowsEnd = n-1;
        int colsStart = 0;
        int colsEnd = m-1;

        //To  print spiral order  matrix 

    }
}
