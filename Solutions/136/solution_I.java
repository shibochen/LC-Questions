class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}

// TC: O(n)
// SC: O(1)
// Method: Bit Manipulation
// More explanation, look at discussion