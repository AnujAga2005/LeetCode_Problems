class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length==0) return 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                pq.add(matrix[i][j]);
            }
        }
        for(int i=1; i<k; i++){
            pq.poll();
        }
        return pq.poll();
        
    }
}