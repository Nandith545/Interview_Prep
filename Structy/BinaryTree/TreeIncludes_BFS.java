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
  public static boolean treeIncludes(Node<String> root, String target) {
    if (root == null) {
      return false;
    }
    ArrayDeque<Node<String>> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      Node<String> current = queue.remove();
      if (current.val == target) {
        return true;
      }
      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
    return false;
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