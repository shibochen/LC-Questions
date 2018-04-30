	public int[] twoSum(int[] numbers, int target) {
	    int l = 0, r = numbers.length - 1;
	    while (numbers[l] + numbers[r] != target) {
	        if (numbers[l] + numbers[r] > target) r--;
	        else l++;
	    }
	    return new int[]{l + 1, r + 1};
	}

	//Note: learn how to use left-right, while method.

	 public int[] twoSum(int[] numbers, int target) {
       for(int i = 0; i < numbers.length; i++){
           for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target) return new int[]{i+1,j+1};
           }
       } 
        throw new IllegalArgumentException("No two sum solution");
    }

    //Brutal Force   time: O(n^2)  space:O(n^2)