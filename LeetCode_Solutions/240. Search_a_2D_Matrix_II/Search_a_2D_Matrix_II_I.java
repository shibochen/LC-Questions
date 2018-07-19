class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}

/*
思路：
1. 首先将target跟 matrix[0][matrix[0].length - 1] 进行对比
2. 大于他，将row移动下层，小于他，将col向左移动
3. 找到返回true， 找不到返回false

Time: O(m*n)   Space: O(m*n)
*/
