class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for n in nums:
            if n in seen:
                return True
            seen.add(n)
        return False

#Complexity analysis:
#n - no. of elements in a list
#Time - O(n) [worst case time complexity] - we traverse through each element until we find a duplicate
#Space - O(n) using set to store seen values