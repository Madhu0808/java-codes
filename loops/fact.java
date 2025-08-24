package loops;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.println("Enter any positive num");
        num = Sc.nextInt();
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("The factorial of a given number is :" +fact);
    }
}
