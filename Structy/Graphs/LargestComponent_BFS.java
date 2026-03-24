import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Queue;
import java.util.ArrayDeque;

class Source {
  public static int largestComponent(Map<Integer, List<Integer>> graph) {
    HashSet<Integer> visited = new HashSet<>();
    int maxSize = 0;
    for (int node : graph.keySet()) {
      int size = traverseSize(graph, node, visited);
      if (size > maxSize) {
        maxSize = size;
      }
    }
    return maxSize;
  }
  
  public static int traverseSize(Map<Integer, List<Integer>> graph, int src, HashSet<Integer> visited) {
    if (visited.contains(src)) {
      return 0;
    }
    visited.add(src);
    
    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(src);
    int size = 0;

    while (!queue.isEmpty()) {
      int node = queue.remove();
      size += 1;
      for (int neighbor : graph.get(node)) {
        if (!visited.contains(neighbor)) {
          visited.add(neighbor);
          queue.add(neighbor);
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
    n = number of nodes
    e = number edges
    Time: O(e)
    Space: O(n)
*/