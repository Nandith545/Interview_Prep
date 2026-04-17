# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:

        def dfs(root):
            if not root:
                return [True, 0]
            left, right = dfs(root.left), dfs(root.right)
            balanced = (left[0] and right[0]) and abs(left[1] - right[1]) <= 1
            return [balanced, 1+ max(left[1], right[1])]
        return dfs(root)[0]

#Complexity
#Time - O(n) as we only raverse through the node once to check if the node is balanced from that spot and track both balance and height
#Space - O(n) - We use call stack for recursion
            

        
    