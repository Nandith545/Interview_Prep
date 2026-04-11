import java.util.List;
import java.util.HashMap;

class Source {
  public static int countingChange(int amount, List<Integer> coins) {
    return countingChange(amount, 0, coins, new HashMap<>());
  }

   public static int countingChange(int amount, int coinIdx, List<Integer> coins, HashMap<List<Integer>, Integer> memo) {
    // todo
     if(amount == 0){
       return 1;
     }

     if(coinIdx == coins.size()){
       return 0;
     }

     List<Integer> key = List.of(amount, coinIdx);
     if(memo.containsKey(key)){
       return memo.get(key);
     }

     int value = coins.get(coinIdx);

     int totalWays = 0;
     for(int qty = 0; qty * value <= amount ; qty+=1){
      int subAmount = amount - (qty * value);
      totalWays += countingChange(subAmount, coinIdx + 1, coins, memo);
     }
     
    memo.put(key, totalWays);
    return totalWays;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
