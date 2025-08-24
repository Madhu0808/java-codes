import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner (System.in)) {
            int n =Scanner.nextInt();
            if(n%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("number is odd");
            }
        }
    }
}