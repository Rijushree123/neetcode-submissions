class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Arrays.stream(nums).forEach(n->System.out.print(n+" , "));
        int target = 0;
        int sum = 0;
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            target = -nums[i];
            int l=i+1;
            int r = nums.length-1;
            while(l<r){
                sum = nums[l]+nums[r];
                if(sum==target){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[l], nums[r])));
                    r--;
                    l++;
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if(sum<target) l++;
                else r--;
            }
        }
        return list;
    }
}
