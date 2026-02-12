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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            //No of nodes at the current level
            int levelSize = q.size();
            //Last element in that level
            int lastValue = 0;

            for(int i=0; i<levelSize; i++){
                TreeNode current = q.poll();
                //update last value with the current node
                lastValue = current.val;

                //Add child nodes to queue for next level of processing
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
            result.add(lastValue);
        }
        return result;
    }
}
