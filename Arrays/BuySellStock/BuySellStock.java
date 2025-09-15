package Arrays.BuySellStock;

public class BuySellStock {
  public int maxProfit(int[] prices) {
    int buyPrice = prices[0];
    int maxPrice = 0;

      for (int i = 1; i < prices.length; i++){
        if (buyPrice < prices[i]){
          int profit = prices[i] - buyPrice;
          maxPrice = Math.max(maxPrice, profit);
        } else {
          buyPrice = prices[i];
        }
      }

    return maxPrice;
  }
}
