import java.util.Stack;

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
    Stack<Node<T>> stack = new Stack<>();
    stack.push(root);
    int count = 0;
    while (!stack.isEmpty()) {
      Node<T> node = stack.pop();
      if (node.val == target) {
        count += 1;
      }
      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
      }
    }
    return count;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}