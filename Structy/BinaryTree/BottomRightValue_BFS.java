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
  public static <T> T bottomRightValue(Node<T> root) {
    Queue<Node<T>> queue = new ArrayDeque<>();
    queue.add(root);
    Node<T> node = null;
    while(!queue.isEmpty()){
      node = queue.remove();
      T val = node.val;
      if(node.left != null){
        queue.add(node.left);
      }
      if(node.right != null){
        queue.add(node.right);
      }
    }
    return node.val;
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
*/