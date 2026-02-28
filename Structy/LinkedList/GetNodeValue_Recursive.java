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
    
    if(head == null) return null;
    if(index == 0) return head.val;
    return getNodeValue(head.next, index - 1);
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