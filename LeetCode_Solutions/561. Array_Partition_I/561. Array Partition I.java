 	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }


     public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0, j = 1; i < nums.length - 1; i += 2, j += 2){
            sum += Math.min(nums[i],nums[j]);
        }
        return sum;
    }