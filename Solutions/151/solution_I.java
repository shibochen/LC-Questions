public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();
    }
}

O(n)
O(n)