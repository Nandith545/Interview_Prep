import java.util.List;
import java.util.ArrayList;

class Source {
  public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
    List<Integer> difference = new ArrayList<>();

    for (int item : a) {
      if (!b.contains(item)) {
        difference.add(item);
      }
    }

    for (int item : b) {
      if (!a.contains(item)) {
        difference.add(item);
      }
    }
    return difference;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
n = length of array a, m = length of array b
Time: O(n*m)
Space: O(n+m)
*/
