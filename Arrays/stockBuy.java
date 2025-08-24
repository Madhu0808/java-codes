public class stockBuy {
    public static int buyAndsellstocks(int[] stockPrice){
        int n = stockPrice.length;
            int buyPrice = Integer.MAX_VALUE;
            int maxprofit = 0;
            for (int i = 0; i < n; i++) {
                if(buyPrice < stockPrice[i]){
                    int profit = stockPrice[i] - buyPrice; // todays profit
                    // System.out.println("Todays profit is "+ profit);
                    maxprofit = Math.max(profit, maxprofit);
                } else{
                    buyPrice = stockPrice[i];
                }
            }
            return maxprofit;
    }
    public static void main(String[] args) {
        int stockPrice[] = {7, 6, 4,  3, 2, 1};
        System.out.println(buyAndsellstocks(stockPrice)+" IS THE MAX PROFIT");
    }
}
