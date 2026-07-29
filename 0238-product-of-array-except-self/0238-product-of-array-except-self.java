class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preprod = new int[nums.length];
        preprod[0] = 1;
        for(int i=1; i<nums.length; i++){
            preprod[i] = preprod[i-1]*nums[i-1];
        }
        int suff = 1;
        for(int i=nums.length-2; i>=0; i--){
            suff *= nums[i+1];
            preprod[i] *= suff;
        }
        return preprod;
    }
}