    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1};
        
        return new int[]{findLeftEdge(nums,target),findRightEdge(nums,target)};
    }
    private int findLeftEdge(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low + 1 < high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] >= target){
                high = mid;
            }else{
                low = mid;
            }
        }
        
        if(nums[low] == target){
            return low;
        }else if (nums[high] == target){
            return high;
        }else{
            return - 1;
        }
    }
    
    private int findRightEdge(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        
        while(low + 1 < high){
            int mid = low + (high - low) / 2;
            
            if(nums[mid] <= target){
                low = mid;
            }else{
                high = mid;
            }
        }
        
        if(nums[high] == target){
            return high;
        }else if (nums[low] == target){
            return low;
        }else{
            return -1;
        }
    }
