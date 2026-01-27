/*Author : Nandith Malapati
LC: Valid Anagram*/

class Solution {
    public boolean isAnagram(String s, String t) {
        //Sanity check
        if(s.length() != t.length()){
            return false;
        }
        if(s == null || t == null){
          return false;
        }

        //Create a counter to check for character frequencies

        int[] charCount = new int[26]; //Assuming only lowercase english letters

        //Increment the count for each character present in s and decrement for each char present in t

        for(int i=0; i< s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        //return false if count is not zero
        for(int count: charCount){
            if(count != 0){
                return false;
            }
        }
       return true;
    }
}
