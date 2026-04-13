from collections import Counter

def intersection_with_dupes(a, b):
  count_a = Counter(a)
  count_b = Counter(b)
  result = []

  for ele in count_a:
    for i in range(0, min(count_a[ele], count_b[ele])):
      result.append(ele)

  return result

# n is length of a and m is length of b
#Time Complexity: O(n + m)
#Space Complexity: O(n + m)
#Reason: We are using a Counter to store the elements of a and b.
#Reason: We are iterating through the elements of a and b to find the intersection.
