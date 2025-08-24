import java.util.ArrayList;
import java.util.List;
class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> arrOfI = new ArrayList<>();
        List<Integer> arrOfJ = new ArrayList<>();
        int k=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    arrOfI.add(i);
                    arrOfJ.add(j);
                    k++;
                }
            }
        }
        for(int i=0; i<k; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[arrOfI.get(i)][j]=0;
            }
            
        }
        for(int j=0; j<k; j++){
            for(int i=0; i<matrix.length; i++){
                matrix[i][arrOfJ.get(j)]=0;
            }
            
        }
        
    }
}