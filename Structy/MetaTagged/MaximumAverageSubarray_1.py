class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        if not nums:
            return 0
        cur_sum = max_sum = sum(nums[:k])
        for i in range(len(nums) - k):
            cur_sum += nums[i + k] - nums[i]
            max_sum = max(max_sum, cur_sum)
        return max_sum/k

#Complexity:
#N - No. of elements
#Time - O(n)
#Space - O(1)