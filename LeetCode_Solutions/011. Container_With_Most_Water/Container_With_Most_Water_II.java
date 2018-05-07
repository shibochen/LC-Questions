class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int low = 0, high = height.length - 1;
        while(low < high){
            maxArea = Math.max(maxArea, Math.min(height[high], height[low]) * (high - low));
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        return maxArea;
    }
}

/*
Method: two pointer

Time: O(n)  Space: O(n)
*/
