class Source {
  public static long factorial(int n) {
    long result;

    if (n == 0){
      return 1;
    }
    result = n * factorial( n - 1 ) ;
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    Time: O(n)
    Space: O(n)
*/
