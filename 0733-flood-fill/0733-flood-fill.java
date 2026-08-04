class Solution {
    public boolean isSafe(int r, int c, int m, int n){
        return (r>=0 && r<n && c>=0 && c<m);
    }

    public void dfs(int r, int c, int m, int n, int ori , int color, int[][] image){
        image[r][c] = color;
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
        for(int k =0; k<4; k++){
            int newr = r + dir[k][0];
            int newc = c + dir[k][1];

            if(isSafe(newr, newc , m , n) && image[newr][newc]==ori){
                dfs(newr,newc,m,n,ori,color,image);
            }
        }
                
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ori = image[sr][sc];
        if(ori == color) return image;
        int n = image.length;
        int m = image[0].length;
        dfs(sr,sc,m,n,ori,color,image);
        return image;
        
        
        }
}