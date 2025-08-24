import java.util.*;
public class evennpq {
    public static boolean isEven(int a) {
       if(a % 2 == 0){
        return true;
       }
       else {
        return false;
       }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your choice :");
        int a = Sc.nextInt();

       if(isEven(a)){
        System.out.println("number is even");
       } else {
        System.out.println("number is odd");
       }
    }
}
