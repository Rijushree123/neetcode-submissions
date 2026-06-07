class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str = "";

        int ans = 0;
        int count = 0;
        for(char c:s.toCharArray()){
            if(str.indexOf(c)>=0){
                ans = Math.max(ans, count);
                int i = str.indexOf(c);
                str = str.substring(i+1);
                str += c;
                count = count -(i);
            }
            else{
                count++;
                str += c;
            }
            // System.out.println("count:"+count+"  ans:"+ans);
        }
        ans = Math.max(ans, count);
        return ans;
    }
}
