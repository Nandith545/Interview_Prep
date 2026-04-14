class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        bracketMap = { ")" : "(",
                       "]" : "[", 
                       "}" : "{" }
        for c in s:
            if c in bracketMap:
                if stack and stack[-1] == bracketMap[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        return True if not stack else False

#Complexity Analysis
#Time Complexity - O(N) as we have to iterate throch the chars in a string
#Space Complexity - O(N + N) ~ O(N) as we have used stack data structure to store the opening brackets and Hash Map for constant time Lookups
        