class Solution {
    public int countPaths(int i, int j, int m, int n, int memo[][]){
        //Base Case: Out of Bounds check
        if(i>=m || j>=n){
            return 0;
        }
        //Check chache: Memoization on [i][j]
        if(memo[i][j]!=-1) return memo[i][j];
        //Base Case: Reached Destination
        if(i==m-1 && j==n-1) return 1;
        //return recurrence path: right + down
        return memo[i][j] = countPaths(i+1, j, m, n, memo) + countPaths(i, j+1, m, n, memo);
    }
    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m+1][n+1];
        // for(int rows[]:memo){
        //     Arrays.fill(rows, -1);
        // }
        // return countPaths(0, 0, m, n, memo);
        memo[m-1][n-1] = 1;
        for(int i = m-1; i>=0;i--){
            for(int j = n-1; j>=0; j--){
                memo[i][j] += memo[i+1][j] + memo[i][j+1];
            }
        }
        return memo[0][0];
    }
}
