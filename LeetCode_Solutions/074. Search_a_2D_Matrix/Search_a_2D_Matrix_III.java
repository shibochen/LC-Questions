class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        if(matrix[0] == null || matrix[0].length == 0){
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0, end = row * col - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int number = matrix[mid / col][mid % col];

            if(number == target){
                return true;
            }else if (number > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;

    }
}

/*
Binary search  Once
用一次二分查找法关键就在于坐标的转换，如何把二维坐标和一维坐标转换是关键点，把
一个长度为n的一维数组转化为m*n的二维数组(m*n = n)后，
那么原一维数组中下标为i的元素将出现在二维数组中的[i/n][i%n]的位置
*/
