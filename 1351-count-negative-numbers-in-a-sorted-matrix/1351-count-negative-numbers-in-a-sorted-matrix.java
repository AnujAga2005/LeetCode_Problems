class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        int r = 0;
        int c = columns-1;
        while(r<rows && c>=0){
            if(grid[r][c]<0){
                count+= rows-r;
                c--;
            }else{
                r++;
            }
        }
        return count;
    }
}