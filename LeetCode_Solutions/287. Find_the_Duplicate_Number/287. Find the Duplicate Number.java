    public int findDuplicate(int[] nums) {
        int low = 1, high = nums.length - 1;
        while(low <= high){
            int mid = (high + low)/2;
            int count = 0;
            for(int val : nums){
                if(val <= mid) count++;
            }
            if(count <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }