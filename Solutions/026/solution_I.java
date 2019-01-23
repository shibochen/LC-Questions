class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j -1] != nums[j]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}

O(n)
O(1)