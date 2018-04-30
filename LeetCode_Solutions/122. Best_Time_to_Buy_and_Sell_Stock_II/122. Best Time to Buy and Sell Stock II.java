  public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }





//不懂题目
//题意为给定一个数组，数组中第i个元素的值对应着第i天的股票，你可以完成多次交易，
//但是每次交易只能买入一次并卖出，求进行多次交易所能得到的最大利润

