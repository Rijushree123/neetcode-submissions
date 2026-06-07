class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[k];
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        //Min heap based priority Queue
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        System.out.println(map);
        for(int i: map.keySet()){
            queue.add(i);
            if(queue.size()>k)
                queue.poll();
        }
        for(int i=0;i<k;i++){
            ans[i] = queue.poll();
        }
        return ans;
    }
}
