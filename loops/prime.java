package loops;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
        }
         if(isPrime==true){
                System.out.println(n+ "number is prime");
            }
         if(isPrime==false){
                System.out.println(n+ "is notprime");
            }
        }
}
