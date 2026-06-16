class Solution {
    Boolean memo[];
    public boolean segment(String s, HashSet<String> set, int r, int l){
        if(r==s.length()) return true;
        if(l>s.length()) return false;
        if(memo[r]!=null) return memo[r]; //cache lookup
        String w = s.substring(r, l);
        if(set.contains(w) && segment(s,set, l, l+1)){
            memo[r] = true;
            return true;
        }
        return memo[r] = segment(s,set, r, l+1);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        memo = new Boolean[s.length()];
        HashSet<String> set = new HashSet<>(wordDict);
        return segment(s,set, 0, 1);
    }
}
