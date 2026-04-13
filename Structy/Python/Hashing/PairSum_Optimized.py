def pair_sum(numbers, target_sum):
  has_seen = {}

  for index, number in enumerate(numbers):
    complement = target_sum - number
    if complement in has_seen:
      return (index, has_seen[complement])
    has_seen[number] = index