import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Source {
  public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
    HashSet<Integer> setA = new HashSet<>(a);
    HashSet<Integer> setB = new HashSet<>(b);
    List<Integer> result = new ArrayList<>();

    for (int elem : a) {
      if(!setB.contains(elem)){
        result.add(elem);
      }
    }
    for (int elem : b) {
      if(!setA.contains(elem)){
        result.add(elem);
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}