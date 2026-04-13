def exclusive_items(a, b):
  result = []
  for item in b:
    if item not in a:
      result.append(item)

  for item in a:
    if item not in b:
      result.append(item)
  return result