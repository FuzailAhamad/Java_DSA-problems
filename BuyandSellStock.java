public class BuyandSellStock{
    public int buyandsellstock(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] prices = {4,3,2,1};
        BuyandSellStock solution = new BuyandSellStock();
        System.out.println(solution.buyandsellstock(prices));
    }
}