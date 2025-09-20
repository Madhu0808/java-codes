package twoD;

public class Staircase {
    public static void StairCasesSearch(int matrix[][], int key){
        int row = 0; int col = matrix[0].length-1;

        while(row<matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key Found at "+row +"," +col);
                return;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("not found");
    }
    public static void main(String[] args) {
        int key = 8;
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        StairCasesSearch(matrix,key);
    }
}
