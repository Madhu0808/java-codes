package loops;

import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n == 2) {
            System.out.println("n is a prime");
        }
        else{
            boolean isPrime = true ;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
            isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Number is prime");
        }else{
            System.out.println("given number is not a prime");
        }
        }
    }
   
}

