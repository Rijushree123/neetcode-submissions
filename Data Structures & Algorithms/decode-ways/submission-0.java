class Solution {
    int dp[];
    public int decode(String s, int i){
        //Base case. Reached the end
        if(i==s.length()) return 1;
        //Leading 0 : invalid
        if(s.charAt(i)=='0') return 0;
        //Return cached result
        if(dp[i]!=-1) return dp[i];
        //way 1: one digit
        int ways = decode(s, i+1);
        //way 2: two digits
        if(i+1<s.length()){
            int twoDigits = Integer.parseInt(s.substring(i, i+2));
            if(twoDigits<=26){
                ways+=decode(s, i+2);
            }
        }
        return dp[i]=ways;
    }
    public int numDecodings(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return decode(s, 0);
    }
}
