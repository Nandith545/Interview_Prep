class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;

        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] box = new HashSet[N];

        for (int r =0; r<N; r++){
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            box[r] = new HashSet<Character>();
        }
        for (int r=0; r<N; r++){
            for(int c=0;c<N; c++){
                char val = board[r][c];

                //Check if the posn is already filled with number

                if(val == '.'){
                    continue;
                }
                //check the rows
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);

                //check the column
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);

                //check the box
                int idx = (r/3)*3 + c/3;
                if(box[idx].contains(val)){
                    return false;
                }

                box[idx].add(val);
            }
        }
        return true;
    }
}
