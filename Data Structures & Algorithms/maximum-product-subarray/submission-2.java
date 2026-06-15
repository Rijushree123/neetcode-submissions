class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int prefixS = nums[0];
        int suffixS = nums[0];
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(n==0){
                prefix = 1;
                prefixS = Math.max(prefixS, 0);
                continue;
            }
            prefix *= nums[i];
            prefixS = Math.max(prefixS, prefix);
        }
        for (int i = nums.length-1; i >=0; i--) {
            int n = nums[i];
            if(n==0){
                suffix = 1;
                suffixS = Math.max(suffixS, 0);
                continue;
            }
            suffix *= nums[i];
            suffixS = Math.max(suffixS, suffix);
        }
        max = Math.max(prefixS, suffixS);
        return max;
    }
}
