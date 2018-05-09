class Solution {
    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                // add up numbers in row[0]
                if(i == 0 && j != 0) grid[i][j] += grid[i][j-1];
                //add up numbers in column[0]
                if(i != 0 && j == 0) grid[i][j] += grid[i - 1][j];
                // add up numbers in diagonal position and adjacent  min number to grid[row][column]
                if(i != 0 && j != 0){
                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}


/*
1 3 1            1 4 5
1 5 1    ---->   2 7 6
4 2 1            6 8 7


Time: O(m * n)    Space: O(1)
*/
