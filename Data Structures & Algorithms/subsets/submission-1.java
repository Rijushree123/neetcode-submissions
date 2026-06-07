class Solution {
    public void dfs(int[] nums, int i, List<Integer> subSet, List<List<Integer>> list){
        //Base Case
        if(i>=nums.length){
            list.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[i]);
        dfs(nums, i+1, subSet, list);
        subSet.remove(subSet.size()-1);
        dfs(nums, i+1, subSet, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        dfs(nums, 0, subSet, list);
        return list;
    }
}
