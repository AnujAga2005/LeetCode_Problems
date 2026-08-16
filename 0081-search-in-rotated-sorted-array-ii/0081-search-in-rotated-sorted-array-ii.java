class Solution {
    public boolean search(int[] nums, int target) {
        int si=0;
        int ei = nums.length-1;
        while(si<=ei){
            int mid = si+ (ei-si)/2;
            if(nums[mid] == target ){
                return true;
            }else if (nums[mid]==nums[si] && nums[mid]==nums[ei]){
                si++;
                ei--;
            }else if(nums[si]<=nums[mid]){
                if(nums[mid]>target && nums[si]<=target){
                    ei = mid;
                }else{
                    si = mid+1;
                }
            }else{
                if(nums[mid]<target && nums[ei]>=target){
                    si = mid+1;
                }
                else{
                    ei = mid;
                }
            }
        }
        return false;
    }
}