class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int[] result = new int[nums.length];
        result[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1]; 
        }
        int product = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            result[i] *= product;
            product *= nums[i];
        }
        
        return result;
    }
}


1. create an new array
2. get product of numbers on left side
3. update array to get product of numbers on right side
O(n)
O(n)