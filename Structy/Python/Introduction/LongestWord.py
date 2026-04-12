def longest_word(sentence):
  words = sentence.split(" ")
  longest = ""
  for word in words:
    if len(word) >= len(longest):
      longest = word
  return longest

  #Time Complexity: O(n)
  #Space Complexity: O(1)
  #Reason: We are only using a single variable to store the longest word.