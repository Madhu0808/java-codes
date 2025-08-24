import java.util.*;
public class largestthree {
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            int C = Sc.nextInt();
            if((A>B) && (A>=C)){
                System.out.println("A");
            }
            else if(B>=C){
                System.out.println("B");
            }
            else{
                System.out.println("c");
            }
        }

    }
}
