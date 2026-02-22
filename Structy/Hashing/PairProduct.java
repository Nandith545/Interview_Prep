import java.util.List;
import java.util.HashMap;

class Source {
  public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Integer, Integer> prevNums = new HashMap<>();

    for(int i = 0; i < numbers.size(); i++){
      int num = numbers.get(i);
      int num2 = target/num;
      if(prevNums.containsKey(num2)){
        return List.of(prevNums.get(num2), i);
      }
      prevNums.put(num , i);
    }
    return null;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of numbers
    Time: O(n)
    Space: O(n)
 */