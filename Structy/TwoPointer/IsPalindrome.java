class Source {
  public static boolean isPalindrome(String s) {
    int m = 0;
    int n = s.length() -1;

    while(m < n){
      if(s.charAt(m) != s.charAt(n)){
        return false;
      }
      m++;
      n--;
    }
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

