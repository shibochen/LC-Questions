class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();
        
        for (Integer num : nums1) {
            set.add(num);
        }
        
        for (Integer num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        
        int i = 0;
        int[] result = new int[intersect.size()];
        for (Integer num : intersect) {
            result[i++] = num;
        }
        
        return result;
    }
}

TC: O(n)
SC: O(n)
    
Note: Very Classical Question! There are two other methods to do this question.