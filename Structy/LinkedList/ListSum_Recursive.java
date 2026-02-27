class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    if (head == null) {
      return 0;
    }
    return head.val + sumList(head.next);
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