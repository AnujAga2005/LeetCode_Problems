class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for(int i=rows-1; i>=0; i--){
            for(int j=columns-1; j>=0; j--){
                if(grid[i][j]<0){
                    count++;
                }
                if(grid[i][j]>=0){
                    break;
                }
            }

        }
        return count;
    }
}