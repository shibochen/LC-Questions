class Solution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        int left = 0, right = s.length() - 1;
        int end = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                left = 0;
                end--;
                right = end;
            }
        }
        return new StringBuilder(s.substring(end + 1)).reverse().toString() + s;
    }
}

O(n^2)
O(1)