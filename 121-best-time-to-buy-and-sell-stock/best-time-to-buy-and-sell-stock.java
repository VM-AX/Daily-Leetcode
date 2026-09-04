class Solution {
    public int maxProfit(int[] prices) {
        int maxprice = 0;
        int minprice =prices[0];
        

        for(int i=1;i<prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
             int profit =  prices[i] - minprice;
            
        maxprice = Math.max(maxprice, profit);
        }
        return maxprice;
    }
}