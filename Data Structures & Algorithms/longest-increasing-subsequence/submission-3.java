class Solution {
    public int dfs(int nums[], int curr, int last, int memo[][]){
        if(curr==nums.length) return 0;
        if(memo[curr][last+1]!=-1) return memo[curr][last+1];
        //Not include current item
        int lis = dfs(nums, curr+1, last, memo);
        if(last==-1 || nums[last]<nums[curr]){
            //Include current element
            lis = Math.max(lis, 1+dfs(nums, curr+1, curr, memo));
        }
        return memo[curr][last+1] = lis;
    }
    public int lengthOfLIS(int[] nums) {
        int memo[][] = new int[nums.length][nums.length+1];
        for(int[] row : memo) Arrays.fill(row, -1); 
        return dfs(nums, 0, -1, memo);
    }
}
