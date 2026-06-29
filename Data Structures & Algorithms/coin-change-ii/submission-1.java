class Solution {
    public int count(int amount, int[] coins, int i,int memo[][]){
        if(amount<0 || i>=coins.length) return 0;
        if(amount==0) return 1;
        if(memo[i][amount]!=-1) return memo[i][amount];
        return memo[i][amount] = count(amount-coins[i], coins, i, memo) + count(amount, coins, i+1, memo);
    }
    public int change(int amount, int[] coins) {
        int memo[][] = new int[coins.length+1][amount+1];
        for(int rows[]:memo){Arrays.fill(rows, -1);}
        return count(amount, coins,0, memo);
    }
}
