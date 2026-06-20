class Solution {
    public int dfs(int nums[], int last, int curr, int memo[][]){
        if(curr==nums.length) return 0;
        if(memo[curr][last+1]!=-1) return memo[curr][last+1];
        //Not include current item
        int lis = dfs(nums, last, curr+1, memo);
        if(last==-1 || nums[last]<nums[curr]){
            //Include current element
            lis = Math.max(lis, 1+dfs(nums, curr, curr+1, memo));
        }
        return memo[curr][last+1] = lis;
    }
    public int lengthOfLIS(int[] nums) {
        int memo[][] = new int[nums.length][nums.length+1];
        for(int[] row : memo) Arrays.fill(row, -1); 
        return dfs(nums,-1, 0, memo);
    }
}
