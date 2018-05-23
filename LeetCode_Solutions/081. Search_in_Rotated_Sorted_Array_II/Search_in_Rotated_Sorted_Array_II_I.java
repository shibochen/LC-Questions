class Solution {
    public boolean search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return false;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] < nums[right]){
                if(nums[right] >= target && nums[mid] < target) left = mid + 1;
                else right = mid - 1;
            }else if (nums[mid] > nums[right]){
                if(nums[left] <= target && nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            }else {
                right--;
            }
        }
        return false;
    }
}


/*
如果中间的数小于最右边的数，则右半段是有序的，若中间数大于最右边数，则左半段是有序的。
而如果可以有重复值，就会出现来面两种情况，[3 1 1] 和 [1 1 3 1]，对于这两种情况中间值等于最右值时，
目标值3既可以在左边又可以在右边，那怎么办么，
对于这种情况其实处理非常简单，只要把最右值向左一位即可继续循环，如果还相同则继续移，直到移到不同值为止
Time: O(logn) worst: O(n)  Space: O(1)
*/
