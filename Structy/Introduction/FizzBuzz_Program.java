import java.util.ArrayList;
import java.util.List

class Source {
  public static ArrayList<Object> fizzBuzz(int n) {
    ArrayList<Object> result = new ArrayList<Object>();

    for(int i=1; i<=n; i+=1){
      if (i%3 == 0 && i%5 == 0){
        result.add("fizzbuzz");
      }else if(i%3 == 0){
        result.add("fizz");
      }else if (i%5 == 0){
        result.add("buzz");
      }else{
        result.add(i);
      }
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = number
    Time: O(n)
    Space: O(n)
 */ 