import java.util.Arrays;

public class trappingRainwater{
    public static int trappingWater(int height[]){
        int n = height.length;
        //left max boundary
        int leftmaxboundary[] = new int [n];
        leftmaxboundary[0] = height[0];
        for (int i=1;i<n;i++){
            leftmaxboundary[i] = Math.max(height[i], leftmaxboundary[i-1]);

        } 
        //right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--){
            rightmax[j] = Math.max(height[j],rightmax[j+1] );
        }
        int trappedrainwater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterlevel = min(leftmax , rightmax)
            int waterlevel = Math.min(rightmax[i], leftmaxboundary[i]);
            //trappedrainwater = waterlevel - height[i]
            trappedrainwater += waterlevel - height[i]; 
        }
        return trappedrainwater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}; 
        System.out.println(trappingWater(height));
    }
}