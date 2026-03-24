import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.AbstractMap.SimpleEntry;

class Source {
  public static int shortestPath(List<List<String>> edges, String nodeA, String nodeB) {
    HashMap<String, List<String>> graph = buildGraph(edges);
    HashSet<String> visited = new HashSet<>();
    ArrayDeque<SimpleEntry<String, Integer>> queue = new ArrayDeque<>();

    queue.add(new SimpleEntry<>(nodeA, 0));
    visited.add(nodeA);
    while(!queue.isEmpty()){
      SimpleEntry<String, Integer> entry = queue.remove();
      String node = entry.getKey();
      int distance = entry.getValue();
      if(node == nodeB){
        return distance;
      }
      for(String neighbor: graph.get(node)){
        if(!visited.contains(neighbor)){
          queue.add(new SimpleEntry<>(neighbor, distance + 1));
          visited.add(neighbor);
        }
      }
    }
    return -1;
  }

  public static HashMap<String,List<String>> buildGraph(List<List<String>> edges){
    HashMap<String,List<String>> map = new HashMap<>();

    for(List<String> edge: edges){
      String a = edge.get(0);
      String b = edge.get(1);
      if(!map.containsKey(a)){
        map.put(a, new ArrayList<>());
      }
      if(!map.containsKey(b)){
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
