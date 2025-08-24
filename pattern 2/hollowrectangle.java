public class hollowrectangle {
    public static void hallowrectanglepattern(int totcols, int totrows) {
    for(int i = 1; i<=totrows; i++){
        for(int j = 1; j<=totcols;j++){
            if(i == 1 || i == totrows || j == 1 || j == totcols){
                System.err.print("*");
            } else {
                System.err.print(" ");
            }
        }
        System.err.println("");
    }
}
    public static void main(String[] args) {
        hallowrectanglepattern(4, 5);
    }
}
