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
    if (root == null) {
      return Double.POSITIVE_INFINITY;
    }
    double minChildVal = Math.min(treeMinValue(root.left), treeMinValue(root.right));
    return Math.min(root.val, minChildVal);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}