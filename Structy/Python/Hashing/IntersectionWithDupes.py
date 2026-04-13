from collections import Counter

def intersection_with_dupes(a, b):
  count_a = Counter(a)
  count_b = Counter(b)
  result = []

  for ele in count_a:
    for i in range(0, min(count_a[ele], count_b[ele])):
      result.append(ele)

  return result