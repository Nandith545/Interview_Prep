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
  public static int treeSum(Node<Integer> root) {
    if (root == null) {
      return 0;
    }
    
    Stack<Node<Integer>> stack = new Stack<>();
    stack.add(root);
    int sum = 0;
    while (!stack.isEmpty()) {
      Node<Integer> node = stack.pop();
      sum += node.val;
      if (node.left != null) {
        stack.push(node.left);
      }
      if (node.right != null) {
        stack.push(node.right);
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
Reason: We are using a stack to store the nodes.
*/