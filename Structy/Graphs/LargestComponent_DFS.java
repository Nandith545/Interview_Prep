import java.util.Map;
import java.util.List;
import java.util.HashSet;

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
  
  public static int traverseSize(Map<Integer, List<Integer>> graph, int node, HashSet<Integer> visited) {
    if (visited.contains(node)) {
      return 0;
    }
    visited.add(node);
    
    int count = 1;
    for (int neighbor : graph.get(node)) {
      count += traverseSize(graph, neighbor, visited);
    }
    return count;
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