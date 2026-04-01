class Source {
  public static String compress(String s) {
    s += "!";
    String result = "";
    int i = 0;
    int j = 0;
    while (j < s.length()) {
      if (s.charAt(i) == s.charAt(j)) {
        j += 1;
      } else {
        int count = j - i;
        if (count > 1) {
          result += "" + count + s.charAt(i);
        } else {
          result += s.charAt(i);
        }
        i = j;
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}

/*
    n = length of string
    Time: O(n)
    Space: O(n)
*/