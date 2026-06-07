class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Create array of indices
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        // Sort indices based on values in nums
        Arrays.sort(indices, Comparator.comparingInt(i -> nums[i]));
        Arrays.stream(indices).forEach(n->System.out.print(n+" "));
        Arrays.sort(nums);
        int l=0;
        int r = nums.length-1;
        System.out.println("\n"+l+"  "+r);
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==target) break;
            else if(sum>target) r--;
            else l++;
            System.out.println("\n"+l+"  "+r);
        }
        System.out.println("\n"+l+"  "+r);
        int arr[] = new int[2];
        arr[0] = indices[l];
        arr[1] = indices[r];
        Arrays.sort(arr);
        return arr;
    }
}
