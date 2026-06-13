class Solution {
    
    public String longestPalindrome(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];
        int start = 0;int maxlen = 1;
        int n = s.length();
        for(int i = n-1;i>=0;i--){
            for(int j = i; j<n;j++){
                if(s.charAt(i)==s.charAt(j) && (j-i+1<=2 || dp[i+1][j-1]==true)){
                    dp[i][j] = true;
                    if(j-i+1>maxlen){
                        maxlen = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start+maxlen);
    }
}
