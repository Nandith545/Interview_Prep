class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        l, r = 0 , len(nums)- 1

        while l <= r:
            m = l + ((r - l)//2)
            #Left neighbor is greater
            if m > l and nums[m] < nums[m - 1]:
                r = m - 1
            #right neighbor is greater
            elif m < r and nums[m] < nums[m + 1]:
                l = m + 1
            else:
                return m

#Complexity:
#Time : O(logN)
#Space : O(1)

        