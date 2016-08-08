public class Solution {
    public int numIslands(char[][] grid) {
      //  bfs
      if(grid == null) {
        return 0;
      }
      
      int count = 0;
      
      for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[0].length; j++) {
          if(grid[i][j] == '1') {
            modify(grid, i, j);
            count++;
          }
        }
      }
      
    //   for(int i = 0; i < grid.length; i++) {
    //     for(int j = 0; j < grid[0].length; j++) {
    //       if(grid[i][j] == '1') {
    //         count++;
    //       }
    //     }
    //   }
      
      return count;
      
    }
    public void modify(char[][] grid, int i, int j) {
      
      int code = i * grid[0].length + j;
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.offer(code);
      
      while(!queue.isEmpty()) {
        code = queue.poll();
        int row = code / grid[0].length;
        int col = code % grid[0].length;
        
        if(row > 0 && grid[row - 1][col] == '1') {
          queue.offer((row - 1) * grid[0].length + col);
          grid[row - 1][col] = '0';
        }
        if(row < grid.length - 1 && grid[row + 1][col] == '1') {
          queue.offer((row + 1) * grid[0].length + col);
          grid[row + 1][col] = '0';
        }
        if(col > 0 && grid[row][col - 1] == '1') {
          queue.offer((row) * grid[0].length + col - 1);
          grid[row][col - 1] = '0';
        }
        if(col < grid[0].length - 1 && grid[row][col + 1] == '1') {
          queue.offer((row) * grid[0].length + col + 1);
          grid[row][col + 1] = '0';
        }
      }
      
    }
}