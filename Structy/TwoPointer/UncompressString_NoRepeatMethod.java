class Source {
  public static String uncompress(String s) {
    String result = "";
    String numbers = "0123456789";
    int i = 0;
    int j = 0;
    while (j < s.length()) {
      if (numbers.contains(String.valueOf(s.charAt(j)))) {
        j += 1;
      } else {
        int num = Integer.parseInt(s.substring(i, j));
        for (int count = 0; count < num; count += 1) {
          result += s.charAt(j);
        }
        j += 1;
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
    n = number of groups
    m = max num found in any group
    Time: O(n*m)
    Space: O(n*m)
*/