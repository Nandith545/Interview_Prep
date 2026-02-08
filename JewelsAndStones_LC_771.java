class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        //Initialize the counter
        int count = 0;

        //Initialize the hashset to add all the unique jewels
        HashSet<Character> set = new HashSet<>();

        //Iterate the jewels and add to the set
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }

        //Iterate through the stones and count the Stones that are jewels
        for(char ch: stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        //return the count
        return count;
    }
}
