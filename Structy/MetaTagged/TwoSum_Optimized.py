class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap = {}
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in hashmap:
                return [i, hashmap[complement]]
            hashmap[nums[i]] = i
        #Return an empty list if no solution is found
        return []

#Complexity Analysis
#N - Length of the nums Array
#Time Complexity -O(N)
# We use hash map for constant time lookup for the complements of each element in the array
#Space Complexity O(N)
# We use hashmap to store the complements of the numbers for constant time lookups

