class Solution {
    public int matchSubsequence(String text1, String text2, int i, int j, int count, int memo[][]){
        if(i>=text1.length() || j>=text2.length()) return count;
        if(memo[i][j]!=-1) return memo[i][j];
        if(text1.charAt(i)==text2.charAt(j)){
            //++count;
            return memo[i][j] =1+ matchSubsequence(text1, text2, i+1, j+1, count, memo);
        }
        return memo[i][j] = Math.max(matchSubsequence(text1, text2, i, j+1, count, memo), matchSubsequence(text1, text2, i+1, j, count, memo));
        //return count;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][] = new int[text1.length()][text2.length()];
        for(int rows[]: memo){
            Arrays.fill(rows, -1);
        }
        int count = matchSubsequence(text1, text2, 0, 0, 0, memo);
        return count;
    }
}
