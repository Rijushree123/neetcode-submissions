class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int ans = 0;
        while(l<r){
            if(heights[l]<=heights[r]){
                int b = r-l;
                int area = heights[l]*b;
                ans = Math.max(ans, area);
                l++;
            }
            else if(heights[r]<heights[l]){
                int b = r-l;
                int area = heights[r]*b;
                ans = Math.max(ans, area);
                r--;
            }
        }
        return ans;
    }
}
