class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int ans = 0;
        int diff = 0;
        while(l<r && r<prices.length){
            if(prices[r]>prices[l]){
                diff = prices[r]-prices[l];
                ans = Math.max(ans, diff);
            }
            else if(prices[r]<prices[l]) l++;
            if(r==prices.length-1) l++;
            else r++;
        }
        return ans;
    }
}
