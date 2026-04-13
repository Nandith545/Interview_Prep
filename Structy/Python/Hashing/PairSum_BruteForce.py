def pair_sum(numbers, target_sum):

  for i in range(0, len(numbers)):
    for j in range(i+1, len(numbers)):
      if target_sum == numbers[i] + numbers[j]:
        return (i, j)