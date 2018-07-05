class Solution {
    public int maxCoins(int[] nums) {
       //在原数组两边个填充一个1，边界条件
        int[] numx = new int[nums.length + 2];
        int n = 1;
        for (int x : nums) {
            if (x > 0) numx[n++] = x;
        }
        numx[0] = numx[n++] = 1;

        int[][] dp = new int[n][n];
        for (int k = 2; k < n; k++) {
            for (int left = 0; left < n - k; left++) {
                int right = left + k;
                for (int i = left + 1; i < right; i++) {
                    dp[left][right] = Math.max(dp[left][right],
                    numx[left] * numx[i] * numx[right] + dp[left][i] + dp[i][right]);
                }
            }
        }
        return dp[0][n-1];
    }
}
