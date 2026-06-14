class Solution {
    int dp[];
    public int count(int[] coins, int amount){
        if(amount==0) return 0;
        if(dp[amount]!=Integer.MIN_VALUE) return dp[amount];
        int res = Integer.MAX_VALUE;
        for(int c: coins){
            if(c<=amount){
                int sub = count(coins, amount-c);
                if(sub!=-1){
                    res = Math.min(res, 1 + sub);
                }
            }
        }
        return dp[amount] = (res==Integer.MAX_VALUE?-1:res);
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        return count(coins, amount);
    }
}
