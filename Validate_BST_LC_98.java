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
    public boolean isValidBST(TreeNode root) {

        //store in order list of the tree
        List<Integer> inOrderList = new ArrayList<>();

        //populate the list
        helper(root, inOrderList);

        boolean isBST = true;
        int prev = inOrderList.get(0);

        //Check if the list is sorted
        for(int i=1; i<inOrderList.size(); i++){
            //check if the new element is greater than the previous element
            //Check if the element is not duplicate
            if(inOrderList.get(i) <= prev){
                isBST = false;
            }
            prev = inOrderList.get(i);
        }  
        return isBST;
    }

    void helper(TreeNode node, List<Integer> inOrderList){
        if(node == null) return;

        helper(node.left, inOrderList);
        inOrderList.add(node.val);
        helper(node.right, inOrderList);

    }
}
