package twoD.Pratice;
import java.util.*;
// public class Seven {
//     public static void SevenCount(int matrix[][], int key){
//         int count = 0;
//         for (int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if (key == matrix[i][j]) {
//                     count++;
//                     System.out.println(i+","+j);
//                 }
//             }
//         }
//         System.out.println("number of times appear "+count);
//     }
// public class sum{
//     public static void SumOfSecond(int matrix[][]){
//         int sum = 0;
//             for(int j=0; j<matrix[0].length; j++){
//                 sum+= matrix[1][j];
//             }
//         System.out.println(sum);
//     }
    public class sum{
        public static void Transpose(int matrix[][]) {
            int Transpose[][] = new int [matrix[0].length][matrix.length];
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    Transpose[j][i] = matrix[i][j];
                }
            }
            for(int i=0; i<Transpose.length; i++){
                for(int j=0; j<Transpose[0].length; j++){
                    System.out.print(Transpose[i][j]+" ");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        int key = 7;
        int matrix[][] = new int [2][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               matrix[i][j] = sc.nextInt();
            }
        }
        // SevenCount(matrix, key);
        // SumOfSecond(matrix);
        Transpose(matrix);
    }
}
