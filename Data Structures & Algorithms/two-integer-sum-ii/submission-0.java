class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0, r=numbers.length-1;
        int ans[] = new int[2];
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target) break;
            else if(sum<target) l++;
            else r--;
        }
        ans[0] = l+1;
        ans[1] = r+1;
        return ans;
    }
}
