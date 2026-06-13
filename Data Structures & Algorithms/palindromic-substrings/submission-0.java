class Solution {
    int start = 0, maxlen=1;
    int result = 0;
    public void expand(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            result++;
            left--;
            right++;
        }

    }
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            //odd length
            expand(s, i, i);
            //even length
            expand(s,i,i+1);
        }
        return result;
    }
}
