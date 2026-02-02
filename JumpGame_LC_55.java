class Solution {
    public boolean canJump(int[] nums) {
        //Initially the final position is the last index
        int finalPosition = nums.length - 1;

        //Start with the second last index
        for(int idx = nums.length -2 ; idx >=0 ; idx--){
            //If we can reach the final position from here
            //Update the final position flag
            if(idx + nums[idx] >= finalPosition){
                finalPosition = idx;
            }
        }
        //if we can reach the first index then we can make the jump possible
        return finalPosition == 0;
    }
}
