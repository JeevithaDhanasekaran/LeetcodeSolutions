class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<min)
                min=prices[i];
            if(prices[i]-min>maxprofit)
                maxprofit=prices[i]-min;
        }
        return maxprofit;
    }
}