class Source {
  public static boolean palindrome(String s) {
    int n = s.length();
    
    if (n == 0 || n == 1 || s == ""){
      return true;
    }
    if(s.charAt(0) != s.charAt(n - 1)){
      return false;
    }
    //When length is even
    
    return palindrome(s.substring(1, n-1));
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    Time Complexity -> O(n^2)
    Space Complexity -> O (n^2)
*/