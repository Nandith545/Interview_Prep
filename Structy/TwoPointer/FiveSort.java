import java.util.List;
import java.util.Collections;

class Source {
  public static List<Integer> fiveSort(List<Integer> array) {
    int i = 0;
    int j = array.size() - 1;

    while(i < j){
      if(array.get(j) == 5){
        j -= 1;
      }
      else if(array.get(i) != 5){
        i+=1;
      }else{
        Collections.swap(array, i, j);
      }
    }
    return array;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}


/*
    n = length of array
    Time: O(n)
    Space: O(1)
*/