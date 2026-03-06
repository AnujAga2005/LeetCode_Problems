class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        while(area%W!=0){
            W--;
        }
        int L = area/W;
        int[] output = new int[2];
        output[0] = L;
        output[1] = W;
        return output;
    }
}