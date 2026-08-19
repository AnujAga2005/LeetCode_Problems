class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            boolean changed = false;
            int j=(i+1)%n;
            while(j!=i){
                if(nums[i]<nums[j]){
                    ans[i] = nums[j];
                    changed = true;
                    break;
                }
                j = (j+1) % n;
            }
            if(!changed){
                ans[i] = -1;
            }
        }
        return ans;
    }
}