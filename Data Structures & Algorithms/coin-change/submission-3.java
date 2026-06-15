class Solution {
    public int coinChange(int[] coins, int amount) {
        int steps = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[amount+1];
        q.offer(amount);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int n = q.poll();
                if(n==0) return steps;
                for(int c: coins){
                    if(c<=n && !visited[n-c]){
                        q.offer(n-c);
                        visited[n-c] = true;
                    }
                }
            } 
            steps++;
        }
        return -1;
    }
}