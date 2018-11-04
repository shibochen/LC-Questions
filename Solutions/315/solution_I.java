class Solution {
    public List<Integer> countSmaller(int[] nums) {
        Integer[] result = new Integer[nums.length];
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int index = findIndex(list, nums[i]);
            result[i] = index;
            list.add(index, nums[i]);
        }
        return Arrays.asList(result);
    }
    public int findIndex(List<Integer> list, int target) {
        if (list.size() == 0) return 0;
        int start = 0;
        int end = list.size() - 1;
        if (list.get(end) < target) return end + 1;
        if (list.get(start) >= target) return 0;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (list.get(start) >= target) return start;
        return end;
    }
}

TC: O(n^2)
SC: O(n)
    
Note: ???