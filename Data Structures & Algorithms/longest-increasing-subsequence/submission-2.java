class Solution {
    public int lis(int[] nums, int i, int memo[]){
        if(memo[i]!=-1) return memo[i];
        int best = 1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i])
                best = Math.max(best, 1+lis(nums, j, memo));
        }
        return memo[i]=best;
    }
    public int lengthOfLIS(int[] nums) {
        int memo[] = new int[nums.length];
        Arrays.fill(memo, -1);
        int max=0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, lis(nums, i, memo));
        }
        return max;
    }
}
