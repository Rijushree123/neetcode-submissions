class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd = false;
}
class Solution {
    public boolean segment(String s, TrieNode root, Boolean memo[], int i){
        if(i==s.length()) return true;
        if(memo[i]!=null) return memo[i];
        TrieNode curr = root;
        for(int j=i;j<s.length();j++){
            int idx = s.charAt(j)-'a';
            if(curr.children[idx]==null) break;
            curr = curr.children[idx];
            if(curr.isEnd && segment(s, root, memo, j+1)){
                return memo[i] = true;
            }
        }
        return memo[i] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        TrieNode root = new TrieNode();
        Boolean memo[] = new Boolean[s.length()];
        //insert words into trie
        for(String word:wordDict){
            TrieNode curr = root;
            for(char c: word.toCharArray()){
                int idx = c-'a';
                if(curr.children[idx]==null) curr.children[idx] = new TrieNode();
                curr = curr.children[idx];
            }
            curr.isEnd = true;
        }
        return segment(s, root, memo, 0);
    }
}
