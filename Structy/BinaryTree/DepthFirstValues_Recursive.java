import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
  

class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;
  
  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class Source {
  public static List<String> depthFirstValues(Node<String> root) {
    //Start with the base case
    List<String> values = new ArrayList<>();

    if(root == null){
      return List.of();
    }

    //Declare a new ArrayList that holds the depthFirstValues
    values.add(root.val);
    values.addAll(depthFirstValues(root.left));
    values.addAll(depthFirstValues(root.right));

    return values;
  }

  //Time coplexity O(n)
  //Space complexity O(n)

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
