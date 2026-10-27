class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit=0;
        int n = prices.length;
        for(int i = 1; i < n ; i++){
            if(buyprice > prices[i]){
                buyprice= prices[i];
            }
            profit=Math.max(profit, prices[i]-buyprice);
        }
        return profit;
    }
}
