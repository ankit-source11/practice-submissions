class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        for (int i = 0; i<grid.length; i++) {
            for (int j = 0; j<grid[0].length; j++) {
                result = result + dfs(grid, i, j);
            }
        }
        return result;
    }

    public int dfs(char[][] grid, int r, int c) {
        if (r < 0 || r > grid.length - 1 || c < 0 || c > grid[0].length - 1 || grid[r][c] == '0') {
            return 0;
        }

        grid[r][c] = '0';

        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c-1);
        dfs(grid, r, c+1);
        return 1;
    }
}
