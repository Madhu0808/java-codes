package loops;

import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(+ n +" * " + i + "=" +n*i);
        }
    }
}
