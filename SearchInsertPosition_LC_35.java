class Solution {
    public int findKthLargest(int[] nums, int k) {

        //Initialize a priority Queue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num: nums){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); //Remove the smallest element to maintain the heap size as K
            }
        }
        return minHeap.peek();
    }
}
