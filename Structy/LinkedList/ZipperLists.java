class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
    Node<T> head = head1;
    Node<T> tail = head;
    Node<T> curr1 = head1.next;
    Node<T> curr2 = head2;
    int count = 0;

    while(curr1 != null && curr2 != null){
      if(count%2 == 0){
        tail.next = curr2;
        curr2 = curr2.next;
      }else{
        tail.next = curr1;
        curr1 = curr1.next;
      }
      count += 1;
      tail = tail.next;
    }

    if(curr1 != null){
      tail.next = curr1;
    }

    if(curr2 != null){
      tail.next = curr2;
    }
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
    Space: O(1)
*/