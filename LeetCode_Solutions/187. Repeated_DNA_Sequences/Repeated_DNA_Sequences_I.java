class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet();
        if (s == null || s.length() < 2) {
            return new ArrayList();
        }
        Set<String> temp = new HashSet();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            if (temp.contains(sub)) {
                result.add(sub);
            } else {
                temp.add(sub);
            }
        }
        return new ArrayList(result);
    }
}

/*
题意：找出重复的连续10子字符串
*/
