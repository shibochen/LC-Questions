public class Solution {
    /**
     * @param str: a string
     * @return: return a string
     */
    public char[] reverseWords(char[] str) {
        reverse(str, 0, str.length - 1);
        int r = 0;
        while (r < str.length) {
            int l = r;
            while (r < str.length && str[r] != ' ') {
                r++;
            }
            reverse(str, l, r - 1);
            r++;
        }
            return str;
    }
    private void reverse(char[] str, int left, int right) {
        while (left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }
}

O(n)
O(1)