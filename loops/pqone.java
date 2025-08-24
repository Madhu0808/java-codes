package loops;

import java.util.Scanner;

public class pqone {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
            int number;
            int choice;
            int evenSum = 0;
            int oddSum = 0;
            do{
                number = Sc.nextInt();
                if(number % 2 ==0){
                    evenSum += number;
                }else{
                    oddSum += number;
                }System.out.println("To continue press 1 or else presss 0");
                choice = Sc.nextInt();
            }while(choice==1);
            System.out.println("sum of even numbers is " +evenSum);
            System.out.println("sum of odd numbers is " +oddSum);
     }
      
 }