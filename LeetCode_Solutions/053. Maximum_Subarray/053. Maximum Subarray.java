	public int maxSubArray(int[] nums) {
		//Create new array with the length of nums
        int[] dp = new int[nums.length];
        //initialize dp[0]
        dp[0] = nums[0];
        //initialize the value of result
        int res = nums[0];
        //store the value of 
        for(int i = 1; i < nums.length; i++){
        	//assign the value of array: nums at index i if the sum of contiguous
        	//subarray is less than 0; Otherwise, add them together and assign it
            dp[i] = nums[i] + (dp[i - 1] < 0 ? 0 : dp[i - 1]);
            //assign the max value of result;
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /* Method 1: DP method
       idea: sum of continguos subarray < 0,  start new element at new index
       time: O(n)  space: O(n)
    */



	public static int maxSubArray(int[] A) {
	    int maxSoFar=A[0], maxEndingHere=A[0];
	    for (int i=1;i<A.length;++i){
	    	//假如continguous subarray总和大于0，继续加值
	    	//假如小于0，重新另开一个 continguos subarray组
	    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
	    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
	    }
	    return maxSoFar;
	}


	/* The idea is similar to above method
	   time: O(n) space: O(1)
	*/