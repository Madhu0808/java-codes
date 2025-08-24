import java.util.Scanner;

public class product {
    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = Sc.nextInt();
        System.out.println("Enter your number");
        int b = Sc.nextInt();
        int product = multiply(a,b);
        System.out.println(product);
    }
}
