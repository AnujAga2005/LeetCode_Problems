class Solution {
    public boolean isValidSudoku(char[][] board) {
            Set hm = new HashSet();
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){ 
                    char ch = board[i][j];
                    if(ch!='.'){
                        if(!hm.add(ch+"in row"+i) ||
                            !hm.add(ch+"in column"+j) ||
                            !hm.add(ch+"in block"+ i/3 + '-' + j/3)
                        ){
                            return false;
                        }
                    }
                }
            }
        return true;
    }
}