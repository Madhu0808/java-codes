public class dectobin {
    public static void dectobin(int decNum) {
        int myDec = decNum;
        int pow = 0;
        int binNum =0;
        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum/=2;
        }
        System.out.println("binary of" +myDec+"=" +binNum);
    }
    public static void main(String[] args) {
        dectobin(15);
    }
}
