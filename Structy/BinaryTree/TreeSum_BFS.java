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
  public static int treeSum(Node<Integer> root) {
    if (root == null) {
      return 0;
    }
    
    ArrayDeque<Node<Integer>> queue = new ArrayDeque<>();
    queue.add(root);
    int sum = 0;
    while (!queue.isEmpty()) {
      Node<Integer> node = queue.remove();
      sum += node.val;
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return sum;
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
Reason: We are using a queue to store the nodes.
*/