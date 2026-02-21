import java.util.HashMap;

class Source{
    public static HashMap<Character, Integer> charCount(String s){
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()){
            if(c != ' '){
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
        }
        return count;
    }
    public static char mostFrequentChar(String s){
        HashMap<Character, Integer> count = charCount(s);
        char mostFrequent = ' ';
        for(char c: s.toCharArray()){
            if(mostFrequent == ' ' ||count.get(c) > count.get(mostFrequent)){
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }

    public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of string
    time complexity O(n)
    space complexity O(n)
*/