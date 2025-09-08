import java.util.HashMap;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int l = 0; l <= nums.length-1 ; l++) {
            if (hm.containsKey(nums[l])) {
                int prevIdx = hm.get(nums[l]);
                if (l - prevIdx <= k) {
                    return true;
                }
            }
            hm.put(nums[l], l);
        }
        return false;
    }
}