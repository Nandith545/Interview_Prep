class Solution:
    def maxArea(self, height: List[int]) -> int:
        #Two pointer method
        max_area = 0
        l,r = 0, len(height) - 1
        while l < r:
            area = (r - l) * min(height[l], height[r])
            max_area = max(max_area, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return max_area

#Complexity analysis
#Time - O(n)
#Space - O(1) - no additional ds used
