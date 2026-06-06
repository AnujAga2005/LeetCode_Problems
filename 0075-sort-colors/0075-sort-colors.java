class Solution {
    public void sortColors(int[] nums) {
        int reds = 0;
        int whites = 0;
        int blues = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                reds++;
            }
            if(nums[i]==1){
                whites++;
            }
            if(nums[i]==2){
                blues++;
            }
        }
        int k=0;
        for(int i=0;i<reds;i++){
            nums[k++] = 0;
        }
        for(int i=0;i<whites;i++){
            nums[k++] = 1;
        }
        for(int i=0;i<blues;i++){
            nums[k++] = 2;
        }

        
        
        }
        
    
}