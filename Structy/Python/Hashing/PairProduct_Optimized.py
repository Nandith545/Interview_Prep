def pair_product(numbers, target_product):
  has_seen = {}

  for index, num in enumerate(numbers):
    complement = target_product / num
    if complement in has_seen:
      return (index, has_seen[complement])
    has_seen[num] = index