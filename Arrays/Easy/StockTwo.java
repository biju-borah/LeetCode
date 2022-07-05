package Arrays.Easy;

public class StockTwo {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int p = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i + 1 != prices.length && prices[i] > prices[i + 1]) {
                profit += prices[i] - prices[p];
                p = i;
                p++;
            }
            if (i == prices.length - 1 && p != i && prices[i] > prices[p]) {
                profit += prices[i] - prices[p];
            }

        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] { 1, 9, 6, 9, 1, 7, 1, 1, 5, 9, 9, 9 };
        System.out.println(maxProfit(prices));
    }
}
