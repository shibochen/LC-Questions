class Solution {
    public int[] countBits(int num) {
        int[] nums = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            nums[i] = nums[i >> 1] + (i & 1);
        }
        return nums;
    }
}

/*
题意：给你一个数字，然后把他 0 到 这个数字转化为二进制，然后数每个数字上出现几次1， 并且存在一个数组里
for example: 5
0  0
1  1
2  10
3  11
..
answer   [0,1,1,2,1,2]
*/
