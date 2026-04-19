class Solution:
    def maxArea(self, height: List[int]) -> int:
        #Brute Force
        res = 0
        for l in range(len(height)):
            for r in range(l+1, len(height)):
                area = (r - l) * min(height[l], height[r])
                res = max(res, area)
        return res

#Complexity analysis:
#N is the length of the array
#Time O(n2) - array has to be iterated twice to find best 2 matches
#Space O(1) no additional data structure used for space