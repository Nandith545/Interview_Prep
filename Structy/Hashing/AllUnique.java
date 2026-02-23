import java.util.List;
import java.util.HashSet;

class Source {
  public static boolean allUnique(List<String> items) {
    HashSet<String> set = new HashSet<>(items);

    if (items.size() == set.size()){
      return true;
    }
    return false;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    length of list -> n
    time complexity -> O(n)
    space comlexity -> O(n)
*/
