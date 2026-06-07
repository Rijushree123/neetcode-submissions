class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1, zeroCount=0;
        for(int n:nums){
            if(n!=0)
                prod *=n;
            else
                zeroCount++;
        }
        if(zeroCount>1) return new int[nums.length];

        int output[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zeroCount>0) 
                output[i] = (nums[i]==0)?prod:0;
            else 
                output[i] = prod/nums[i];
        }
        return output;
    }
}  
