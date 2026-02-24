import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Source {
  public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
    List<String> result = new ArrayList<>();
    HashMap<String, Integer> countA = eleCount(listA);
    HashMap<String, Integer> countB = eleCount(listB);

    for(String ele : countA.keySet()){
      if(countB.containsKey(ele)){
        int minimumElement = Math.min(countA.get(ele), countB.get(ele));
        for(int i=0; i< minimumElement; i+=1){
          result.add(ele);
        }
      }
    }
    return result;
  }

  public static HashMap<String, Integer> eleCount(List<String> elements){
    HashMap<String, Integer> count = new HashMap<>();

    for(String ele : elements){
      if(!count.containsKey(ele)){
        count.put(ele, 0);
      }
      count.put(ele, count.get(ele) +1);
    }
    return count;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = length of array a
    m = length of array b
    Time: O(n+m)
    Space: O(n+m)
*/