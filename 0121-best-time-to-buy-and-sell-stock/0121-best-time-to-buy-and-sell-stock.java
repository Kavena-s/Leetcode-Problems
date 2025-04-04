class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int max_profit = 0;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < price){
                price = prices[i];
            }
            else{
                if(max_profit < (prices[i] - price)){
                    max_profit = prices[i] - price;
                }
            }
        }
        return max_profit;
    }
}