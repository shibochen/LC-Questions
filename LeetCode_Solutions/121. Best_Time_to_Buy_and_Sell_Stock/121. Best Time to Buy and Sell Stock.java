	public int maxProfit(int[] prices) {
        //maxCur = current maximum value, maxSofar = maximum value found so far
        int maxCur = 0, maxSofar = 0;
        for(int i = 1; i < prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i] - prices[i - 1]);
            maxSofar = Math.max(maxCur, maxSofar);
        }
        return maxSofar;
    }

    //给出一个股票的价格序列，买入一次卖出一次，求能获得最大利润
    //Note: Similar to LC 53, this kind of question using for loop
