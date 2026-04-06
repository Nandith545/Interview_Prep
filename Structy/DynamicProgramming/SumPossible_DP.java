import java.util.List;
import java.util.HashMap;

class Source {

  public static boolean sumPossible(int amount, List<Integer> numbers) {
    return sumPossible(amount, numbers, new HashMap<>());
  }

  
  public static boolean sumPossible(int amount, List<Integer> numbers, HashMap<Integer, Boolean> memo) {
    if(amount == 0){
      return true;
    }

    if(amount < 0){
      return false;
    }

    if(memo.containsKey(amount)){
      return memo.get(amount);
    }

    for(int num: numbers){
      int subAmount = amount - num;
      if(sumPossible(subAmount, numbers, memo)){
        memo.put(amount, true);
        return true;
      }
    }
    memo.put(amount, false);
    return false;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
