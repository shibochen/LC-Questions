class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //i < nums.length -2 因为左右指针
        for(int i = 0; i < nums.length - 2; i++){
            //当数字相同时跳过，避免重复
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            //左右指针根据情况来移动
            while(low < high){
                //如果等于，return全部值
                if(nums[low] + nums[high] == sum){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    //避免左边重复，右移一位
                    while(low < high && nums[low] == nums[low + 1]) low++;
                    //避免右边重复，左移一位
                    while(low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                }else if (nums[low] + nums[high] < sum){
                    //右移动
                    low++;
                }else{
                    //左移动
                    high--;
                }
            }
        }
        return result;
    }
}

/*
Method: two pointer
思路：
1.先进行排序
2.用外循环记录第一个数，内循环用two pointer
3.当 sum > 0 指针向左移动，sum < 0, 指针向右移动， sum = 0，return 双指针 和 外循环的 数

Time: O(n^2)   Space: O(n)
*/
