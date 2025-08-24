public class raintbwtwounits {
    public  static int maxRainwaterbwtwopoints(int height[]) {
        int n = height.length;
        int maxArea = 0;
        for( int i = 0;i<n;i++){
            for(int j= i+1;j<n;j++){
                int h = Math.min(height[i], height[j]);
                int w = j-i;
                int currArea = h*w;
                maxArea = Math.max(maxArea, currArea);
            }
            return maxArea;
        }
        return 0;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxRainwaterbwtwopoints(height));
    }
}
