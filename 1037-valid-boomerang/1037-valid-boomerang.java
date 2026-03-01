class Solution {
    public boolean isBoomerang(int[][] points) {

        int left = (points[1][0] - points[0][0])*(points[2][1]-points[0][1]);
        int right = (points[2][0] - points[0][0])*(points[1][1]-points[0][1]);
        if(right == left) return false;
        return true;        
    }
}