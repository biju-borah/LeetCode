package Arrays.Easy;

public class Stock {
    public static int maxProfit(int[] prices) {
        // 7, 1, 5, 3, 6, 4
        int min = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
