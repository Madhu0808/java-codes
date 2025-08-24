import java.util.*;
public class Function{
    public static int sum(int a, int b){
           int sum = a+b;
          
            return sum;
            
        }
        public static void main(String args[]){
            Scanner Sc = new Scanner(System.in);
            int a =Sc.nextInt();
            int b =Sc.nextInt();
             int Sum = sum(a,b);
             System.out.println(Sum);
    }
}