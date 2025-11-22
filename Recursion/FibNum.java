package Recursion;
public class FibNum{

    public static int FiboNum(int n){
        if(n == 0 || n ==1){
            return n;
        }
        return FiboNum(n-1) + FiboNum(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FiboNum(5));
    }
}