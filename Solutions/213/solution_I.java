class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1));
    }
    
    public int helper(int[] nums, int low, int high) {
        int robNo = 0;
        int robYes = 0;
        for (int i = low; i <= high; i++) {
            int temp = robNo;
            robNo = Math.max(robNo, robYes);
            robYes = nums[i] + temp;
        }
        return Math.max(robNo, robYes);
    }
}