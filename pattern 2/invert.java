public class invert{
    public static void inverted_rotated(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.err.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.err.print("*");
            }
            System.out.println("");
        }
    }
public static void main(String[] args){
    inverted_rotated(4);
}
}