class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int m = A.length;
        
        int[] array = new int[m];
        int t=0;
        
        for(int i=0; i<m; ++i){
            if(A[i]%2 == 0){
                
                array[t++] = A[i];
            }
        }
        for(int i=0; i<m; ++i){
            if(A[i]%2 == 1){
                
                array[t++] = A[i];
            }
        }
        return array;
    }
}
