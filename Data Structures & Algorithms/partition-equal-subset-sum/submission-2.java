class Solution {
    //iSum is the sum of all the items pick till now (sum picked) 
    //currSum is the sum after adding current item at index i(sum remaining to pick from)
    //i is the current index, the item to be added
    public boolean partition(int[] nums, int iSum, int totalSum, int i, Boolean memo[][]){
        if(i>=nums.length) return false;
        if(totalSum-iSum==iSum) return true;
        if(memo[iSum][i]!=null) return memo[iSum][i];
        boolean res = partition(nums, (iSum+nums[i]), totalSum, i+1, memo) || partition(nums, iSum, totalSum, i+1, memo);
        return memo[iSum][i] = res;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums) sum+=i;
        Boolean memo[][] = new Boolean[sum+1][nums.length+1];
        if(sum%2!=0) return false;
        return partition(nums,0, sum, 0, memo);
    }
}
