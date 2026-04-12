def pairs(elements):
  result = []
  
  for i in range(0,len(elements)):
    for j in range(i + 1, len(elements)):
      pair = [elements[i], elements[j]]
      result.append(pair)
      
  return result
# n is the length of the elements list
#Time Complexity: O(n^2)
#Space Complexity: O(n^2)
#Reason: We are using a list to store the result.