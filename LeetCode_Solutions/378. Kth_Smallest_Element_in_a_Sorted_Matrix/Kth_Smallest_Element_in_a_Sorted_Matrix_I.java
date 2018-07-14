class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0], high = matrix[matrix.length - 1][matrix[0].length - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0, j = matrix[0].length - 1;
            for (int i = 0; i < matrix.length; i++) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--;
                }
                count += (j + 1);
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

/*
使用二分法初始将left取最小值, right取最大值，然后每次扫描整个数组查找小于(left+right)/2的元素个数，如果此个数小于k，
则将left值变为mid+1，否则right = mid

http://www.cnblogs.com/grandyang/p/5727892.html
https://blog.csdn.net/qq508618087/article/details/52261637
Time: O(logn)  Space: O(1)
*/
