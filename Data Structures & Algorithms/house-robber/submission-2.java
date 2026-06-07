class Solution {
    int memo[];
    public int dfs(int i, int nums[]){
        if(i>=nums.length) return 0;
        if(memo[i]!=-1) return memo[i];
        return  memo[i] = Math.max(nums[i] + dfs(i+2, nums), nums[i] + dfs(i+3, nums));
    }
    public int rob(int[] nums) {
        memo = new int[nums.length+1];
        Arrays.fill(memo, -1);
        return Math.max(dfs(0,nums), dfs(1,nums));
    }
}
