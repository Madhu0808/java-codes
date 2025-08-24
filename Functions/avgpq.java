import java.util.Scanner;

public class avgpq {
    public static void avgNum() {
       try (Scanner Sc = new Scanner (System.in)) {
        System.out.println("Enter num 1");
            int a = Sc.nextInt();
            System.out.println("enter num 2");
            int b = Sc.nextInt();
            System.out.println("enter num 3");
            int c = Sc.nextInt();
           Sc.close();
            double numSum = a+b+c;
            double avgNum = numSum/3;
            System.out.println("Average of 3 numbers is :" +avgNum);
    }
    }
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner (System.in)) {
            System.out.println("Enter num 1");
                int a = Sc.nextInt();

                System.out.println("enter num 2");
                int b = Sc.nextInt();

                System.out.println("enter num 3");
                int c = Sc.nextInt();

               Sc.close();
               
                double numSum = a+b+c;
                double avgNum = numSum/3;
                System.out.println("Average of 3 numbers is :" +avgNum);
        }
    }
}