class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLen += 1;
                }

                len = Math.max(len, currentLen);
            }
        }
        return len;
    }
}

/*
题意：给一个无序数组，然后找出最长连续数字的长度

思路：
1. 首先将所有数字都存放在hashset里
2. 由于连续数字是 +1 / -1，所以先看下-1后是否有这个数字
3. 不存在，则就从该位数 + 1上看，然后一直循环，找到最大数
Time: O(n)   Space: O(n)
*/
