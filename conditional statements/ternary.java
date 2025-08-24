import java.util.*;
public class ternary {
    public static void main(String args[]) {
        Scanner Sc= new Scanner (System.in);
        System.out.println("Enter your marks");
        int marks = Sc.nextInt();
        String reportcard = (marks>=33)? "PASS" : "FAIL";
        System.out.println(reportcard);
    }
}
