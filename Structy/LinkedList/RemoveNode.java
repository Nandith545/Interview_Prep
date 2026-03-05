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
    if(head.val == targetVal){
      return head.next;
    }
    Node<T> current = head;
    Node<T> prev = null;

    while(current != null){
      if(current.val == targetVal){
        prev.next = current.next;
        break;
      }
      prev = current;
      current = current.next;
    }
    return head;
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}