class Solution {
    HashMap<String, Integer> dp = new HashMap<>();
    public int countProfit(int[] prices, int i, boolean holding){
        if(i>=prices.length) return 0;
        String key = i+"-"+holding;
        if(dp.containsKey(key)) return dp.get(key);
        int skip = countProfit(prices, i+1, holding);
        if(holding){
            int sell = prices[i]+ countProfit(prices, i+2, false);
            int res = Math.max(sell, skip);
            dp.put(key, res);
            return res;
        }
        else{
            int buy = countProfit(prices, i+1, true)-prices[i];
            int res = Math.max(buy, skip);
            dp.put(key, res);
            return res;
        }
    }
    public int maxProfit(int[] prices) {
        return countProfit(prices, 0, false);
    }
}
