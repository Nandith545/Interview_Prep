class Solution {
    public int[] sortedSquares(int[] A) {
       return  square(A);
    }
    
    public int[] square(int[] A){
        int[] res = new int[A.length];
        int t =0;
        for(int i=0; i< A.length; i++){
            
            A[i] = A[i]*A[i];
            res[t++] = A[i];
            
        }
        Arrays.sort(res);
        return res;
    }
}
