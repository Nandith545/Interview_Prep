import java.util.List;
import java.util.HashMap;

class Source {
  public static int maxPathSum(List<List<Integer>> grid) {
    return (int) maxPathSum(0, 0, grid, new HashMap<>());
  }

  public static double maxPathSum(int r, int c, List<List<Integer>> grid, HashMap<List<Integer>, Double> memo) {
    
    if(r == grid.size() || c == grid.get(0).size()){
      return Double.NEGATIVE_INFINITY;
    }
    
    if(r == grid.size() - 1 && c == grid.get(0).size() - 1){
      return grid.get(r).get(c);
    }

    List<Integer> pos = List.of(r, c);

    if(memo.containsKey(pos)){
      return memo.get(pos);
    }
    
    double result = grid.get(r).get(c) + Math.max(maxPathSum(r+1, c, grid, memo), maxPathSum(r, c+1, grid, memo));
    memo.put(pos, result);
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
