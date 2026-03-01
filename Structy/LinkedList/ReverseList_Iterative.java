class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> previous = null;
    Node<T> current = head;
    while (current != null) {
      Node<T> next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}

/*
    n = size of linked list
    Time: O(n)
    Space: O(1)
*/