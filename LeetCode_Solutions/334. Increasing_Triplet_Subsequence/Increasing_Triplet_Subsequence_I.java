class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) {
                small = n;
            } else if (n <= big) {
                big = n;
            } else {
                return true;
            }
        }
        return false;
    }
}

/*
题意：从一个无序数组里找到是否有任意三个数字是递增关系

思路：
1. 先设置两个最大数
2. 更新small假如 n小于他
3. 更新big假如大于small小于big
4. return true 假如 n 大于两个数

Time: O(n)   Space: O(1)
*/
