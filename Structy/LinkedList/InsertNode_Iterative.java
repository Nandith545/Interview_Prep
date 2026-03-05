class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
    Node<T> curr = head;
    Node<T> prev = null;
    int count = 0;
    if(index == 0){
      Node<T> newNode = new Node<>(value);
      newNode.next = head;
      return newNode;
    }
    
    while(true){
      if(count == index){
        Node<T> newNode = new Node<>(value);
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
      }
      count += 1;
      prev = curr;
      curr = curr.next;
    }
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}

/**
  n = size of linked list
  Time: O(n)
  Reason: We are traversing the linked list once for each node, so the time complexity is O(n).
  Space: O(1)
  Reason: We are not using any extra space, so the space complexity is O(1).
*/
 