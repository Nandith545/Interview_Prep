class Source {
  public static boolean isPrime(int number) {

    if (number < 2) return false;

    for(int i=2; i <= Math.sqrt(number); i++){
      if(number % i == 0){
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
    n = number
    Time: O(sqrt(n))
    Space: O(1)
 */ 