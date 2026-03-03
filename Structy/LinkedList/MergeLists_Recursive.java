class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }
    if (head1.val < head2.val) {
      head1.next = mergeLists(head1.next, head2);
      return head1;
    } else {
      head2.next = mergeLists(head1, head2.next);
      return head2;
    }
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
} 