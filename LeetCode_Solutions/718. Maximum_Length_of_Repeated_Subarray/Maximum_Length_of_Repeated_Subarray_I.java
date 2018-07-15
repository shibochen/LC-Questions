class Solution {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length + 1][B.length + 1];
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], 1 + dp[i][j]);
                    max = Math.max(max, dp[i + 1][j + 1]);
                }
            }
        }
        return max;
    }
}

/*
Time: O(n^2)  Space:O(n^2)
*/
