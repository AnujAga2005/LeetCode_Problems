class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n=nums.length;
        int start=-1;
        int end =-1;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>right)
            {
                start=end=i;
                continue;
            }

            if(nums[i]>=left)
            {
                end=i;
            }

            ans=ans+(end-start);
     
        }
        return ans;
    }
}