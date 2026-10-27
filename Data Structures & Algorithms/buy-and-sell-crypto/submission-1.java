class Solution {
    public int maxProfit(int[] prices) {
       int l =0 ,r=1;
       int res=0;
       int n=prices.length;
       while(r<n){
        if(prices[l] < prices[r]){
            int profit = prices[r] - prices[l];
            res = Math.max(res, profit);
        }else{
            l=r;
        }
        r++;
       
       }
       return res;

    }
}
