class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        int length = s.length();
        int dp[] = new int[length + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i <= length; i++){
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if(first >= 1 && first <= 9){
                dp[i] += dp[i - 1];
            }
            if(second >= 10 && second <= 26){
                dp[i] += dp[i - 2];
            }
        }
        return dp[length];
    }
}

/*
DP method
用数组来积累几种可能性
first 用来判断是否能单个算
second 用来判断是否能组合算
Time: O(n) Space: O(n)
*/
