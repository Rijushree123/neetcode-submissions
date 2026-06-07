class Solution {

    public int binarySearch(int rate, int l, int r, int[] nums, int h){
        int m = (l+r)/2;
        if(l>r || m<=0) return rate;
        int sum = 0;
        System.out.println("l="+l+"  r="+r+"  m="+m+"  Sum "+sum+" target="+h);
        for(int i: nums){
            sum +=(i+m-1)/m;
        }
        System.out.println("Sum "+sum);
        if(sum<=h){
            rate = Math.min(rate, m);
            r=m-1;
        }
        else{
            l=m+1;
        }
        if(l<=r) return binarySearch(rate, l, r, nums, h);
        return rate;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int ans = binarySearch(piles[piles.length-1],0,piles[piles.length-1], piles, h);
        return ans;
    }
}
