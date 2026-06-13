class Solution {
    int start = 0, maxlen=1;
    public void expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            if(right-left+1>maxlen){
                maxlen = right-left+1;
                start = left;
            }
            left--;
            right++;
        }

    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            //odd length
            expand(s, i, i);
            //even length
            expand(s,i,i+1);
        }
        return s.substring(start, start+maxlen);
    }
}
