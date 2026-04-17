class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        counter = {}

        for c in magazine:
            counter[c] = 1 + counter.get(c, 0)
        for c in ransomNote:
            if c not in counter:
                return False
            elif counter[c] == 1:
                del counter[c]
            else:
                counter[c] -= 1
        return True 

#Complexity
# - length of magazine, n - length of ranso not
# We iterate through both magazine and ransom not
# Time - O(m + n)
#Space - O(1)