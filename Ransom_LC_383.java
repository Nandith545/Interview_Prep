class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();

        //Count number of characters
        for(char c: magazine.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        //Check if RansomNote can be built
        for(char c: ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return false; //character not available
            }
            map.put(c, map.get(c) -1);
        }
        return true;
    }
}
