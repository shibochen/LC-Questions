class Solution {
    public void rotate(int[][] matrix) {
      //对斜轴进行对换
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
      //对中心轴进行对换
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
}


/*
Time: O(n*m)   Space: O(1);

1 2 3          1 4 7          7 4 1
4 5 6   -----> 2 5 8   -----> 8 5 2
7 8 9          3 6 9          9 6 3

这个题可以进行2次旋转。 第一次 按照斜轴 1 5 9 进行对换，然后再按照 中心轴 4 5 6 进行对换
*/
