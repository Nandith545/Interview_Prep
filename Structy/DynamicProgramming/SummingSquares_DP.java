import java.util.HashMap;

class Source {
  public static int summingSquares(int n) {
    return (int) summingSquares(n, new HashMap<>());
  }
  public static double summingSquares(int n, HashMap<Integer, Double> memo) {
    if(n == 0){
      return 0;
    }

    if(memo.containsKey(n)){
      return memo.get(n);
    }
    

    double minSquares = Double.POSITIVE_INFINITY;
    for(int i=1; i <= Math.sqrt(n); i+=1){
      int square = i * i ;
      double numSquares = 1 + summingSquares(n - square, memo);
      if(numSquares < minSquares){
        minSquares = numSquares;
      }
    }
    double result = minSquares;
    memo.put(n, result);
    return minSquares;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*  
    n = the number to sum squares to
    Time: O(n)
    Space: O(n)
    Reason: We are using a memoization table to store the minimum number of squares needed to sum to each number.
*/