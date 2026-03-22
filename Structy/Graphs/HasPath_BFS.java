import java.util.Map;
import java.util.List;
import java.util.ArrayDeque;

class Source {
  public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.add(src);

    while(!queue.isEmpty()) {
     String node = queue.remove();
      if (node == dst) {
        return true;
      }
      for (String neighbor : graph.get(node)) {
        queue.add(neighbor);
      }
    }
    return false;
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