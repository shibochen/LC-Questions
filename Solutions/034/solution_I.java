class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};
        int start = FindFirst(nums, target);
        if (start == -1) return new int[]{-1, -1};
        int end = FindSecond(nums, target);
        return new int[]{start, end};
    }
    
    public int FindFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;
        return -1;
    }
    
    public int FindSecond(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (nums[end] == target) return end;
        if (nums[start] == target) return start;
        return -1;
    }
}


TC: O(logN)
SC: O(1)