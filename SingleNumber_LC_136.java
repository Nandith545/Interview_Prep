class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}

/*Time: O(n)

Space: O(1)

No extra data structures needed

No sorting required*/
