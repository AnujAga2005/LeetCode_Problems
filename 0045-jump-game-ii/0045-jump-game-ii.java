class Solution {
    public int jump(int[] nums) {
        int dest = nums.length-1;
        int jumps = 0;
        int coverage = 0, lastJumpIdx=0;
        if(nums.length==1) return 0;
        for(int i=0; i<nums.length; i++){
            coverage = Math.max(coverage, i+nums[i]);
            if(i==lastJumpIdx){
                lastJumpIdx = coverage;
                jumps++;
                if(coverage>=dest) return jumps;
            }
            
        }
        return jumps;
    }
}