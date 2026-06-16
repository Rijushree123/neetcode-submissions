class Solution {
    Boolean memo[];
    public boolean segment(String s, List<String> wordDict, int r, int l){
        if(r==s.length()) return true;
        if(l>s.length()) return false;
        if(memo[r]!=null) return memo[r]; //cache lookup
        String w = s.substring(r, l);
        if(wordDict.contains(w) && segment(s,wordDict, l, l+1)){
            memo[r] = true;
            return true;
        }
        return memo[r] = segment(s,wordDict, r, l+1);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length()];
        return segment(s,wordDict, 0, 1);
    }
}
