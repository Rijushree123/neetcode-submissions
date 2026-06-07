class Solution {
    public int lastStoneWeight(int[] stones) {
        int ans=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            minHeap.offer(i);
        }
        while(minHeap.size()>=2){
            int y=minHeap.poll();
            int x=minHeap.poll();
            int diff = y-x;
            if(x<y){
                minHeap.offer(y-x);
            }
            System.out.println(minHeap);
        }
        System.out.println(minHeap);
        return (minHeap.size()>0)?minHeap.peek():0;
    }
}
