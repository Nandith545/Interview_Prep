class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        //This is to find unique triplets
        Set<List<Integer>> result = new HashSet<>();
        
        //Sort the nums array
        Arrays.sort(nums);

        //Sanity check
        if ( nums == null || nums.length < 3) return new ArrayList<>();
        //Now fix the first element and iterate through the list
        for(int i=0; i<nums.length -2 ; i++){

            //Find other 2 elements using 2 sum approach
            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    //Add the sum and move to find other triplets
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if (sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
