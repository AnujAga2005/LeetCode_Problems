class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums1.length];
        for(int i=0; i<nums2.length; i++){
            while(!s.isEmpty() && s.peek()<nums2[i]){
                hm.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }

        for(int i: nums1){
            if(!hm.containsKey(i)){
                hm.put(i,-1);
            }
        }
        int k = 0;
        for(int i : nums1){
            res[k++] = hm.get(i);
        }
        return res;
        
    }
}