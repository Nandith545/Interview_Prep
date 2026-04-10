import java.util.List;
import java.util.HashMap;

class Source {
  public static int countPaths(List<List<String>> grid) {
    return countPaths(0, 0, grid, new HashMap<>());
  }

   public static int countPaths(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {

     if( r == grid.size() || c == grid.get(0).size()){
       return 0;
     }

     if(grid.get(r).get(c) == "X"){
       return 0;
     }

     if(r == grid.size() - 1 && c == grid.get(0).size() - 1){
       return 1;
     }

     List<Integer> pos = List.of(r,c);
     if(memo.containsKey(pos)){
       return memo.get(pos);
     }
     
    int result = countPaths(r+1, c, grid, memo) + countPaths(r, c+1, grid, memo);
    memo.put(pos, result);
    return result;
     
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    r = number of rows
    c = number of columns
    Time: O(r*c)
    Space: O(r*c)
    Reason: We are using a memoization table to store the number of paths to each cell.
*/