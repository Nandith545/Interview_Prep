class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> T getNodeValue(Node<T> head, int index) {
    int count = 0;
    Node<T> current = head;
    while (current != null) {
      if (count == index) {
        return current.val;
      }
      current = current.next;
      count += 1;
    }
    return null;
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