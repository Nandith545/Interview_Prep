/*Author: Nandith Malapati
LC: House robber*/


class Solution {
    public int rob(int[] nums) {
        if (nums.length < 2) return nums[0];

        //create an array to store the maximum loot at each index
        int[] dp = new int[nums.length];

        //Memoize maximum loot at first 2 index
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        //Use them to fill the complete array
        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }

        return dp[nums.length - 1];
        
    }
}
