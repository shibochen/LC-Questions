class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
                right--;
            }
        }
        return result;
    }
}

/*
Example：
[0,1,0,2,1,0,1,3,2,1,2,1]
              *
      *       * *   *
  *   * *   * * * * * *
0 1 0 2 1 0 1 3 2 1 2 1

l                      r

leftMax左边最大值，然后能装水就是 result += leftMax - height[left]
右边同理
Time: O(n)    Space: O(1)
*/
