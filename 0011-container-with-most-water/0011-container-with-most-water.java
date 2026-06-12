class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int currWater = 0;
        int maxWater = 0;
        while(left<right){
            currWater = Math.min(height[left],height[right])*Math.abs(right-left);
            maxWater = Math.max(currWater,maxWater);
            if(height[left]>height[right]){
                right--;
            }else if(height[left]<height[right]){
                left++;
            }else{
                left++;
                right--;
            }
        }
        return maxWater;
        
    }
}