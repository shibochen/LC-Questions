//Method 1: Brute Force

public int[] twoSum(int[] nums, int target){
	//loop through each element x and find if there is another value
	//that equals to target - x
	for(int i = 0; i < nums.length; i++){
		for(int j = i + 1 ; j < nums.length; j++){
			if(nums[j] = target - nums[i]){
				return new int[] {i, j};
			}
		}
	}
	//remember to throw exception, otherwise not working
	throw new IllegalArgumentException('No two sum solution');
}

// Note: The above two loops are a good way to determine the relationship between
// 	  two numbers next to each other.
// 	  I dont know why i need to throw exception

//Method 2: Two-pass Hash Table

public int[] twoSum(int[] nums, int target){
	//create map object
	Map<Integer, Integer> map = new HashMap<>();
	//add all values to map
	for(int i = 0; i < nums.length; i++){
		map.put(nums[i], i);
	}
	for(int i = 0; i < nums.length; i++){
		int complement = target - nums[i];
		if(map.containsKey(complement)&& map.get(complement) != i){
			return new int[] {i, map.get(complement)};
		}
	}
	throw new IllegalArgumentException("No two sum solution");
}


//Method 3: One-pass Hash Table

public int[] twoSum(int nums, int target){
	Map<Integer, Integer> map = new HashMap<>();
	for(int i = 0; i < nums.length; i++){
		int complement = target - nums[i];
		if(map.containsKey(complement)){
			return new int[] {map.get(complement), i};
		}
		map.put(nums[i],i);
	}
	throw new IllegalArgumentException("No two sum solution");
}

//Note: Map's characteristics: Key and value;