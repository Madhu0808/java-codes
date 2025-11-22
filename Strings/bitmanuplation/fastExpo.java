package Strings.bitmanuplation;

public class fastExpo {
    public static int fastExponentiation(int a, int n, int mod){
        int ans = 1; 
        a= a%mod;
        while (n > 0){
            if ((n & 1) != 0) {
                ans = (a*ans) % mod;
            }
            a = (a*a) % mod;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponentiation(15, 1,4));
    }
}
