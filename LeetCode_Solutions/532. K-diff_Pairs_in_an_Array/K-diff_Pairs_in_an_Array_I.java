class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
题目很好，记住模板
map。put会覆盖相同的key
map.entrySet() 返回set   列入  Dylan=22
Map.Entry  去key和value

Time: O(n)  Space: O(n)
*/
