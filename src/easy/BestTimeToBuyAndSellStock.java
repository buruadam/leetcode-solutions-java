package easy;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit)  {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
