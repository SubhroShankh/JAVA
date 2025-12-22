public class ProfitStocks {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }

    public static int buyAndSellStocks(int stocks[]) {
        int buyStocks = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < stocks.length; i++) {
            if (buyStocks < stocks[i]) {
                int profit = stocks[i] - buyStocks;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStocks = stocks[i];
            }
        }
        return maxProfit;
    }

}
