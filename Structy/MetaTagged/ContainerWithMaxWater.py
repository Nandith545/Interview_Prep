class Solution:
    def maxArea(self, height: List[int]) -> int:
    #Two pointer method
        res = 0
        l,r = 0, len(height) - 1
        while l < r:
            area = (r - l) * min(height[l], height[r])
            res = max(res, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return res 

#Complexity analysis
#Time - O(n)
#Space - O(1) - no additional ds used
