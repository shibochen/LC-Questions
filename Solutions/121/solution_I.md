# 121

```java
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int min = Integer.MAX_VALUE, maxProfit = 0;

        for (int price : prices) {
            min = Math.min(min, price);
            maxProfit = Math.max(price - min, maxProfit);
        }

        return maxProfit;
    }
}
```