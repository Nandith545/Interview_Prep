/* Author: Nandith Malapati*/

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i = str.length()-1 ; i>=0; i--){
            if(str.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}


/*Improvised*/

class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        int i = str.length() - 1;
        while (str.charAt(i) != ' '){
                count++;
                i--;
            }
        return count;
    }
}
