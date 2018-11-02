class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] < nums[end]) {
                return nums[start];
            }
            
            int mid = start + (end - start) / 2;
            
            if (nums[mid] >= nums[start]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}

TC: O(logN)
SC: O(1)
    
line 13:  must have = sign, otherwise it fails when [2,1]