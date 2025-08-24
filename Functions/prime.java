// import java.util.*;
public class prime{
    public static boolean  isPrime(int n) {
        // corner classes
        if(n == 2){
            // boolean isPrime = true;
            return true;
        }
        // boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


    // Primes in ranges
    public static void main(String[] args) {
        // System.out.println(isPrime(2));
        primesInRange(30);
    }
    public static void primesInRange(int n) {
        for(int i = 2; i<=n;i++){
            if(isPrime(i)){ 
                            System.out.print(i+" ");
                        }
                    }         
                }
            }