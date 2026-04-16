class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1]*len(nums)
        prefix = 1

        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res

#Complexity Analysis
#Time - O(2N) as we are doing 2 passes to find prefix and post fix products
# Space - O(1) in the cotext of the problem as the output array is not considered as the extra space 
