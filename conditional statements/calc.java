import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Value of A");
        int A = Sc.nextInt();
        System.out.println("Enter Value of B");
        int B = Sc.nextInt();
        System.out.println("Enter the symbol of operation");
        char operator = Sc.next().charAt(0);
        

        switch (operator){
            case '+' : System.out.println(A+B);
            break;
            case '*' : System.out.println(A*B);
            break;
            case '-' : System.out.println(A-B);
            break;
            case '%' : System.out.println(A%B);
            break;
            case '/' : System.out.println(A/B);
            break;
            default : System.out.println("Wrong operator");
        }
    }
}
