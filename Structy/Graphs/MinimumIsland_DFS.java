import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Source {
  public static int minimumIsland(List<List<String>> grid) {
    HashSet<SimpleEntry<Integer, Integer>> visited = new HashSet<>();
    double min = Double.POSITIVE_INFINITY;
    for (int r = 0; r < grid.size(); r += 1) {
      for (int c = 0; c < grid.get(0).size(); c += 1) {
        double size = exploreSize(r, c, grid, visited);
        if (size > 0 && size < min) {
          min = size;
        }
      }
    }
    
    return (int) min;
  }
  
  public static double exploreSize(int r, int c, List<List<String>> grid, HashSet<SimpleEntry<Integer, Integer>> visited) {
    boolean rowInbounds = 0 <= r && r < grid.size();
    boolean colInbounds = 0 <= c && c < grid.get(0).size();
    if (!rowInbounds || !colInbounds) {
      return 0;
    }
    
    if (grid.get(r).get(c) == "W") {
      return 0;
    }
    
    SimpleEntry<Integer, Integer> key = new SimpleEntry<>(r, c);
    if (visited.contains(key)) {
      return 0;
    }
    visited.add(key);
    
    int totalSize = 1;
    totalSize += exploreSize(r + 1, c, grid, visited);
    totalSize += exploreSize(r - 1, c, grid, visited);
    totalSize += exploreSize(r, c + 1, grid, visited);
    totalSize += exploreSize(r, c - 1, grid, visited);
    return totalSize;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}