public class ArrayOne {
    public static boolean duplicateElements(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i] == array[j]){
                    return true;
                } 
            
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,1};
        System.out.println(duplicateElements(array));
    }
}
