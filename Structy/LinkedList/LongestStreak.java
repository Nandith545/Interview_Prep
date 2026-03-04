class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> int longestStreak(Node<T> head) {
    int countMax = 0;
    int count = 0;
    Node<T> current = head;
    T prevVal = null;

    while(current != null){
      if(prevVal == current.val){
        count += 1;
      }else{
        count = 1;
      }
      if(count > countMax){
        countMax = count;
      }
      prevVal = current.val;
      current = current.next;
    }
    return countMax;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}