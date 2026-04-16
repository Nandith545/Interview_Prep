class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        res = []
        count = 0

        for c in s:
            if c == "(":
                res.append(c)
                count += 1
            elif c == ")" and count > 0:
                res.append(c)
                count -= 1
            elif c != ")":
                res.append(c)
        filtered = []

        for c in res[::-1]:
            if c == "(" and count > 0:
                count -= 1
            else:
                filtered.append(c)

        return "".join(filtered[::-1])

#Complexity Analysis
#Time complexity - O(N)
#Reason - one pass through the characters in a string, second pass in reverse and third to join and convert array to string
#Space complexity - we use Res[] and filteres O(N + N) = O(N)


        