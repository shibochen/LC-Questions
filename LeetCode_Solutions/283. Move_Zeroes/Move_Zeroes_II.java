	class Solution {
	    public void moveZeroes(int[] nums) {
	    if (nums == null || nums.length == 0) return;        

	    int insertPos = 0;
	    //假如element的值是非零，加入
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	   		}        
	   	//把剩下的位置用0来补充
	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    	}
		}
	}

	/*
	 	Time: O(1)   Space: O(1)
	*/