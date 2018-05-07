class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0;
        for (int i = 0; i < height.length; i++)
            for (int j = i + 1; j < height.length; j++)
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
        return maxarea;
    }
}

/*
这个题目：在一个2D平面上，给你一组高度的数字，然后求出最大的面积。

坐标点是 （index, height[index]）

Brutal Force

Time: O(n^2)  Space: O(1);
*/
