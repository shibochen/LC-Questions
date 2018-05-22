class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int length = obstacleGrid[0].length;
        int[] result = new int[length];
        result[0] = 1;

        for(int i = 0; i < obstacleGrid.length; i++){
            for(int j = 0; j < length; j++){
                if(obstacleGrid[i][j] == 1){
                    result[j] = 0;
                 }else if(j > 0){
                    result[j] += result[j - 1];
                }
            }
        }
        return result[length - 1];
    }
}

/*
similar to LC 62
Time: O(n * m)  space: O(n)
*/
