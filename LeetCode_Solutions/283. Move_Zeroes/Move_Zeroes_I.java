    class Solution {
        public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
                }
            }
        }
    }

    /*
    Method：Brutal Force （two pointer）

    思路：用双指针（i & j），如果i指针在某个index是非0，J就进行储存

    Time：O(n)  space: O(n)
    */