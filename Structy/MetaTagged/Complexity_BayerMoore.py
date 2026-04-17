class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #Bayer Moore
        cand, count = 0,0

        for n in nums:
            if count == 0:
                cand = n
            count += (1 if n -- cand else -1)
        return cand

