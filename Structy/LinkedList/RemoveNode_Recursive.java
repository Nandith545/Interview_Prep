class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
    if (head.val == targetVal) {
      return head.next;
    }
    
    head.next = removeNode(head.next, targetVal);
    return head;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = size of linked list
    Time: O(n)
    Reason: We are traversing the linked list once for each node, so the time complexity is O(n).
    Space: O(n)
    Reason: We are using recursion, so the space complexity is O(n).
*/