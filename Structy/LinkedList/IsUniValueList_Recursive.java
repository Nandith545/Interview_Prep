class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean isUnivalueList(Node<T> head) {
    return isUnivalueList(head, head.val);
  }
  
  public static <T> boolean isUnivalueList(Node<T> head, T value) {
    if (head == null) {
      return true;
    }
    if (head.val != value) {
      return false;
    }
    return isUnivalueList(head.next, value);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = size of linked list
    Time: O(n)
    Space: O(n)
*/