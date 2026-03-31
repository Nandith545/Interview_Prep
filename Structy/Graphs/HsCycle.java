import java.util.Map;
import java.util.List;
import java.util.HashSet;

class Source {
  public static boolean hasCycle(Map<String, List<String>> graph) {
    HashSet<String> visited = new HashSet<>();
    for (String node : graph.keySet()) {
      if (cycleDetect(node, graph, new HashSet<>(), visited)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean cycleDetect(String node, Map<String, List<String>> graph, HashSet<String> visiting, HashSet<String> visited) {
    if (visited.contains(node)) {
      return false;
    } 
    
    if (visiting.contains(node)) {
      return true;
    }
    
    visiting.add(node);
    
    for (String neighbor : graph.get(node)) {
      if (cycleDetect(neighbor, graph, visiting, visited)) {
        return true;
      }
    }
    
    visiting.remove(node);
    visited.add(node);
    return false;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}