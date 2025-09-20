package twoD;

import java.util.Scanner;

public class Creation {
    public static boolean Largest(int  matrix[][], int key) {
        int n = matrix.length; int m = matrix[0].length;
        int LargestNum = Integer.MIN_VALUE;
        int SmallestNum = Integer.MAX_VALUE;
        boolean Found = false;

        for(int i=0;  i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j] > LargestNum){
                    LargestNum = matrix[i][j];
                }
                if(matrix[i][j] < SmallestNum){
                    SmallestNum = matrix[i][j];
                }
                if(matrix[i][j] == key){
                    System.out.println("Found at cell ("+i+" , "+j+")" );
                    Found = true;
                    
                }
            }
            
        }
        
        System.out.println("The largest number in the 2d array is " + LargestNum );
        System.out.println("The smallest number in the 2d array is " + SmallestNum );
        return Found;
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int key = 5;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean result = Largest(matrix, key);
        System.out.println("Key Found?" +result);
    }
}
