def binary_search_index(nums, target):
    lo = 0
    hi = len(nums) - 1
  
    while lo <= hi:
        mid = (lo + hi) // 2
        if target < nums[mid]:
            hi = mid - 1
        elif  target > nums[mid]:
            lo = mid + 1
        else:
            return mid
    return lo  

#Time Complexity: O(log n)
#Space Complexity: O(1)
#Reason
