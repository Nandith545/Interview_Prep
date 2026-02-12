/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Initialize a queue and add the nodes to the queue

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while(!queue.isEmpty()){
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

        //Equality check
        if(first == null && second == null){
            continue;
        }else if(first == null || second == null || first.val != second.val){
            return false;
        }

        //Add other nodes
        queue.add(first.left);
        queue.add(second.left);
        queue.add(first.right);
        queue.add(second.right);

        }
        return true;
    }
}
