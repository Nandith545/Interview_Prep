class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        remainder = {0: -1} # hashmap of remainder and index
        total = 0

        for i,n in enumerate(nums):
            total += n
            r = total%k

            if r not in remainder:
                remainder[r] = i
            elif i - remainder[r] > 1:
                return True
        return False

#Complexity Analysis
#n - size of array and k - k distinct remainder [Maintain a hashmap for tracking the remainders]
#Time - O(n) single pass
#Space - O(min(n,k))
