class Solution:
    def lowestCommonAncestor(self, p: 'Node', q: 'Node') -> 'Node':
        seen = set()

        while p:
            seen.add(p)
            p = p.parent
        while q:
            if q in seen:
                return q
            q = q.parent

#Complexity Analysis:
#Time - O(N) (Travers through both p and q parents) (Worst case)
#Space - O(N) (used hash set to keep track of visited nodes)
