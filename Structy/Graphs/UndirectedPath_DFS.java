import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Source {
  public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
    Map<String, List<String>> graph = buildGraph(edges);
    return dfs(graph, nodeA, nodeB, new HashSet<>());
  }
  
  public static boolean dfs(Map<String, List<String>> graph, String src, String dst, HashSet<String> visited) {
    if (src.equals(dst)) {
      return true;
    }
    
    if (visited.contains(src)) {
      return false;
    }
    visited.add(src);
    
    for (String neighbor : graph.get(src)) {
      if (dfs(graph, neighbor, dst, visited)) {
        return true;
      }
    }
    
    return false;
  }
  
  public static Map<String, List<String>> buildGraph(List<List<String>> edges) {
    Map<String, List<String>> map = new HashMap<>();
    for (List<String> edge : edges) {
      String a = edge.get(0);
      String b = edge.get(1);
      if (!map.containsKey(a)) {
          map.put(a, new ArrayList<>());
      }
      if (!map.containsKey(b)) {
          map.put(b, new ArrayList<>());
      }
      map.get(a).add(b);
      map.get(b).add(a);
    }
    return map;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}