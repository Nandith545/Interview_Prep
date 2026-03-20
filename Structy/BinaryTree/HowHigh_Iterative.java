class Source {
  public static <T> int howHigh(Node<T> root) {
    ArrayDeque<SimpleEntry<Node<T>, Integer>> queue = new ArrayDeque<>();

    if (root != null) {
      queue.add(new SimpleEntry<>(root, 0));
    }

    int maxDepth = -1;
    while (!queue.isEmpty()) {
      SimpleEntry<Node<T>, Integer> pair = queue.remove();
      Node<T> node = pair.getKey();
      int depth = pair.getValue();

      if (depth > maxDepth) {
        maxDepth = depth;
      }

      if (node.left != null) {
        queue.add(new SimpleEntry<>(node.left, depth + 1));
      }

      if (node.right != null) {
        queue.add(new SimpleEntry<>(node.right, depth + 1));
      }
    }
    return maxDepth;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
    n = number of nodes
    Time: O(n)
    Space: O(n)
*/