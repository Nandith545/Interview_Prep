/*Author: Nandith Malapati
LC: Two Sum */

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //Create a hash map
        Map<Integer, Integer> map = new HashMap<>();

        //Iterate through an Array

        for(int i=0; i< nums.length; i++){
            //calculate the complement of the current number
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                //if found return the indices of the complement and the current number
               return new int[]{map.get(complement), i};
            }
            //Otherwise just add the current number and its index to the map
            map.put(nums[i], i);
        }
         return new int[] {}; // return empty array if no solution is found
    }
}
