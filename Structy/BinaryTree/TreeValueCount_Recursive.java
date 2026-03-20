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
    if(root == null){
      return 0;
    }
    int match = root.val == target ? 1 : 0;
    return match + treeValueCount(root.left, target) + treeValueCount(root.right, target);
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

