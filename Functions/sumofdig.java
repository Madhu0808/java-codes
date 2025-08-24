
import java.util.Scanner;

public class sumofdig {
    public static void sumOfdigits(int number) {
        int num = number;
        int sumofdigits = 0;
        while (num>0){
            int lastdigit = num % 10;
            sumofdigits = sumofdigits + lastdigit;
            num = num / 10;
        }
        System.out.println("Sum of digits of an integer is :" +sumofdigits);
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = Sc.nextInt();
        sumOfdigits(number);
    }
}
