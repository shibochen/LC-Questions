     public boolean containsDuplicate(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            //检查前后是否相等，相等就return true
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        //return false 假如每个元素都是唯一
        return false;
    }