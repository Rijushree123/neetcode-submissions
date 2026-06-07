class Solution {
    int memo[];
    public int dfs(int i, int cost[]){
        if(i>=cost.length) return 0;
        if(memo[i]!=-1) return memo[i];
        
        return memo[i] = cost[i] + Math.min(dfs(i+1, cost), dfs(i+2, cost));
        
    }
    public int minCostClimbingStairs(int[] cost) {
        memo = new int[cost.length];
        Arrays.fill(memo, -1);
        int i=0;
        return Math.min(dfs(i, cost), dfs(i+1, cost));
    }
}
