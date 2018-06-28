class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words.length == 0) return new ArrayList<>();
        int n = words.length, m = words[0].length();
        List<Integer> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        //把所有元素从words里放入map里作为key，value则为出现的次数
        for (int i = 0; i < n; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }

        int i = 0;
        while (s.length() - i >= n * m) {  //while里的condition是因为最后一个遍历的index是 s.length() - n * m
            HashMap<String, Integer> temp = new HashMap<>(map);
            for (int j = 0; j < n; j++) {
                String str = s.substring(i + j * m, i + (j + 1) * m);
                if (temp.containsKey(str)) {
                    if (temp.get(str) - 1 == 0) {
                        temp.remove(str);
                    } else {
                        temp.put(str, temp.get(str) - 1);
                    }
                } else {
                    break;
                }
            }
            if (temp.size() == 0) result.add(i);
                i++;
        }
        return result;
    }
}

/*
Time： O（n^2） Space: O(n)
*/
