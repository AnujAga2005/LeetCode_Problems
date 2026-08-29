class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        int m =0;
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int k : hm.keySet()){
            if(hm.get(k)==1){
                ans[m++] = k;
            }
        }
        return ans;
    }
}