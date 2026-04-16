class Solution:
    def maximumSwap(self, num: int) -> int:
        num = list(str(num)) 

        #Initialize the variables
        max_digit = "0"
        max_i = -1
        swap_i, swap_j = -1, -1

        for i in reversed(range(len(num))):
            if num[i] > max_digit:
                max_digit = num[i]
                max_i = i
            if num[i] < max_digit:
                swap_i, swap_j = i , max_i

        num[swap_i], num[swap_j] = num[swap_j], num[swap_i]
        return int("".join(num))

#Complexity Analysis
#Time - O(N) as we need to traverse through the didgits atleast once
# Space - O(N) as we created a list of chars from num and handful of variables
