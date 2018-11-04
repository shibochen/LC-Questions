class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0) return 0;
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[envelopes.length];
        int result = 0;
        for (int[] envelope : envelopes) {
            int i = binarySearch(dp, 0, result, envelope[1]);
            dp[i] = envelope[1];
            if (i == result) {
                result++;
            }
        }
        return result;
    }
    public int binarySearch(int[] dp, int start, int end, int target) {
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (dp[mid] == target) {
                return mid;
            } else if (dp[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (dp[start] >= target) return start;
        return end;
    }
}

TC: O(NlogN)
SC: O(N)
    
Note: similar to 300