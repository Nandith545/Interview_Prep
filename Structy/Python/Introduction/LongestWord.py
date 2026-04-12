def longest_word(sentence):
  words = sentence.split(" ")
  longest = ""
  for word in words:
    if len(word) >= len(longest):
      longest = word
  return longest

  #Time Complexity: O(n)
  #Space Complexity: O(n)
  #Reason: We are using a list to store the words and a variable to store the longest word.