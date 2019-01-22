 public int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        int result = 0;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] < target) {
                    result += high - low;
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }

