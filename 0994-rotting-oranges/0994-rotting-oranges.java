class Solution {
    public void dfs(int[][] grid, int[][] time, int i ,int j ,int currentTime){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || currentTime>=time[i][j] || grid[i][j]==0) return;
        time[i][j] = currentTime;
        dfs(grid, time , i+1, j, currentTime+1);
        dfs(grid, time , i-1, j, currentTime+1);
        dfs(grid, time , i, j+1, currentTime+1);
        dfs(grid, time , i, j-1, currentTime+1);
    }
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0) return -1;
        int[][] time = new int[grid.length][grid[0].length];
        for(int i =0 ; i<grid.length; i++){
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==2) dfs(grid,time,i,j,0);
            }
        }
        int timeReq = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    timeReq = Math.max(timeReq, time[i][j]);
                }
            }
        }
        return timeReq;
        
    }
}