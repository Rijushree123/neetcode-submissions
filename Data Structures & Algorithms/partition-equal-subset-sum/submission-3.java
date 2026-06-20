class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        int target = sum/2;
        boolean memo[][] = new boolean[n+1][target+1];
        memo[n][target] = false;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=target;j++){
                if(j==target) memo[i][j] = true;
                else if(j+nums[i]<=target){
                    memo[i][j] = memo[i+1][j] || memo[i+1][j+nums[i]];
                }
                else memo[i][j] = memo[i+1][j];
            }
        }
        return memo[0][0];
    }
}
