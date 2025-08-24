import java.util.*;
public class factorial {
    public static int fact() {
        int fact = 1;
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String[] args) {
       fact();
       
    }
}
