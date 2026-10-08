public class BuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int buyPrice = prices[0];
        int profit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                profit = Math.max(profit, prices[i] - buyPrice);

            } else {
                buyPrice = prices[i];
            }
        }
 

        return profit < 0 ? 0 : profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
