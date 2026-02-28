class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean linkedListFind(Node<T> head, T target) {
    if (head == null) {
      return false;
    }
    if (head.val == target) {
      return true;
    }
    return linkedListFind(head.next, target);
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