 	  public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                if((i - map.get(nums[i])) <= k){
                    return true;
                }
            }
            map.put(nums[i] , i);
        }
        return false;
    }

    /*题目：两个不同index，得到相同值，而且这两个index的差必须 《= K；
            Time: O(n)  Space: O(n)
    */


 	public boolean containsNearbyDuplicate(int[] nums, int k) {
        //if (nums == null || nums.length == 0) return true;
        
        //set k , i dont know what will produce
        Set<Integer> set = new HashSet<>(k);
        for (int i = 0; i < nums.length; i++){
            if (i>k) set.remove (nums[i-k-1]);
            if (!set.add (nums[i])) return true;
        }
        return false;
    }


