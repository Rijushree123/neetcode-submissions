class Solution {
    public int binarySearch(int nums[], int target, int l, int r, int m){
        System.out.println(m);
        while(l<=r){
            if(target==nums[m])
                return m;
            else if(target<nums[m])
                r = m-1;
            else
                l = m+1;
            return binarySearch(nums, target, l, r, (l+r)/2);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int m = (nums.length-1)/2;
        return binarySearch(nums, target, 0, nums.length-1, m);
    }
}
