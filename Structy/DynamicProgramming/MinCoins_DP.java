import java.util.List;
import java.util.HashMap;

class Source {


  public static int minChange(int amount, List<Integer> coins){
    return minChange(amount, coins, new HashMap<>());
  } 
  public static int minChange(int amount, List<Integer> coins, HashMap<Integer, Integer> memo) {
    if(amount == 0){
      return 0;
    }

    if(amount < 0){
      return -1;
    }

    if(memo.containsKey(amount)){
      return memo.get(amount);
    }
    
    int minCoins = -1;
    for(int coin : coins){
      int subAmount = amount - coin;
      int subCoins = minChange(subAmount, coins, memo);
      if(subCoins != -1){
        int numCoins = 1 + subCoins;
        if(numCoins < minCoins || minCoins == -1){
          minCoins = numCoins;
        }
      }
    }
    memo.put(amount, minCoins);
    return minCoins;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    a = amount
    c = # coins
    Time: O(a*c)
    Space: O(a)
    Reason: We are using a memoization table to store the minimum number of coins needed for each amount.
*/