/*Author: nandith Malapati
LC: Reverse Integer*/

class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(x != 0){
            int pop = x%10;
            x /= 10;
            if(reverse > min/10 || (reverse == min/10 && pop > 7)) return 0;
            if(reverse < max/10 || (reverse == max/10 && pop < -8)) return 0;
            reverse = reverse*10 + pop;
        }
        return reverse;
    }
}
