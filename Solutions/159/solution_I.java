class Solution {
    
    public int lengthOfLongestSubstringTwoDistinct (String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, res = 0;
        
        while (end < s.length()) {
            if (map.size() <= 2) {
                map.put(s.charAt(end), end);
                end++;
            }
            if (map.size() > 2) {
                int leftmost = s.length();
                for (int num : map.values) {
                    leftmost = Math.min(leftmost, num);
                }
                map.remove(s.charAt(leftmost));
                start = leftmost + 1;
            }
            res = Math.max(res, end - start);
        }
        return res;
    }
}