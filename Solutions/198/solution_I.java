class Solution {
    public int rob(int[] nums) {
        int robNo = 0;
        int robYes = 0;
        
        for (int num : nums) {
            int temp = robNo;
            robNo = Math.max(robNo, robYes);
            robYes = num + temp;
        }
        return Math.max(robNo, robYes);
    }
}