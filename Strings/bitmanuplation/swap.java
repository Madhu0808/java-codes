package Strings.bitmanuplation;

public class swap {
    public static int[] swapWithoutThirdV(int arr[], int a , int b ) {
        // a = a^b;
        // b = a^b; 
        // a = a^b;
        // a = a*b;
        // b= a/b;
        // a=a/b;
        // a = a+b;
        // b = a-b;
        // a= a-b;
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
        return arr;
    }
    // Swap two standalone numbers using XOR in-place and print directly
    public static void swapAndPrint(int a, int b) {
        System.out.println("Before swap: A = " + a + ", B = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap: A = " + a + ", B = " + b);
    }
    public static void main(String[] args) {
        int arr[]= {3,5}; 
        int result[] = swapWithoutThirdV(arr, 0, 1);
        System.out.println("A = "+ result[0] +", B = "+result[1]);
        int a = 3, b = 5;
        swapAndPrint(a, b);
    }
}
