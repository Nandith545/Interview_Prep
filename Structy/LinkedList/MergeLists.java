class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
    
    Node<Integer> dummy = new Node<>(0);
    Node<Integer> curr1 = head1;
    Node<Integer> curr2 = head2;
    Node<Integer> head = dummy;

    while(curr1 != null && curr2 != null){
      if(curr1.val > curr2.val){
        head.next = curr2;
        curr2 = curr2.next;
      }else{
        head.next = curr1;
        curr1 = curr1.next;
      }
      head = head.next;
    }

    if(curr1 != null){
      head.next = curr1;
    }
    if(curr2 != null){
      head.next = curr2;
    }
    return dummy.next;
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