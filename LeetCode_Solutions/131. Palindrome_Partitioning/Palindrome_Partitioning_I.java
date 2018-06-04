class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> results = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return results;
        }

        List<String> partition = new ArrayList<String>();
        helper(s, 0, partition, results);

        return results;
    }

    private void helper(String s, int startIndex, List<String> partition, List<List<String>> results) {
        if (startIndex == s.length()) {
            results.add (new ArrayList<String>(partition));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            String subString = s.substring(startIndex, i + 1);
            if (!isPalindrome(subString)) {
                continue;
            }
            partition.add(subString);
            helper(s, i + 1, partition, results);
            partition.remove(partition.size() - 1);
        }
    }

    private boolean isPalindrome(String subString) {
        int start = 0;
        int end = subString.length() - 1;

        while(start < end) {
            if (subString.charAt(start) != subString.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
