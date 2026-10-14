

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Validate rows
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') continue;

                if (seen.contains(board[row][i])) return false;
                seen.add(board[row][i]);
            }
        }

        // Validate columns
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[j][col] == '.') continue;

                if (seen.contains(board[j][col])) return false;
                seen.add(board[j][col]);
            }
        }

        // Validate 3x3 sub-boxes
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {

                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;

                    if (board[row][col] == '.') continue;

                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
