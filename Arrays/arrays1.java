public class arrays1 {
    public static int linearSearchMenu(String menu[], String key) {
        for(int i=0;i < menu.length;i++){
            if( menu[i] == key){
                return i;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"dosa", "puri", "chole", "idly", "wada"};
        String key = "chole";
        int index = linearSearchMenu(menu, key);
        if( index == -1 ){
            System.out.println("Item not available");
        } else {
            System.out.println("The item available at " + index );
        }
    }
}
