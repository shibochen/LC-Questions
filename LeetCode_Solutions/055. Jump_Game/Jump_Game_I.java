class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max) return false;
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
}

/*
greedy Algorithm
max is max jump length;
如果我的最大跳跃长度小于 index的位置就是说明跳不到
Time: O(n)   Space: O(1);
*/
