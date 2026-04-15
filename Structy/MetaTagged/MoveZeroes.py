class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        l = 0
        for r in range(len(nums)):
            if nums[r]:
                nums[l] , nums[r] = nums[r] , nums[l]
                l += 1
        return nums

#complexity Details:
#Time complexity - O(N) as all the elements have to be traversed through
#Space complexity - O(1) as we did not use any additional data structures
            
