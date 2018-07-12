class Solution {
    public String shortestPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        int end = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                end--;
                j = end;
            }
        }
        return new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
}
/*
思路：
1. 利用双指针来进行判断，如果相同，i++，j--
2. 不同，这利用end来显示那里开始不同
3. 利用stringbuilder把end后面不同的截取出来然后进行反转，再加上原来s

比如：           j
i  j            i
abcd   ----->   abcd
   e            e

由于i和j都不同，所以e移到j位，然后截取e后面的字符串，将其反转和原来字符串相加
TIME：O（logn）  Space: O(1) ?????
*/
