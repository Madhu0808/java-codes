public class news {
    public static void sssort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxposindex = i;  // Start searching from index 'i'
            for (int j = i + 1; j < n; j++) { // Scan the whole unsorted part
                if (arr[j] < arr[maxposindex]) {
                    maxposindex = j;
                }
            }
            // Swap the found maximum element with arr[i]
            int temp = arr[i];
            arr[i] = arr[maxposindex];
            arr[maxposindex] = temp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        sssort(arr);
        print(arr);  // Expected Output: 5 4 3 2 1
    }
}
