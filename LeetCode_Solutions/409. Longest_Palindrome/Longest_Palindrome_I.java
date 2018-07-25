class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int ans = 0;
        for (int r : count) {
            ans += r / 2 * 2;
            if (ans % 2 == 0 && r % 2 == 1) {
                ans++;
            }
        }
        return ans;
    }
}

/*
Time: O(n)  Space: O(1)
*/
