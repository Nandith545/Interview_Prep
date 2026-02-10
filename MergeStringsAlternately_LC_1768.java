class Solution {
    public String mergeAlternately(String word1, String word2) {
        String longerString = "";
        int len1 = word1.length();
        int len2 = word2.length();

        int min = Math.min(len1, len2);

        if(len1 < len2){
            longerString = word2;
        }else{
            longerString = word1;
        }

        char[] chars_word1 = word1.toCharArray();
        char[] chars_word2 = word2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<min; i++){
            sb.append(chars_word1[i]);
            sb.append(chars_word2[i]);
        }
        sb.append(longerString.substring(min));
        return sb.toString();
    }
}
