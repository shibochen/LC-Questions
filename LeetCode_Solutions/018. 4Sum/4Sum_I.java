class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //i < nums.length -3 because of i, low, high
        for(int i = 0; i < nums.length - 3; i++){
          //avoid duplicate calculation
            if(i > 0 &&  nums[i] == nums[i - 1]) continue;
            //pay attention to j = i + 1
            for(int j = i + 1; j < nums.length - 2; j ++){
                //pay attention to  j > i + 1
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;
                int low = j + 1, high = nums.length - 1;
                while(low < high){
                    int sum = nums[low] + nums[high] + nums[i] + nums[j];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low + 1]) low++;
                        while(low < high && nums[high] == nums[high - 1]) high--;
                        low++;
                        high--;
                    } else if (sum < target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return result;
    }
}

/*
Method: Two pointer

Similar to LC 15 , but you need to pay attention to its loop condition

Time: O(n^3)  Space: O(n);
*/
