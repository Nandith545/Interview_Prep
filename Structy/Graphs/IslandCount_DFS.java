import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Source {
  public static int islandCount(List<List<String>> grid) {
    HashSet<SimpleEntry<Integer, Integer>> visited = new HashSet<>();    
    int count = 0;
    for (int r = 0; r < grid.size(); r += 1) {
      for (int c = 0; c < grid.get(0).size(); c += 1) {
        if(explore(r, c, grid, visited)) {
          count += 1;
        }
      }
    }
    return count;
  }
  
  public static boolean explore(int r, int c, List<List<String>> grid, HashSet<SimpleEntry<Integer, Integer>> visited) {
    boolean rowInbounds = r >= 0 && r < grid.size();
    boolean colInbounds = c >= 0 && c < grid.get(0).size();
    if (!rowInbounds || !colInbounds) {
      return false;
    }
    
    if (grid.get(r).get(c) == "W") {
      return false;
    }
    
    SimpleEntry<Integer, Integer> key = new SimpleEntry<>(r, c);
    if (visited.contains(key)) {
      return false;
    }
    visited.add(key);

    explore(r + 1, c, grid, visited);
    explore(r - 1, c, grid, visited);
    explore(r, c + 1, grid, visited);
    explore(r, c - 1, grid, visited);
    
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it    
  }
}