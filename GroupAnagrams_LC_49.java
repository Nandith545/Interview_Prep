/*Author : Nandith Malapati*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }

        //Initialize a hashmap
        HashMap<String, List> ansMap = new HashMap<>();

        //Initialize the array of size 26
        int[] count = new int[26];

        //Run a for loop across given input string

        for (String s : strs){
            Arrays.fill(count, 0);

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            //Initialize a string builder to store the string value retrieved inside the char array

            StringBuilder sb = new StringBuilder("");

            //
            for(int i=0;i<26;i++){
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

            if ( !ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList());
            }
            ansMap.get(key).add(s);
        }
        return new ArrayList(ansMap.values());
    }
}
