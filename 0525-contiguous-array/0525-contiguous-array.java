class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for(int i=0;i<nums.length; i++){
            if(nums[i]==0) nums[i] = -1;
        }
        int sum = 0;
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            int length = 0;
            sum +=nums[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }else{
                length = i-hm.get(sum);
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}