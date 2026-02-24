import java.util.List;

class Source {
  public static int sumOfLengths(List<String> strings) {
    int result;
    // base case is reached return
    if(strings.size() == 0){
      return 0;
    }
    result = strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    Time: O(n^2)
    Space: O(n^2)
 */