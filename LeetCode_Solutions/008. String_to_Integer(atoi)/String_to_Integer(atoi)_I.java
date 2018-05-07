class Solution {
    public int myAtoi(String str) {
        int i = 0, ans = 0, sign = 1, len = str.length();
        while (i < len && str.charAt(i) == ' ') ++i;
        if (i < len && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        for (; i < len; ++i) {
            int tmp = str.charAt(i) - '0';
            if (tmp < 0 || tmp > 9)
                break;
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < tmp)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else
                ans = ans * 10 + tmp;
        }
        return sign * ans;
    }
}

/*
思路： 首先找到最前面的空白键，然后在进行正负号的判断，再一直过直到找到第一个字母。
      最后判断结果是否超过Integer.MAX_VALUE or Integer.MIN_VAUE.超过直接返回

      Time: O(n)  Space: O(1)
*/
