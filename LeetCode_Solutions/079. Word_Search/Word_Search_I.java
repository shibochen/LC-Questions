class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
              //0 indicate the starting index number of String word
                if(search (board, i, j , word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean search (char[][] board, int i , int j , String word, int start) {
        if (start >= word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(start)) return false;

        board[i][j] = '#'; //should remember to mark it
        //check four directions to see whether there is a letter
        boolean rst = search(board, i + 1, j, word, start + 1) ||
                      search(board, i - 1, j, word, start + 1) ||
                      search(board, i, j + 1, word, start + 1) ||
                      search(board, i, j - 1, word, start + 1);
        board[i][j] = word.charAt(start);
        return rst;
    }
}

/*
直接对board数组进行修改，将其遍历过的位置改为井号，递归调用完后需要恢复之前的状态
*/
