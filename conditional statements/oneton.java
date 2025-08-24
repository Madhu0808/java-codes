import java.util.*;
public class oneton {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = Sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
