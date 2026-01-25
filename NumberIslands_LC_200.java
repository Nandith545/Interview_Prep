/*Author : Nandith Malapati*/

class Solution {
    public int numIslands(char[][] grid) {
        //Sanity check
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        // Keep track of all the number of islands
        int count = 0;

        //Perform dfs to track all the islands
        for (int i=0; i<grid.length; i++){
          for (int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i,j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j){
        if(i<0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0'; //Marking the cell as visited

        //Explore all four directions
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
