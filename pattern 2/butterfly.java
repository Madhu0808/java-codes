public class butterfly {
    public static void butterFly(int n) {
        // no of lines 
        for (int i = 1; i <= n; i++) {
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //invert
        for(int i=n;i>=1;i--){
             // stars
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        butterFly(5);
    }
}
