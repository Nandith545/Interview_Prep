class Solution {
    public String reverseVowels(String s) {
        if(s.length() <= 1 || s == null) return s;

        char[] arr = s.toCharArray();
        int start = 0, end = s.length() -1;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I','O','U'));

        while(start < end){
            while (start < end && !vowels.contains(arr[start])) start++;
            while (start < end && !vowels.contains(arr[end])) end--;

            //Swap the vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
