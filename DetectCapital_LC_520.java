class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count = 0;
        for(int i=0; i<n; i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        if (count == 0 || count == n) return true;
        if (Character.isUpperCase(word.charAt(0)) && count == 1) return true;
        return false;
    }
}
