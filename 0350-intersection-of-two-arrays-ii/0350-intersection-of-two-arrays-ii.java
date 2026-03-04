class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> part = new ArrayList<Integer>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num: nums2){
            if(map.containsKey(num) && map.get(num)>0){
                part.add(num);
                map.put(num, map.get(num)-1);
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