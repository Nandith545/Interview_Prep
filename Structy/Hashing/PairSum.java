import java.util.HashMap;
import java.util.List;

class Source{
    public static List<Integer> pairSum(List<Integer> numbers, int target){
        HashMap<Integer, Integer> seen = new HashMap<>();
        
        for(int i=0; i<numbers.size(); i+=1){
            int num = numbers.get(i);
            int complement = target - num;
            if(seen.containsKey(complement)){
                return List.of(seen.get(complement), i);
            }
            seen.put(num, i);
        }
        return List.of(-1, -1);
    }
    public static void run(){

    }
}

/*
    n = length of number array
    time complexity O(n) -> to traverse through the array
    Space complexity O(n) -> to store the seen numbers in hashmap
*/