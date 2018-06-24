class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int up = 1, down = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                up = down + 1;
            } else if (nums[i] < nums[i - 1]) {
                down = up + 1;
            }
        }
        return Math.max(up, down);
    }
}

/*
后面比前面大时，up = down + 1
后面比前面小时，down = up + 1
后面比前面一直大，那么up 一直保持不变，同理，down也保持不变
Time: O(n)  Space: O(1)
*/
