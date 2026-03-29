class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean monoInc = true;
        boolean monoDec = true;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                monoInc = false;
            }
            if(nums[i]<nums[i+1]){
                monoDec = false;
            }
        }
        
        return (monoInc || monoDec);
    }
}