class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }
}

/*
由于只要找到一个峰值，二分法缩短时间
二分法找到中间元素后，然后跟靠近的元素比较大小
如果大，峰值在前面，如果小，峰值在后面。
*/
