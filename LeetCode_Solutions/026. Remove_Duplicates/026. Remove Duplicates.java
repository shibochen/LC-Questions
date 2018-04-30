	public int removeDuplicates(int[] nums) {
	    if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}

	//Note: two pointer method for array!


	public int removeDuplicates(int[] nums) {
	    int i = 0;
	    for(int n : nums)
	        if(i < 1 || n > nums[i - 1]) 
	            nums[i++] = n;
	    return i;
	}

	//Note: similar to 80