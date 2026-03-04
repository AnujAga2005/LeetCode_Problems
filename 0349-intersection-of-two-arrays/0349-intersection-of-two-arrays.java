class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> part = new ArrayList<Integer>();
        for(int num: nums1){
            set.add(num);
        }
        for(int num: nums2){
            if(set.contains(num)){
                part.add(num);
                set.remove(num);
            }
        }
        int size = part.size();
        int[] ans = new int[size];
        for(int i=0; i<size; i++){
            ans[i] = part.get(i);
        }
        return ans;
        
    }
}