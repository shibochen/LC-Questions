class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(sum, result);
        }
        return result;
    }
}


O(n)
O(1)