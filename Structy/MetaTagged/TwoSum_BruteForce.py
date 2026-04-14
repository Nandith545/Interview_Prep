class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[j] == target - nums[i]:
                    return [i,j]
        return []

#Complexity Analysis
#Time Complexity: O(n^2)
#For Each element we find its complement by loopin through the whole array hence O(n^2)
# Space Complexity: O(1)
# The space required does not depend on the input array hence constant space is used 
        