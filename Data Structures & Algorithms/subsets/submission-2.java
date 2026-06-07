class Solution {
    public void dfs(int[] nums, int i, List<List<Integer>> list, List<Integer> l){
        //Base Condition
        if(i>=nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
        //DFS
        l.add(nums[i]);
        dfs(nums, i+1, list, l);
        //removing the last element
        l.remove(l.size()-1);
        //backtrack
        dfs(nums, i+1, list, l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        dfs(nums, 0, list, l);
        return list;
    }
}
