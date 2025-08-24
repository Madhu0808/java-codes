public class kadanes {
    public static void Kadanes(int numberrs[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<numberrs.length;i++){
            cs = cs+numberrs[i];
            ms = Math.max(cs,ms);
            if(cs < 0){
                cs = 0;
            }
           
        }
            System.out.println(ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-10, -5, -2, -8 };
        Kadanes(numbers);
    }
}
