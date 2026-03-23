import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;

class Source {
  public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {
    HashSet<Integer> visited = new HashSet<>();
    int count = 0;
    for (int node : graph.keySet()) {
      if (traverseComponent(graph, node, visited)) {
        count += 1;
      }
    }
    return count;
  }
  
  public static boolean traverseComponent(Map<Integer, List<Integer>> graph, int src, HashSet<Integer> visited) {
    if (visited.contains(src)) {
      return false;
    }
    visited.add(src);
    
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(src);

    while (!queue.isEmpty()) {
      int node = queue.remove();
      for (int neighbor : graph.get(node)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          queue.add(neighbor);
        }
      }
    }
    
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}