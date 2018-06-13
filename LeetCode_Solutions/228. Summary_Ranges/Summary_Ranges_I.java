class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        int startRange = 0;

        for (int i = 0; i < nums.length; i++) {
            //continuous
            if (i + 1 < nums.length && nums[i] == nums[i + 1] - 1) continue;
            if (startRange == i) {
                list.add(nums[startRange] + "");
            } else {
                list.add(nums[startRange] + "->" + nums[i]);
            }
            startRange = i + 1; //update startRange
        }
        return list;
    }
}
