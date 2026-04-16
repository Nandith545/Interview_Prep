class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) # mapping charcount to list of anagrams

        for s in strs:
            count = [0]*26 # a.....z

            for c in s:
                count[ord(c) - ord("a")] += 1
            
            res[tuple(count)].append(s)
        
        return list(res.values())

#Complexity Details
#n - no. of strings, k - max string length
# Time O(n*k)
# Space O(n*k)