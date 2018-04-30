	public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        //The majority element is located in the middle of the array;
        return nums[nums.length / 2];
    }