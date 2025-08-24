class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0 ;
        int endRow = matrix.length-1;
        while(startRow<endRow){
            for(int i=0; i<m; i++){
                int temp = matrix[startRow][i];
                matrix[startRow][i] = matrix[endRow][i];
                matrix[endRow][i] = temp;
            }
            startRow++;
            endRow--;
        }
        for(int i=0; i<m; i++){
            for(int k=i+1; k<m; k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
}