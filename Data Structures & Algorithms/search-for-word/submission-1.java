class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j<board[0].length; j++) {
                if (word.charAt(0) == board[i][j] &&
                    dfs(i, j, word, board, 0, visited)) {
                        return true;
                    }
            }
        }
        return false;
    }

    public boolean dfs(int r, int c, String word, char[][] board, int index, boolean[][] visited) {
        if (index == word.length()) {
            return true;
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || word.charAt(index) != board[r][c] || visited[r][c]) {
                return false;
        }
        visited[r][c] = true;
        if (dfs(r+1, c, word, board, index+1, visited) || 
            dfs(r-1, c, word, board, index+1, visited) || 
            dfs(r, c+1, word, board, index+1, visited) ||
            dfs(r, c-1, word, board, index+1, visited)) {
                return true;
            }
        visited[r][c] = false;    
        return false;
    }
}
