import java.util.HashMap;

class Source {

  public static int fib(int n) {
    return fib(n, new HashMap<>());
  }

  
  public static int fib(int n, HashMap<Integer, Integer> memo) {
    //Base Case
    if(n == 0 || n == 1){
      return n;
    }

    if(memo.containsKey(n)){
      return memo.get(n);
    }
    
    int result = fib(n-1, memo) + fib(n-2, memo);
    memo.put(n, result);
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of the fibonacci sequence
    Time: O(n)
    Space: O(n)
*/