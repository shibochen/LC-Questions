class Solution {
    private int r;
    private int c;
    public int numIslands(char[][] grid) {
        int count = 0;
        r = grid.length;
        if (r == 0) return 0;
        c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}

/*
Time: O(n^2)  Space: O(1)
*/
