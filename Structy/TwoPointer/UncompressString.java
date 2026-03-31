class Source {
  public static String uncompress(String s) {
    String numbers = "0123456789";
    String result = "";
    int i=0;
    int j=0;

    while (j < s.length()){
      String character = String.valueOf(s.charAt(j));
      if(numbers.contains(character)){
        j +=1; 
      }else{
        int num = Integer.parseInt(s.substring(i, j));
        result += character.repeat(num);
        j += 1;
        i=j;
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}