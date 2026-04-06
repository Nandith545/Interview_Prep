class Source {
  public static int tribonacci(int n) {
    if (n == 0 || n == 1) {
      return 0;
    }

    if (n == 2) {
      return 1;
    }
    return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}