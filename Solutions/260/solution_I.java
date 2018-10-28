class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
             diff ^= num;
        }
        diff &= -diff;
        int[] result = new int[2];
        for (int num : nums) {
            if ((diff & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        return result;
    }
}


TC: O(n)
SC: O(1)
Note: Look at detailed explanations on website.