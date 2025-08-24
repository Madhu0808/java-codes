public class rainusingtwopointwrs {
    public static int rainUsingtwopointers(int height[]) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxArea = 0;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int w = r-l;
            int currArea = h*w;
            maxArea = Math.max(maxArea, currArea);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(rainUsingtwopointers(height));
    }
}
