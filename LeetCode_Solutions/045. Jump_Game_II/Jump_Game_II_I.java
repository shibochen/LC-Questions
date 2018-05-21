class Solution {
    public int jump(int[] nums) {
        if(nums == null || nums.length < 2) return 0;
        int result = 0,  currentMax = 0, maxNext = 0;
        for(int i = 0; i < nums.length - 1; i++){
            maxNext = Math.max(maxNext, i + nums[i]);
            if(i == currentMax){
                result++;
                currentMax = maxNext;
            }
        }
        return result;
    }
}

/*
Greedy Algorithm

Time: O(n)  Space: O(1)
*/
