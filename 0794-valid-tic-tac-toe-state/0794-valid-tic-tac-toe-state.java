class Solution {
    public boolean validTicTacToe(String[] board) {
        int numberOfX = 0;
        int numberOfO = 0;
        int[] row1 = new int[3];
        int[] row2 = new int[3];
        int[] row3 = new int[3];
        int one = -1;
        int two = -1;
        int three = -1;
        boolean XWins = false;
        boolean OWins = false;
        for(char c: board[0].toCharArray()){
            one++;
            if(c=='X'){
                row1[one] = 1;
                numberOfX++;
            }else if(c== ' '){
                row1[one] = -1;
            }else{
                row1[one] = 0;
                numberOfO++;
            }
        }

        for(char c: board[1].toCharArray()){
            two++;
            if(c=='X'){
                row2[two] = 1;
                numberOfX++;
            }else if(c== ' '){
                row2[two] = -1;
            }else{
                row2[two] = 0;
                numberOfO++;
            }
        }

        for(char c: board[2].toCharArray()){
            three++;
            if(c=='X'){
                row3[three] = 1;
                numberOfX++;
            }else if(c== ' '){
                row3[three] = -1;
            }else{
                row3[three] = 0;
                numberOfO++;
            }
        }

        if(row1[0]==1 && row1[1]==1 && row1[2]==1) XWins = true;
        if(row2[0]==1 && row2[1]==1 && row2[2]==1) XWins = true;
        if(row3[0]==1 && row3[1]==1 && row3[2]==1) XWins = true;
        if(row1[0]==0 && row1[1]==0 && row1[2]==0) OWins = true;
        if(row2[0]==0 && row2[1]==0 && row2[2]==0) OWins = true;
        if(row3[0]==0 && row3[1]==0 && row3[2]==0) OWins = true;

        if(row1[0]==1 && row2[0]==1 && row3[0]==1) XWins = true;
        if(row1[1]==1 && row2[1]==1 && row3[1]==1) XWins = true;
        if(row1[2]==1 && row2[2]==1 && row3[2]==1) XWins = true;
        if(row1[0]==0 && row2[0]==0 && row3[0]==0) OWins = true;
        if(row1[1]==0 && row2[1]==0 && row3[1]==0) OWins = true;
        if(row1[2]==0 && row2[2]==0 && row3[2]==0) OWins = true;

        if(row1[0]==1 && row2[1]==1 && row3[2]==1) XWins = true;
        if(row1[0]==0 && row2[1]==0 && row3[2]==0) OWins = true;
        if(row3[0]==1 && row2[1]==1 && row1[2]==1) XWins = true;
        if(row3[0]==0 && row2[1]==0 && row1[2]==0) OWins = true;

        if(XWins && numberOfX==numberOfO+1 && !OWins) return true;
        if(OWins && numberOfX==numberOfO && !XWins) return true;

        if (!XWins && !OWins) {
            if (numberOfX == numberOfO) return true;
            if (numberOfX == numberOfO + 1) return true;
        }

        return false;
        
    }
}