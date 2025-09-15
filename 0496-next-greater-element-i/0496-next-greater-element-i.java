class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            hm.put(nums2[i],i);
        }
        for(int i=0; i<nums1.length; i++){
            for(int j=hm.get(nums1[i])+1; j<nums2.length; j++){
                if(nums2[j]>nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        for(int i=0; i<ans.length; i++){
            if(ans[i]==0){
                ans[i] = -1;
            }
        }
        return ans;
    }
}