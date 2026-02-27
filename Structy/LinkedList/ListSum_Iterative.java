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
    int result = 0;
    Node<Integer> current = head;

    while(current != null){
      result += current.val;
      current = current.next;
    }
    return result;
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