class Solution {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0){
                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        }
        return matrix[m - 1][n - 1];
    }
}


/*
Dynamic Programming
For example:  In 3 * 3 grid system, it has 6 possible paths;
1 1 1
1 2 3
1 3 6
Time: O(m * n)   Space: O(m * n)
*/
