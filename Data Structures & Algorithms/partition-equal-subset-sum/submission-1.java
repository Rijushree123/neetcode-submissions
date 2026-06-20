class Solution {
    //iSum is the sum of all the items pick till now (sum picked) 
    //currSum is the sum after adding current item at index i(sum remaining to pick from)
    //i is the current index, the item to be added
    public boolean partition(int[] nums, int iSum, int totalSum, int i){
        if(i>=nums.length) return false;
        if(totalSum-iSum==iSum) return true;
        return partition(nums, (iSum+nums[i]), totalSum, i+1) || partition(nums, iSum, totalSum, i+1);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        return partition(nums,0, sum, 0);
    }
}
