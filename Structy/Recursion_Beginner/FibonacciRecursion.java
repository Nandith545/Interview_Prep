class Source {
  public static int fibonacci(int n) {
    if(n <= 1){
      return n;
    }
    return  fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}


/*
    Time comp - O(2^n)
    space - O(n)
*/