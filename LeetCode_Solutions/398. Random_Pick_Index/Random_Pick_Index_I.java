class Solution {
    int[] nums;
    Random rnd;

    public Solution(int[] nums) {
        this.nums = nums;
        this.rnd = new Random();
    }

    public int pick(int target) {
        int result = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                continue;
            }
            if (rnd.nextInt(++count) == 0) {
                result = i;
            }
        }
        return result;
    }
}

/*
定义两个自变量：计时器count和结果result。
遍历整个数组，如果数组的值跟target不想等，直接continue
如果等于target，count 加一。 然后在 0 - count 区间里随机
生成一个数字。如果这个值等于0，就赋值 i 给 result
*/
