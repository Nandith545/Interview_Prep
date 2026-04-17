class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) # mapping charcount to list of anagrams

        for s in strs:
            res[tuple(sorted(s))].append(s)
        return list(res.values())
            

