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
    return reverseList(head, null);
  }

  public static <T> Node<T> reverseList(Node<T> head, Node<T> prev) {
    if(head == null){
      return prev;
    }
    Node<T> next = head.next;
    head.next = prev;
    return reverseList(next, head);
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