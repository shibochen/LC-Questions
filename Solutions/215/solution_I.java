class Solution {
    public int findKthLargest(int[] nums, int k) {
       if (nums == null || nums.length == 0) return 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}