class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #HashMap solution
        count = {} # values - > count
        candidate, max_count =  0 , 0

        for n in nums:
            count[n] = 1 + count.get(n, 0)
            candidate = n if count[n] > max_count else candidate
            max_count = max(count[n], max_count)
        return candidate

#Complexity
#Time - O(n) - traverse through the list atleast once
#Space - Using Hash Map DS to store all the element's and count