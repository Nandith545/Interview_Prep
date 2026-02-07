class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in the dec part of array
                //this may be ans but look left
                //this is why end != mid -1
                end = mid;

            }else{
                start = mid +1; //because we kmnow mid+1 > mid element
            }
        }

        //in the end start == end and pointing to the largest number 
        //At every point in time we are finding the maximum possible value
        return start;
    }
}
