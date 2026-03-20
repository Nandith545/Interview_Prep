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
  public static <T> int howHigh(Node<T> root) {
    if(root == null){
      return -1;
    }
    return 1 + Math.max(howHigh(root.left) , howHigh(root.right));
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