public class sssort {
    public static void sssort(int arr[]) {
        int n = arr.length;
        for (int i =0 ;i<n-1;i++){
            int maxposindex = 0;
            for(int j = 0;j<=n-1-i;j++){
                if(arr[j] < arr[maxposindex]){
                    maxposindex = j;
                }
            }
             //swap
        int temp = arr[n-1-i];
        arr[n-1-i] = arr[maxposindex];
        arr[maxposindex] = temp;
        } 
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        sssort(arr);
        print(arr);
    }
}
