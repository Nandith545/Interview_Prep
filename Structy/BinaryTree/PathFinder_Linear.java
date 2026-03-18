import java.util.List;
import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;
  
  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class Source {
  public static <T> List<T> pathFinder(Node<T> root, T target) {
    if (root == null) {
      return null;
    }
    
    if (root.val == target) {
      return List.of(root.val);
    }
    
    List<T> leftPath = pathFinder(root.left, target);
    if (leftPath != null) {
      List<T> newPath = new ArrayList<>();
      newPath.add(root.val);
      newPath.addAll(leftPath);
      return newPath;
    }
    
    List<T> rightPath = pathFinder(root.right, target);
    if (rightPath != null) {
      List<T> newPath = new ArrayList<>();
      newPath.add(root.val);
      newPath.addAll(rightPath);
      return newPath;
    }
    
    return null;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}