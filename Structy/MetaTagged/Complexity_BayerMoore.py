class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #Bayer Moore
        cand, count = 0,0

        for n in nums:
            if count == 0:
                cand = n
            count += (1 if n == cand else -1)
        return cand

#Complexity:
#Time - O(n) - we have to traverse throuh all the elements in the list
#Space - O(1) - We are not using any additional space 