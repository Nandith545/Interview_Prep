# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def diameterOfBinaryTree(self, root):
        self.res = 0
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        
        #Returns height
        def dfs(curr):
            if not curr:
                return 0
            left = dfs(curr.left)
            right = dfs(curr.right)
            height = 1 + max(left,right)
            self.res = max(self.res, left + right)
            return height

        dfs(root)
        return self.res

#Complexity Analysis
#If N are the Number of Tree Nodes, H - Height of tree
# Time Complexity - O(N)
#As the recursion should be performed across all the nodes
#Space Complexity - O(h)