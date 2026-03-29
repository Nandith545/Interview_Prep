import java.util.List;
import java.util.ArrayDeque;
import java.util.HashSet;

class Source {
  public static int closestCarrot(List<List<String>> grid, int startRow, int startCol) {
    HashSet<List<Integer>> visited = new HashSet<>();
    ArrayDeque<List<Integer>> queue = new ArrayDeque<>();
    queue.add(List.of(startRow, startCol, 0));
    visited.add(List.of(startRow, startCol));
    
    while (!queue.isEmpty()) {
      List<Integer> entry = queue.remove();
      int r = entry.get(0);
      int c = entry.get(1);
      int distance = entry.get(2);
      
      if (grid.get(r).get(c) == "C") {
        return distance;
      }
      
      List<List<Integer>> deltas = List.of(
        List.of(1, 0),
        List.of(-1, 0),
        List.of(0, 1),
        List.of(0, -1)
      );
      for (List<Integer> delta : deltas) {
        int deltaRow = delta.get(0);
        int deltaCol = delta.get(1);
        int newRow = r + deltaRow;
        int newCol = c + deltaCol;
        boolean rowInbounds = 0 <= newRow && newRow < grid.size();
        boolean colInbounds = 0 <= newCol && newCol < grid.get(0).size();
        List<Integer> key = List.of(newRow, newCol);
        if (rowInbounds && colInbounds && grid.get(newRow).get(newCol) != "X" && !visited.contains(key)) {
          visited.add(key);
          queue.add(List.of(newRow, newCol, distance + 1));
        }
      }
    }
    return -1;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    r = number of rows
    c = number of columns
    Time: O(rc)
    Space: O(rc)
 */