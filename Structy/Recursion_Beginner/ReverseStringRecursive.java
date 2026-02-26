class Source {
  public static String reverseString(String s) {
    String result;
    int length = s.length();
    if(s.length() == 0){
      return "";    
    }
    result = reverseString(s.substring(1)) + s.charAt(0);
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
  Call stack is required to store
  Time complexity O(n^2)
  Space Complexity O(n^2)

*/