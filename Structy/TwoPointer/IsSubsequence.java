class Source {
  public static boolean isSubsequence(String string1, String string2) {
    int i = 0;
    int j = 0;
    int m = string1.length();
    int n = string2.length();

    while(i < m && j < n){
      if(string1.charAt(i) == string2.charAt(j)){
        i++;
        j++;
      }else{
        j++;
      }
    }
    return i == string1.length();
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of string1
    m = length of string2
    Time: O(n + m)
    Space: O(1)
*/