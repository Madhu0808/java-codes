package Strings.bitmanuplation;

public class GetSet {
    public static int getIthBit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask) != 1){
            return 1;
        } else {
            return 0;
        }
    }
    public static int setIthBit(int n , int i) {
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n , int i) {
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n, int i, int NewBit) {
        // if(NewBit == 0){
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = NewBit<<i;
        return n | bitmask;
    }
    public static int clearLastiBits(int n, int i){
        int bitmask = ((~0)<<i);
        return n & bitmask;
    }
    public static int ClearRangeofBits(int n, int i, int j){
        int a = (~0) << (j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }
    
    public static void main(String[] args) {
        System.out.println(ClearRangeofBits(10,2,4));
    }
}
