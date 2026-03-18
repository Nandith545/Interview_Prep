import java.util.Queue;
import java.util.ArrayDeque;

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
  public static Double maxPathSum(Node<Double> root) {
    Double maxSum = Double.NEGATIVE_INFINITY;
    if(root == null){
      return maxSum;
    }
    if(root.left == null && root.right == null){
      return root.val;
    }
    return root.val + Math.max(maxPathSum(root.left), maxPathSum(root.right));
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
n = number of nodes
Time: O(n)
Space: O(n)
Reason: We are visiting each node once and adding the value to the list.
*/