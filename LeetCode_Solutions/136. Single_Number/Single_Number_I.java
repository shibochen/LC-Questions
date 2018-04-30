	class Solution {
	    public int singleNumber(int[] nums) {
	        int result = 0;
	        for(int i = 0; i < nums.length; i++){
	            result ^= nums[i];
	        }
	        return result;
	    }
	}


	/*
	Method: Bit Manipulation (XOR)
	
	result = 0 可行， 主要是  A ^ A = 0,  A ^ B ^ A = B
    For Example:
    [0,1,1,2,2]
  
    0 ^ 0 ^ 1 ^ 1 ^ 2 ^ 2 = 0
     
	Time: O(n)  Space: O(1)
	*/