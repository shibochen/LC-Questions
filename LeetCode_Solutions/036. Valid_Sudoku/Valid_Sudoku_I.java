class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> cols = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for(int j = 0; j < board[0].length; j++){
                //检测横排有没有重复
                if(board[i][j] != '.' && !rows.add(board[i][j]))
                    return false;
                //检查竖排有没有重复
                if(board[j][i] != '.' && !cols.add(board[j][i]))
                    return false;
                int RowIndex = 3 * (i / 3);
                int ColIndex = 3 * (i % 3);
                //检查 3 * 3 小方块里有没有重复，具体看下面表格
                if(board[RowIndex + j / 3][ColIndex + j % 3] != '.' && !cube.add(board[RowIndex + j / 3][ColIndex + j % 3]))
                    return false;
            }
        }
        return true;
    }
}

/*
      i    0 1 2 3 4 5 6 7 8             i = 0    RowIndex = 0   ColIndex = 0
      -----------------------                    [0,0] [0,1] [0,2]
RowIndex   0 0 0 3 3 3 6 6 6                     [1,0] [1,1] [1,2]
ColIndex   0 3 6 0 3 6 0 3 6                     [2,0] [2,1] [2,2]

      j    0 1 2 3 4 5 6 7 8
      ----------------------
j / 3      0 0 0 1 1 1 2 2 2
j % 3      0 1 2 0 1 2 0 1 2
*/
