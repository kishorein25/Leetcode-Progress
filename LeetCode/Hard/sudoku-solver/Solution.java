
class Solution {
    public void solveSudoku(char[][] board) {

        int n = board.length;
        int m = board[0].length;
        int[][] intboard = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    intboard[i][j] = 0;
                } else {
                    intboard[i][j] = board[i][j] - '0';
                }
            }
        }

        solve(intboard, 0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (intboard[i][j] == 0) {
                    board[i][j] = '.';
