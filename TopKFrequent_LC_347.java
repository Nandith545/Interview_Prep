class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length){
            return nums;
        }

        HashMap<Integer, Integer> count = new HashMap<>();

        //Run a for loop to get the count of elements corresponding to the element

        for(int n : nums){
            count.put(n, count.getOrDefault(n, 0) +1);
        }

        //Initialize a priority queue
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b));

        // For the priority queue of length K only keep higher occurring elements and pop least occurring
        for(int n : count.keySet()){
            heap.add(n);
            if(heap.size() >k){
                heap.poll();
            }
        }

        //Initialize a new array for the result
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = heap.poll();
        }
        return ans;
    }
}
