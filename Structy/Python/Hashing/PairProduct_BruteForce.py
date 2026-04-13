def pair_product(numbers, target_product):
  for i in range(0, len(numbers)):
    for j in range(i+1, len(numbers)):
      if target_product == numbers[i] * numbers[j]:
        return (i,j)