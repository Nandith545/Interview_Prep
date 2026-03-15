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
    if(root == null){
      return false;
    }

    if(root.val == target){
      return true;
    }
    return (treeIncludes(root.left, target) || treeIncludes(root.right, target) );
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}