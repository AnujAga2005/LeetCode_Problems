class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int actualSum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            actualSum += i+1;
        }
        return Math.abs(actualSum-sum);
        
    }
}