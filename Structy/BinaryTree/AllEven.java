import java.util.List;

class Source {
  public static boolean allEven(List<Integer> nums) {
      for(int num: nums){
        if(num%2 != 0){
          return false;
        }
      }
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}

/*
    n = number of elements
    Time: O(n)
    Space: O(1)
*/