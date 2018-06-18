class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int ans = 10, base = 9;

        for (int i = 2; i <= n && i <= 10; i++) {
            base *= (9 - i + 2);
            ans += base;
        }

        return ans;
    }
}


/*
n = 0    1
n = 1    10
n = 2    10 + 9 * 9 = 91
n = 3    91 + 9 * 9 * 8 = 739
...
n = 11   9 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 * 0 = 0

通过上述规律看出，n不能超过11， 超过都会出现重复。
https://leetcode.com/problems/count-numbers-with-unique-digits/discuss/83061/Java-O(1)-with-explanation
*/
