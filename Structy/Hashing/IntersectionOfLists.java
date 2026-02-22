import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;


class Source {
  public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
    List<Integer> result = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>(listA);

    for(int ele : listB){
      if(set.contains(ele)){
        result.add(ele);
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of listA
    m = length of listB
    Time: O(n + m)
    Space: O(n)
 */