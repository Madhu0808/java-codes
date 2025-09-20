package twoD;

import javax.xml.stream.events.EndDocument;

public class Sprial {
    public static void PrintSpiral(int[][]matrix){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length-1;
        int EndCol = matrix[0].length-1;
        while( StartCol <= EndCol && StartRow <= EndRow){
        //Top print
        for(int i=StartCol; i<=EndCol; i++){
            System.out.print(matrix[StartRow][i]+" ");
        }

        //Right Print
        for(int j=StartRow+1; j<=EndRow; j++){
            System.out.print(matrix[j][EndCol]+" ");
        }

        //Bottom Print

        for(int i=EndCol-1; i>=StartCol; i--){
            if(StartRow == EndRow){
                break;
            }
            System.out.print(matrix[EndRow][i]+" ");
        }

        //Left Print
        for(int j=EndRow-1; j>=StartRow+1; j--){
            if(StartCol == EndCol){
                break;
            }
            System.out.print(matrix[j][StartCol]+" ");
        }

        StartCol++;
        EndCol--;
        StartRow++;
        EndRow--;
    }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        PrintSpiral(matrix);
    }
}
