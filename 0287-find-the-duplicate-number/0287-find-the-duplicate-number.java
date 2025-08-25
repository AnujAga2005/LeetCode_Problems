class Solution {
    public int findDuplicate(int[] nums) {
        Set hm = new HashSet();
        for(int i=0; i<nums.length; i++){
            if(!hm.add(nums[i])){
                return nums[i];
            }else{
                hm.add(nums[i]);
            }
        }
        return 0;
    }
}