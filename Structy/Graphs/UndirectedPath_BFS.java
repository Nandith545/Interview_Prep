import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayDeque;

class Source {
  public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
    Map<String, List<String>> graph = buildGraph(edges);
    HashSet<String> visited = new HashSet<>();
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.add(nodeA);
    visited.add(nodeA);
    while (!queue.isEmpty()) {
      String node = queue.remove();
      if (node.equals(nodeB)) {
        return true;
      }
      for (String neighbor : graph.get(node)) {
        if (!visited.contains(neighbor)) {
          queue.add(neighbor);
          visited.add(neighbor);
        }
      }
    }
    
    return false;
  }
  
  public static Map<String, List<String>> buildGraph(List<List<String>> edges) {
    Map<String, List<String>> graph = new HashMap<>(); 
    for (List<String> pair : edges) {
      String a = pair.get(0);
      String b = pair.get(1);
      if (!graph.containsKey(a)) {
        graph.put(a, new ArrayList<>());
      }
      if (!graph.containsKey(b)) {
        graph.put(b, new ArrayList<>());
      }
      graph.get(a).add(b);
      graph.get(b).add(a);
    }
    return graph;
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
    Space: O(e)
*/