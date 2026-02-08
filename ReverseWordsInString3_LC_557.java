class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length - 1; i++){
            String reversedWord = reverseEachWord(words[i]);
            sb.append(reversedWord + " ");
        }
        String lastWord = reverseEachWord(words[words.length - 1]);
        sb.append(lastWord);
        return sb.toString();
    }

    private static String reverseEachWord(String word){
        String result = "";
        for(int i=word.length() - 1; i>=0; i--){
            result += word.charAt(i);
        }
        return result;
    }
}
