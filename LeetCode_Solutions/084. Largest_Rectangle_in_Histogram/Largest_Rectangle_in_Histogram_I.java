class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i <= heights.length; i++) {
            int h = i == heights.length ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int start = stack.isEmpty() ? -1 : stack.peek();
                int area = height * (i - start - 1);
                result = Math.max(result, area);
            }
            stack.push(i);
        }
        return result;
    }
}

/*
stack:
1. 升序推进
2. 小于，则计算面积
3. 对比并找出最大面积
Time: O(n)   Space: O(n)
*/
