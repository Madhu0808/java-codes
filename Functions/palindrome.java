import java.util.Scanner;

public class palindrome {
   
        public static boolean isPalindrome(int number) {
            int palindrome = number;
            int reverse = 0;
            while (palindrome != 0){
                int remainder = palindrome % 10;
                reverse = (reverse * 10) + remainder;
                palindrome /= 10;
            }
            if (reverse == number){
                return true;
            } else {
                return false;
            }
        }
        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter your number :");
            int number = Sc.nextInt();
            Sc.close();
            if(isPalindrome(number)){
                System.out.println(number  + "Number is a palindrome");
            } else {
                System.out.println(number  + " Not a palindrome ");
            }
        }
}
