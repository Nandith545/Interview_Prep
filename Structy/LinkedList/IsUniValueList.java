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
    Node<T> current = head;
    T value = head.val;

    while(current != null){
      if(current.val != value){
        return false;
      }
      current = current.next;
    }
    return true;
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
