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
  public static <T> int treeValueCount(Node<T> root, T target) {
    if (root == null) {
      return 0;
    }
    ArrayDeque<Node<T>> queue = new ArrayDeque<>();
    queue.add(root);
    int count = 0;
    while (!queue.isEmpty()) {
      Node<T> node = queue.remove();
      if (node.val == target) {
        count += 1;
      }
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return count;
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