    public void rotate(int[] nums, int k) {
        //make k is less than nums.length
        k %= nums.length;
        //reverse all elements
        reverse(nums, 0, nums.length - 1);
        //reverse elements from 0 to k - 1
        reverse(nums, 0, k - 1);
        //reverse elements from  k to nums.length - 1
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    //Hint: swap