class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i>=0; i--){
            //Set all nines at the end of the array to 0
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                //Increase right most not nine by 1
                digits[i]++;
                //job done
                return digits;
            }

        }
        //When all the digits are 9
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
        
    }
}
