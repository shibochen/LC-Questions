class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> startIndex = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        int len = Integer.MAX_VALUE, frequency = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!startIndex.containsKey(nums[i])) {
                startIndex.put(nums[i], i);
            }
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) == frequency) {
                len = Math.min(i - startIndex.get(nums[i]) + 1, len);
            } else if (count.get(nums[i]) > frequency) {
                len = i - startIndex.get(nums[i]) + 1;
                frequency = count.get(nums[i]);
            }
        }
        return len;
    }
}
