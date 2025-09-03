import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Comparator;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int key: hm.keySet()){
            pq.add(new int[]{key,hm.getOrDefault(key,0)});
        }

        for(int i=0; i<k; i++){
            ans[i] = pq.remove()[0];
        }
        return ans;
        
    }
}