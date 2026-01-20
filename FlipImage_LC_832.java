class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        //int m = A.length;
        return invertImage(flipImage(A));
    }
        
        //First invert an image
        public int[][] invertImage(int[][] A){
            for(int i=0; i< A.length; i++){
            for(int j=0; j<A[i].length; j++){
                
                A[i][j] = A[i][j]==1?0:1;
            }
        }
            return A;
        }
        
        public int[][] flipImage(int[][] A){
            for(int i=0; i< A.length; i++){
            for(int j=0; j<A[i].length/2; j++){
                
                int temp = A[i][j];
                A[i][j] = A[i][A.length -j -1];
                A[i][A.length -j -1] = temp;
            }
        }
            return A;
        }
}
