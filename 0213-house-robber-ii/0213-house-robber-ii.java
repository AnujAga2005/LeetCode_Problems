class Solution {
    public int robOne(int[] num){
        if(num.length==0) return 0;
        else if(num.length<2) return num[0];
        int[] dp = new int[num.length];
        dp[0] = num[0];
        dp[1] = Math.max(num[0],num[1]);
        for(int i=2; i<num.length; i++){
            dp[i] = Math.max(dp[i-2]+num[i],dp[i-1]);
        }
        return dp[num.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        else if(nums.length<2) return nums[0];
        int[] skipFirst = new int[nums.length-1];
        int[] skipLast = new int[nums.length-1];
        for(int i=0; i<nums.length-1; i++){
            skipFirst[i] = nums[i];
            skipLast[i] = nums[i+1];
        }
        int s1 = robOne(skipFirst);
        int s2 = robOne(skipLast);
        return Math.max(s1,s2);
        
    }
}