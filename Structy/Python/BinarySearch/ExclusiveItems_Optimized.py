def exclusive_items(a, b):
  
  difference = []
  set_a = set(a)
  set_b = set(b)

  for item in a:
    if item not in set_b:
      difference.append(item)

  for item in b:
    if item not in set_a:
      difference.append(item)

  return difference