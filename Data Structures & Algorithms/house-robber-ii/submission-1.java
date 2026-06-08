class Solution {
    int memo[];
    public int dfs(int i, int nums[], int end){
        if(i>=end) return 0;
        if(memo[i]!=-1) return memo[i];
        return memo[i] = Math.max(nums[i]+dfs(i+2, nums, end),dfs(i+1, nums, end));
    }
    public int rob(int[] nums) {
        //edge case
        if(nums.length==1) return nums[0];
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        int max1 = dfs(0, nums, nums.length-1);
        Arrays.fill(memo, -1);
        int max2 = dfs(1, nums, nums.length);
        return Math.max(max1, max2);
    }
}
