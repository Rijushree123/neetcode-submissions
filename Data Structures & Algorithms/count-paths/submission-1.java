class Solution {
    public int countPaths(int i, int j, int m, int n, int count, int memo[][]){
        if(i>=m || j>=n){
            return 0;
        }
        if(memo[i][j]!=-1) return memo[i][j];
        if(i==m-1 && j==n-1) return 1;
        return memo[i][j] = countPaths(i+1, j, m, n, count, memo) + countPaths(i, j+1, m, n, count, memo);
    }
    public int uniquePaths(int m, int n) {
        int memo[][] = new int[m][n];
        for(int rows[]:memo){
            Arrays.fill(rows, -1);
        }
        return countPaths(0, 0, m, n, 0, memo);
    }
}
