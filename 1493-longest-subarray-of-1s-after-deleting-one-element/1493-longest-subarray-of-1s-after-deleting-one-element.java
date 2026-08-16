class Solution {
    public int longestSubarray(int[] nums) {
        int countZero=0;
        int i =0;
        int result = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0){
                countZero++;
            }
            while (countZero > 1) {
                if (nums[i] == 0) {
                    countZero--;
                }
                i++;
            }
            result = Math.max(result,j-i);
        }
        return result;
    }
}