package blind75;

import java.util.Stack;

class WordSearch {
    static class Position {
        int row, col, index;

        Position(int row, int col, int index) {
            this.row = row;
            this.col = col;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word)); // Output: true
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int startRow, int startCol) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        Stack<Position> stack = new Stack<>();
        stack.push(new Position(startRow, startCol, 0));

        while (!stack.isEmpty()) {
            Position current = stack.pop();
            int row = current.row;
            int col = current.col;
            int index = current.index;

            if (index == word.length()) {
                return true;
            }

            if (row < 0 || row >= m || col < 0 || col >= n || visited[row][col] || board[row][col] != word.charAt(index)) {
                continue;
            }

            visited[row][col] = true;

            stack.push(new Position(row + 1, col, index + 1));
            stack.push(new Position(row - 1, col, index + 1));
            stack.push(new Position(row, col + 1, index + 1));
            stack.push(new Position(row, col - 1, index + 1));
        }

        return false;
    }
}
