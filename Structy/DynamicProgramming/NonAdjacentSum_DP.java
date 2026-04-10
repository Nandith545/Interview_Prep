import java.util.List;
import java.util.HashMap;

class Source {
  public static int nonAdjacentSum(List<Integer> nums) {
    return nonAdjacentSum(0, nums, new HashMap<>());
  }

  public static int nonAdjacentSum(int i, List<Integer> nums, HashMap<Integer, Integer> memo) {
    if(i >= nums.size()){
      return 0;
    }

    if(memo.containsKey(i)){
      return memo.get(i);
    }

    int result = Math.max(nums.get(i) + nonAdjacentSum(i+2, nums, memo), nonAdjacentSum(i+1, nums, memo));
    memo.put(i, result);
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of the numbers list
    Time: O(n)
    Space: O(n)
    Reason: We are using a memoization table to store the maximum non-adjacent sum to each index.
*/
