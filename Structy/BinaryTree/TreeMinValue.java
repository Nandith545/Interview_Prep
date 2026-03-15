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
  public static Double treeMinValue(Node<Double> root) {
    Double minVal = Double.POSITIVE_INFINITY;
    if(root == null){
      return minVal;
    }

    Queue<Node<Double>> queue = new ArrayDeque<>();
    queue.add(root);

    while(!queue.isEmpty()){
      Node<Double> node = queue.remove();
      if(node.val < minVal){
        minVal = node.val;
      }
      if(node.left != null){
        queue.add(node.left);
      }
      if(node.right != null){
        queue.add(node.right);
      }
    }
    
    return minVal;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}