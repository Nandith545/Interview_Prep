import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;
import java.util.Queue;
import java.util.ArrayDeque;

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
    SimpleEntry<Integer, Integer> pos = new SimpleEntry<>(r, c);
    if (visited.contains(pos) || grid.get(r).get(c) == "W") {
      return 0;
    }
    visited.add(pos);

    List<List<Integer>> deltas = List.of(
      List.of(1, 0),
      List.of(-1, 0),
      List.of(0, 1),
      List.of(0, -1)
    );
    Queue<SimpleEntry<Integer, Integer>> queue = new ArrayDeque<>();
    queue.add(new SimpleEntry<>(r, c));

    int size = 0;
    while (!queue.isEmpty()) {
      SimpleEntry<Integer, Integer> currentPos = queue.remove();
      size += 1;
      for (List<Integer> delta : deltas) {
        int dRow = delta.get(0);
        int dCol = delta.get(1);
        int neighborR = dRow + currentPos.getKey();
        int neighborC = dCol + currentPos.getValue();
        SimpleEntry<Integer, Integer> neighborPos = new SimpleEntry<>(neighborR, neighborC);
        boolean rowInbounds = neighborR >= 0 && neighborR < grid.size();
        boolean colInbounds = neighborC >= 0 && neighborC < grid.get(0).size();
        if (rowInbounds && colInbounds && !visited.contains(neighborPos) && grid.get(neighborR).get(neighborC).equals("L")) {
          visited.add(neighborPos);
          queue.add(neighborPos);
        }
      }
    }

    return size;
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