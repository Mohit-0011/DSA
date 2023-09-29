public class buy_sell_stocks {
    public static int buysell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        // int sellingPrice =0;

        for (int i = 0; i < prices.length; i++) {

            if (buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit); // Max Profit
            } else {
                buyPrice = prices[i];
            }

        }
            return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buysell(prices));
    }
}
