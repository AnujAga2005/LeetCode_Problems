class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0){
            return "";
        }
        if(nums.length==1){
            StringBuilder one = new StringBuilder();
            one.append(nums[0]);
            return one.toString();
        }
        Arrays.sort(nums);
        if(nums[nums.length-1]==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                first = new StringBuilder();
                second = new StringBuilder();
                first.append(nums[i]);
                first.append(nums[j]);
                second.append(nums[j]);
                second.append(nums[i]);
                if(first.toString().compareTo(second.toString())<0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp; 
            }
            }
        }
        for(int i=0; i<nums.length; i++){
            sb.append(nums[i]);
        }
        return sb.toString();
        
    }
}