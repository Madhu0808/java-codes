package Strings.bitmanuplation;

public class OddOrEven {
    public static void OddOrrEven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        OddOrrEven(12);
    }
}
